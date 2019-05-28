node
{
  stage("Automate SCDF")
  {
      bat '''copy C:\\Programs\\*.jar C:\\Apps\\Jenkins\\workflow-libs'''
       bat ''' cd C:\\Apps\\Jenkins\\workflow-libs && java -jar spring-cloud-dataflow-shell-2.0.1.RELEASE.jar'''
  }
}
