package org.genric

def call(String FOSSA_KEY, String reportFile) {
    stage ('Licence Scanning'){
        withCredentials([string(credentialsId: 'scripted_fosssa_api_key', variable: 'FOSSA_KEY')]) { 
                    sh """
                    export FOSSA_API_KEY=${FOSSA_KEY}
                    fossa analyze
                    fossa report --format html attribution >${reportFile}
                    """
            }
    }
}
