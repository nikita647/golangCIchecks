package org.common
def call(String branch = 'main', String repoUrl, String gitPassword='' ) {
        checkout([$class: 'GitSCM',
                    branches: [[name: "*/${branch}"]],
                    userRemoteConfigs: [[url: repoUrl , credentialsId: gitPassword ]]
                    ])
}
