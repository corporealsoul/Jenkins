pipeline {
    agent none

    stages {
        stage('Code Clone') {
            agent { 
                label 'automation'
            }
            steps {
                git branch: 'main', url: 'https://github.com/corporealsoul/CLI-Interactive-Maven-WAR-2024.git'
            }
        }
        stage('Code Build') {
            agent { 
                label 'automation'
            }
            steps {
                sh "mvn clean validate compile test package verify install"
            }
        }
        stage('Code Scan') {
            agent { 
                label 'automation'
            }
            steps {
                dependencyCheck additionalArguments: '--scan ./ ', odcInstallation: 'Dependency-Check'
                dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
            }
        }
    }
}