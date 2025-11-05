# Deployment Instructions

1. Build kotlin app

   ```bash
   ./gradlew clean build
   ```

2. Build Docker image (builds the app inside container):
   ```bash
   docker build -f Dockerfile -t kotlin-app:latest .
   ```

3. Deploy to Kubernetes:
   ```bash
   kubectl apply -f k8s/postgres-secret.yaml
   kubectl apply -f k8s/postgres.yaml
   kubectl apply -f k8s/deployment.yaml
   kubectl apply -f k8s/service.yaml
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
kubectl delete -f k8s/
```

## Other Versions

This is the finished version of the tutorial. You can view other versions by navigating to different branches:

- [starter branch](https://github.com/mikeyny/kotlin-kubernetes/tree/starter)
- [config-maps branch](https://github.com/mikeyny/kotlin-kubernetes/tree/config-maps)
- [ingress branch](https://github.com/mikeyny/kotlin-kubernetes/tree/ingress)