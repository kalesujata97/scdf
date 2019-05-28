node
{
  stage("Automate SCDF")
  {
      bat '''copy C:\\Apps\\Jenkins\\jobs\\Ui-based-maven-app\\workspace\\target\\*.war C:\\Apps\\Jenkins\\workflow-libs'''
      // bat ''' cd C:\\Apps\\Jenkins\\workflow-libs && java -jar spring-cloud-dataflow-shell-2.0.1.RELEASE.jar'''
  }
}
