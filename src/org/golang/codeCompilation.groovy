package org.golang

def call() {
echo "Running build go "
sh 'go build main.go'
}
