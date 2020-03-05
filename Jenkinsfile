pipeline {
    agent any

    stages {
        stage('Checkout Stage'){
           		steps{
                  		git url: 'https://github.com/Shifali-Srivastava/my-app.git'
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
