pipeline {
    agent any
    stages {
        stage('Testing') {
            steps {
                script {
                    withPythonEnv('python2.7') {
                        sh """
                            python -V && which virtualenv && ls
                        """
                    }
                }
            }
        }
    }
}