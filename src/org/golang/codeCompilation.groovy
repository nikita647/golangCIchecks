package org.golang

def call() {
stage('code compilation') {
echo "Running build go "
sh 'go build main.go'
  }
}
