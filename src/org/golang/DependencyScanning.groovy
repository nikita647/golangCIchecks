
package org.golang

def call() {
  stage('Dependency Scanning') {

    sh '''
      dependency-check.sh --project "." --scan . --format HTML --out security-reports
  '''
    
  }
}
