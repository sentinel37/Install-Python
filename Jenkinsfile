pipeline {
    agent any
    stages {
        stage('Testing') {
            steps {
                script {
                    withPythonEnv('/usr/bin/python2.7') {
                        sh """
                            python -V && which virtualenv && ls
                        """
                    }
                }
            }
        }
    }
}