
package org.golang

def call() {
  stage('Dependency Scanning') {

sh '${HOME}/dependency-check/bin/dependency-check.sh --project "." --scan . --format HTML --out security-reports'
    
  }
}
