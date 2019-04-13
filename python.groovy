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
    }
}