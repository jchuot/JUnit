pipeline {
    // small change 8
    agent any

    tools {
        gradle "Gradle-8.6"
    }

    stages {
        stage('Build gradle') {
            steps {
                git branch: 'main', url: 'https://github.com/jchuot/JUnit.git'
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