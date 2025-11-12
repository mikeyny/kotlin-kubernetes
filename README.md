# Kubernetes Made Simple: A Guide for JVM Developers

This repository contains the companion code for the "Kubernetes Made Simple: A Guide for JVM Developers" article, demonstrating how to deploy a Kotlin Spring Boot application to Kubernetes.

## About This Project

This project provides a hands-on, practical example of deploying JVM-based microservices on Kubernetes. It showcases a complete workflow from containerization to deployment, covering essential Kubernetes concepts in a way that's approachable for Java and Kotlin developers.

### What You'll Find Here

- **Containerization with Docker**: A production-ready Dockerfile for packaging Kotlin/Spring Boot applications
- **Kubernetes Fundamentals**: Working examples of Deployments, Services, and Pods
- **Configuration Management**: Using ConfigMaps for application settings and Secrets for sensitive data
- **Database Integration**: PostgreSQL deployment on Kubernetes with persistent storage
- **Advanced Routing**: Ingress configuration with canary deployments for progressive rollouts

### Technologies Used

- **Kotlin** - A modern, expressive JVM language fully interoperable with Java
- **Spring Boot** - The popular framework for building production-grade applications
- **Kubernetes** - Container orchestration platform for deploying and managing microservices
- **Docker** - Containerization platform for packaging applications
- **PostgreSQL** - Relational database for persistent data storage
- **Minikube** - Local Kubernetes environment for development and testing

This project demonstrates how Kotlin's concise syntax, null safety, and seamless Spring integration make it an excellent choice for building cloud-native microservices.

## Deployment Instructions

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