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
            stage('Build') {
                steps {
                    sh 'docker build -t image:0.1 .'
                }
            }

    }
}
