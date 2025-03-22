package org.genric

def call(String reportFile) {
    stage ('Licence Scanning'){
        withCredentials([string(credentialsId: 'fossa_api_token', variable: 'FOSSA_KEY')]) { 
                    sh """
                    export FOSSA_API_KEY=${FOSSA_KEY}
                    fossa analyze
                    fossa report --format html attribution >${reportFile}
                    """
            }
    }
}
