pipeline {
    agent none

    tools {
        jdk "JAVA_HOME"
        maven "M2_HOME"
    }
    
    stages {
        stage('Code Clone') {
            agent { 
                label 'automation_and_continuous_delivery'
            }
            steps {
                git branch: 'main', url: 'https://github.com/corporealsoul/CLI-Interactive-Maven-WAR-2024.git'
            }
        }
        stage('Code Build') {
            agent { 
                label 'automation_and_continuous_delivery'
            }
            steps {
                sh "mvn clean validate compile test package verify install"
            }
        }
        stage('Code Quality') {
            agent { 
                label 'automation_and_continuous_delivery'
            }
            steps {
                script {
                    def scannerHome = tool 'sonar-scanner'
                }
                withSonarQubeEnv(installationName: 'sonar-scanner') {
                    sh '''$SONAR_SCANNER_HOME/bin/sonar-scanner \
                        -Dsonar.projectName=sonar-project \
                        -Dsonar.java.binaries=. \
                        -Dsonar.projectKey=sonar-token'''
                }
            }
        }
    }
}
