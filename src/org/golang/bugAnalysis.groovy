
package org.golang

def call() {
  stage('bug Analysis') {
  sh 'mkdir -p reports'
  sh "${HOME}/bin/golangci-lint run ./... --out-format json > reports/Bug-report.json || true"
  }
}
