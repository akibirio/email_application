pipeline {
  agent any
  stages {
    stage('Log Ant version info') {
      steps {
        sh 'ant -version'
      }
    }
    stage('GitHub Jenkins Ant Build') {
      steps {
        git 'https://github.com/akibirio/email_application.git'
        sh 'ant clean compile test package war'
      }
    }
  }
}