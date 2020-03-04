pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'docker build -t image:0.1 .'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing1..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
