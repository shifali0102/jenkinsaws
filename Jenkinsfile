pipeline {
    agent any
    tools {
        maven 'maven1' 
    }
    stages {
        	stage('Checkout Stage'){
           		steps{
                  		git url: 'https://github.com/shifali0102/jenkinsaws.git'
				sh 'mvn --version'
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
           	 
	    	stage('Deploy2')
			{
			  steps{
					sh 'mvn deploy'
				}
			}
	    stage('Build') {
			steps {
			    sh 'docker build -t image:0.1 .'
			}
		    }

    }
}
