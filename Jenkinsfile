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
	    	stage('Testing Stage'){
	  		steps{
		  		sh 'mvn test'
				 }
			}
	    		
		 stage('Package'){
          		steps{
				sh 'mvn war:war'
			}
		  }
	   	

    }
}
