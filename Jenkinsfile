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
			    sh 'docker build -t my-app:0.1 .'
			    withDockerRegistry([ credentialsId: "dockerhub", url: "" ]) {
      				sh 'docker push shifalisri0102/my-app:0.1'
			    }
			}
		    }
	   	

    }
}
