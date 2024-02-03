pipeline {
    // small change
    agent any

    tools {
        gradle "Gradle-8.6"
    }

    stages {
        stage('Clone repository') {
            steps {
                git branch: 'main', url: 'https://github.com/jchuot/JUnit.git'
            }
        }
        stage('Build gradle') {
            steps {
                sh 'gradle clean build'
            }
        }
        stage('Test gradle') {
            steps {
                sh 'gradle test'
            }
        }
    }
}