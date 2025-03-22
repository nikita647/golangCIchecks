package org.template

import org.common.*
import org.golang.*
import org.genric.*
 
def call (String branch = 'main', String repoUrl, String gitPassword, String reportName, String FOSSA_KEY, String reportFile) {
 clean = new cleanworkspace()
 clone = new gitclone()
 compilation = new codeCompilation()
 licenceScanning = new LicenceScanning()
 credScanning = new  cred_scanning()

clean.call()
clone.call(branch, repoUrl, gitPassword)
compilation.call()
credScanning(reportName)
licenceScanning(FOSSA_KEY, reportFile)
  
}

