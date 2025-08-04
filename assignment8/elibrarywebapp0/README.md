### Step1: create image docker and publish

```bas
export $(cat .env | xargs) 

docker buildx build --platform linux/amd64,linux/arm64 \
-t leone2015/elibrarywebapp0-app:1.0.0 --push .
```

## Step 2: Cluster creation on EKS


```bash
eksctl create cluster --name elibrarywebappk8s --version 1.33 --nodes=1 --node-type=t2.small --region us-east-1
```

```bash
aws eks --region us-east-1 update-kubeconfig --name elibrarywebappk8s   
```

1. Cluster connection:

   ```bash
   kubectl config current-context
   ```

2. Applied resources:

   ```
   kubectl apply -f .
   ```

3. State verification :

   ```
   kubectl get pods
   kubectl get svc
   ```

4. EKS:  wait until LoadBalancer gets Public IP (1–2 min):

   ```
   kubectl get svc elibrarywebapp-service
   ```



![Screenshot 2025-08-03 at 7.36.37 PM](done.png)

### EKS validation running services ![Screenshot 2025-08-03 at 7.36.56 PM](proof1.png)

### EKS external-ip![Screenshot 2025-08-03 at 7.37.02 PM](proof2.png)

#### EKS cluster deleted

![Screenshot 2025-08-03 at 8.12.43 PM](eks_deleted.png)

