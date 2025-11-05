# Deployment Instructions

1. Enable minikube ingress:

   ```bash
   minikube addons enable ingress
   ```

2. Deploy to Kubernetes:
   ```bash
   kubectl apply -f k8s/postgres-secret.yaml
   kubectl apply -f k8s/postgres.yaml
   kubectl apply -f k8s/deployment.yaml
   kubectl apply -f k8s/service.yaml
   kubectl apply -f k8s/services.yaml
   kubectl apply -f ingress.yaml
   kubectl apply -f ingress-canary.yaml
   ```

3. Check deployment status:
   ```bash
   kubectl get pods
   kubectl get services
   ```

4. Test the application:
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
- [database branch](https://github.com/mikeyny/kotlin-kubernetes)