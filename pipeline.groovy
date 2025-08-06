pipeline{
    agent any
    stages{
        stage("code"){
            steps{
                echo "gitHub Url: https://github.com/Kondareddy10/assignment-1.git"
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