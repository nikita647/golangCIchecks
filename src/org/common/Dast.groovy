package org.common

def call(String Url_ZAP_Attack , String ZAP_report ) {
  stage('zap scanning') {
    
     sh 'zap.sh -cmd -quickurl ${Url_ZAP_Attack} -quickprogress -port 8090 -quickout ${ZAP_report}'

  }
}
