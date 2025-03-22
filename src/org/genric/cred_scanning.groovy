package org.genric

def call(String reportName) {
    stage ('cred Scanning'){
        sh "gitleaks detect -r ${reportName}"
    }
}
