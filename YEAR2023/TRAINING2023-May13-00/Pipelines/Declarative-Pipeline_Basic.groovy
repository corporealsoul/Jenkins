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
    }
}