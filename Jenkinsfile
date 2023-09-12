pipeline { 
    agent any  
    stages { 
        stage('Starting App') { 
            steps { 
               echo 'This is a minimal pipeline.' 
            }
        }
        stage('Build') { 
            steps { 
               sh 'mvn -B -DskipTests clean package' 
            }
        }
    }
}