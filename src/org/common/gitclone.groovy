package org.common
def call(String branch = 'main', String repoUrl, String gitPassword='' ) {
        stage('cloning repositories') {
        checkout([$class: 'GitSCM',
                    branches: [[name: "*/${branch}"]],
                    userRemoteConfigs: [[url: repoUrl , credentialsId: gitPassword ]]
                    ])
        }
}
