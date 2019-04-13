pipeline {
    agent any
    stages {
        stage('Testing') {
            steps {
                script {
                    withPythonEnv('/usr/local/src/bin/python2.7') {
                        sh """
                            python -V && which virtualenv && ls
                        """
                    }
                }
            }  
        }
        stage('Testing1') {
            steps {
                script {
                    withPythonEnv('/usr/local/src/bin/python2.7') {
                        sh """
                            python hello.py
                        """
                    }
                }
            }  
        }
    }
}