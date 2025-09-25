# Deployment Instructions

1. Build kotlin app

   ```bash
   (cd demo && ./gradlew clean build)
   ```

2. Build Docker image (builds the app inside container):
   ```bash
   docker build -f demo/Dockerfile -t demo-app:latest .
   ```

3. Deploy to Kubernetes:
   ```bash
   kubectl apply -f deployments/postgres-secret.yaml
   kubectl apply -f deployments/postgres.yaml
   kubectl apply -f deployments/deployment.yaml
   kubectl apply -f deployments/service.yaml
   ```

4. Check deployment status:
   ```bash
   kubectl get pods
   kubectl get services
   ```

5. Test the application:
   ```bash
   minikube service kotlin-app-service
   ```

## Cleanup

```bash
kubectl delete -f deployments/
```