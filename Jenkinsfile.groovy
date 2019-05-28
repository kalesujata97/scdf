node
{
  stage("Automate SCDF")
  {
      bat '''copy C:\\Programs\\*.jar C:\\Apps\\Jenkins\\workflow-libs'''
       bat ''' cd C:\\Apps\\Jenkins\\workflow-libs && java -jar spring-cloud-dataflow-shell-2.0.1.RELEASE.jar  && dataflow config server http://35.197.24.166'''
  }
}
