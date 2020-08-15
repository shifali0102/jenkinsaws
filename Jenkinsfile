pipeline {
    agent any
    
    stages {
        	stage('Checkout Stage'){
           		steps{
                  		git url: 'https://github.com/shifali0102/jenkinsaws.git'
			     }
          		}
	        stage('Clean Stage'){
          		 steps{
		      		 sh 'mvn clean'
	       			}
             		}
	       stage('Compile Stage'){
          		 steps{
		      		 sh 'mvn compile'
	       			}
	       }
	    		
		 stage('Package'){
          		steps{
				sh 'mvn war:war'
			}
		  }
	    stage('Build Docker Image' ) {
			steps {
			    sh 'docker build -t shifalisri0102/my-app:0.1 .'
			    withDockerRegistry([ credentialsId: "dockerhub", url: "" ]) {
      				sh 'docker push shifalisri0102/my-app:0.1'
				    
			    }
			}
		    }
	     stage('Using kubernetes'){
		   steps{
	   	withKubeConfig(caCertificate: '', 
			       clusterName: 'devcluster.k8s.local', 
			       contextName: 'devcluster.k8s.local', 
			       credentialsId: 'mykubeconfig', 
			       namespace: '', 
			       serverUrl: ' https://api-devcluster-k8s-local-2a2k6f-803457682.ap-south-1.elb.amazonaws.com') {
    					
			                sh 'kubectl describe svc javaappservice'
			                sh 'curl http://ec2-13-233-17-196.ap-south-1.compute.amazonaws.com:31426/myweb-0.0.5/'
                        }
		   }
	     }

    }
}
