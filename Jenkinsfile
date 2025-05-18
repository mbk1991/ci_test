pipeline {
    agent any
    triggers { pollSCM('* * * * *')}
    stages {
        stage("Compile"){
            steps {
                sh "./gradlew compileJava"
          }
        }
        stage("Unit test"){
            steps {
                sh "./gradlew test"
            }
        }
        stage("Code Coverage"){
            steps {
                sh "./gradlew jacocoTestReport"
                publishHTML (target: [
                    reportDir: 'build/reports/jacoco/test/html',
                    reportFiles: 'index.html',
                    reportName: "JaCoCo Report"
                ])
                sh "./gradlew jacocoTestCoverageVerification"
            }
        }
        stage("Static code analysis") {
            steps {
                sh "./gradlew checkstyleMain"
                publishHTML (target: [
                    reportDir: 'build/reports/checkstyle/',
                    reportFiles: 'mail.html',
                    reportName: "Checkstyle Report"
                ])
            }
        }
    }
    post {
        always {
            mail to: 'mbk1991@naver.com',
            subject: "Complete Pipeline: ${currentBuild.fullDisplayName}",
            body: "Build Completed, please check ${env.BUILD_URL}"
        }
    }
}
