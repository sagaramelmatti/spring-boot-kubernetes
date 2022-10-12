# spring-boot-kubernetes demo application without Database

Sample project to test and deploy spring boot application in kubernetes.

-------------------------------

*** minikube start

minikube start

-------------------------------
How to run application

eval $(minikube docker-env)

git clone https://github.com/sagaramelmatti/spring-boot-kubernetes.git

cd spring-boot-kubernetes

mvn clean install

---------------------------------------------------
Docker steps: ( it creates Docker image)

docker build -t spring-boot-kubernetes .

docker images ( check if image created )

-----------------------------------------------------------------------------------------
Kubernetes Run

kubectl apply -f deployment.yaml

kubectl get deployments
kubectl get services
kubectl get pods 

** Check if pods running 

kubectl logs <pod id>

** Get minikube ip and port to run application

kubectl get nodes -o wide







kubectl create -f deployment/secrets.yaml
kubectl create -f deployment/mysql-deployment.yaml

    Build application and deploy in kubernetes

mvn clean package
mvn k8s:build k8s:resource k8s:apply
