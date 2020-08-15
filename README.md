# jenkinsaws
creating cluster on AWS

https://medium.com/containermind/how-to-create-a-kubernetes-cluster-on-aws-in-few-minutes-89dda10354f4

1. curl -LO https://github.com/kubernetes/kops/releases/download/$(curl -s https://api.github.com/repos/kubernetes/kops/releases/latest | grep tag_name | cut -d '"' -f 4)/kops-linux-amd64
chmod +x kops-linux-amd64
sudo mv kops-linux-amd64 /usr/local/bin/kops

2. created user with the following permissions :
AmazonEC2FullAccess
AmazonRoute53FullAccess
AmazonS3FullAccess
AmazonVPCFullAccess

3. aws configure
 
 provide the Access Key, Secret Access Key and the AWS region of the IAM user.

4. aws s3api create-bucket --bucket ***** --region *** --create-bucket-configuration LocationConstraint=ap-south-1


5. aws s3api put-bucket-versioning --bucket ***** --versioning-configuration Status=Enabled


6.  export KOPS_CLUSTER_NAME=***
    export KOPS_STATE_STORE=s3://****


Add above code block can be added to the ~/.bash_profile or ~/.profile file depending on the operating system to make them available on all terminal environments.
source ~/.bash_profile

7. kops create cluster \
--node-count=1 \
--node-size=t2.micro \
--zones=**** \
--name=${KOPS_CLUSTER_NAME}

error 
aws ec2 describe-availability-zones --region *****

kops create cluster \
--node-count=1 \
--node-size=t2.micro \
--zones=*****a \
--name=${KOPS_CLUSTER_NAME}

kops get --name devcluster.k8s.local -o yaml

kops create secret --name devcluster.k8s.local sshpublickey admin -i ~/.ssh/id_rsa.pub

kops export kubecfg --name devcluster.k8s.local

sudo kops validate cluster --name devcluster.k8s.local

