
package org.golang

def call() {
  stage('static Analysis') {
  sh "mkdir -p reports"
  sh "${HOME}/bin/golangci-lint run ./... --out-format json --timeout 5m>reports/Static-code-analysis-report.json || true"
  }
}
