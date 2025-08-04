```bash
701622287254.dkr.ecr.us-east-1.amazonaws.com/swe/elibrarywebapp0-app:1.0.0
	

docker tag elibrarywebapp0-app leone2015/elibrarywebapp0-app:1.0.0^J
docker push leone2015/elibrarywebapp0-app:1.0.0
aws configure
aws configure^J
eks create-cluster --name elibrary-cluster --role-arn arn:aws:iam::701622287254:role/EKSClusterRole --resources-vpc-config subnetIds=^Jsubnet-0ae87354b3111f26c,securityGroupIds=sg-0401
aws eks create-cluster --name elibrary-cluster --role-arn arn:aws:iam::701622287254:role/EKSClusterRole --resources-vpc-config subnetIds=subnet-0df374b5ba475548a,securityGroupIds=sg-04012a
aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 701622287254.dkr.ecr.us-east-1.amazonaws.com
echo $DB_HOST
docker build -t swe/elibrarywebapp0-app .
docker tag elibrarywebapp0-app 701622287254.dkr.ecr.us-east-1.amazonaws.com/swe/elibrarywebapp0-app:1.0.0
docker push 701622287254.dkr.ecr.us-east-1.amazonaws.com/swe/elibrarywebapp0-app:latest
1h ago docker push 701622287254.dkr.ecr.us-east-1.amazonaws.com/swe/elibrarywebapp0-app:1.0.0
aws eks get-token
brew tap weaveworks/tap
brew install weaveworks/tap/eksctl
eksctl version^J
eksctl create cluster --name elibrarywebappk8s --version 1.33 --nodes=1 --node-type=t2.small --region us-east-1
aws eks --region us-east-1 update-config --name elibrarywebappk8s
aws eks --region us-east-1 update-kubeconfig --name elibrarywebappk8s
kubectl version --client
```

