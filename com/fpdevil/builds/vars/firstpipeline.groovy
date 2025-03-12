// Jenkins stages

// Import the Calculator class from the src folder
import com.fpdevil.builds.Calculator

// define a function called `call` that takes a Map paramater
// argument
def call(Map pipelineParams) {
    // create an instance of the Calculator class
    Calculator calculator = new Calculator(this)

    pipeline {
        agent any
        environment {
            // set an environment variable APPLICATION_NAME
            APPLICATION_NAME = "${pipelineParams.appName}"
        }

        stages {
            stage('Build') {
                steps {
                    echo '*** Building the application ***'
                    echo '*** Started build for application "${APPLICATION_NAME}" ***'
                }
            }
            stage('Calculate') {
                steps {
                    echo '*** Calling Calculator from src folder ***'
                    echo '+++ Priniting sum of values +++'
                    // call the add method from the Calculator class
                    script {
                        def sum = calculator.add(11, 12)
                        echo "Sum of 11 and 12 is: ${sum}"
                    }
                }
            }
            stage('Test') {
                steps {
                    echo '*** Testing the project ***'
                }
            }
            stage('DevDeploy') {
                steps {
                    echo '*** Deploying the project to DEV Environment ***'
                }
            }
        }
    }
}