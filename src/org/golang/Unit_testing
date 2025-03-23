package org.golang

def call() {
  stage('Unit testing') {
   sh """
        go mod tidy
        go test ./... -v > unit-test-report.txt
    """
  }
}
