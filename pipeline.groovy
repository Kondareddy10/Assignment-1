pipeline{
    agent any
    stages{
        stage("code"){
            steps{
                echo "This is my code"
            }
        }
        stage("Build"){
            steps{
                echo "build the application"
            }
        }
        stage("tests"){
            steps{
                echo "test the code or application"
            }
        }
        stage("deploy"){
            steps{
                echo "deploy the application"
            }
        }
    }
}