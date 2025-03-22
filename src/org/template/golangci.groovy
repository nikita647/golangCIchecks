package org.template

import org.common.*
import org.golang.*

def call (String branch = 'main', String repoUrl, String gitPassword) {
 clean = new cleanworkspace()
 clone = new gitclone()
 compilation = new codeCompilation()

clean.call()
clone.call(branch, repoUrl, gitPassword)
compilation.call()
  
}

