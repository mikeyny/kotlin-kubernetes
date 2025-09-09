# Deployment Instructions

## Why Multi-Stage Docker Build?

**Building inside Docker is better because:**
- **Consistent builds**: Same environment regardless of local machine setup
- **Smaller final image**: Only runtime dependencies in final stage
- **Better caching**: Gradle dependencies cached in separate layer
- **No local Java/Gradle required**: Docker handles all build tools
- **Production-ready**: Eliminates "works on my machine" issues

## Build and Deploy

1. Build Docker image (builds the app inside container):
   ```bash
   docker build -f deployments/Dockerfile -t demo-app:latest .
   ```

2. Deploy to Kubernetes:
   ```bash
   kubectl apply -f deployments/deployment.yaml
   kubectl apply -f deployments/service.yaml
   ```

3. Check deployment status:
   ```bash
   kubectl get pods
   kubectl get services
   ```

4. Test the application:
   ```bash
   kubectl port-forward service/demo-app-service 8080:80
   curl http://localhost:8080/hello
   ```

## Cleanup

```bash
kubectl delete -f deployments/
```