package org.template

import org.common.*
import org.golang.*
import org.genric.*
 
def call (String branch = 'main', String repoUrl, String gitPassword, String reportName, String reportFile) {
 clean = new cleanworkspace()
 clone = new gitclone()
 compilation = new codeCompilation()
 credScanning = new  cred_scanning()
 licenceScanning = new LicenceScanning()
 bugAnalysis = new bugAnalysis()
 StaticCodeAnalysis = new static_code_analysis()
 Dependency = new DependencyScanning()

clean.call()
clone.call(branch, repoUrl, gitPassword)
compilation.call()
credScanning(reportName)
licenceScanning(reportFile)
bugAnalysis()
StaticCodeAnalysis()
Dependency()
  
}

