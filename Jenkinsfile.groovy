node
{
  stage("Automate SCDF")
  {
      bat '''copy C:\\Programs\\*.jar C:\\Apps\\Jenkins\\workflow-libs'''
    checkout([$class: 'GitSCM',
			  branches: [[name: '*/master']],
			  userRemoteConfigs: [
				[url: 'git@github.com/SujataKale97/scdf.git',
				 credentialsId: 'ea4c3770-b2ed-4639-9ffc-cc3e586e454c']
			  ]
			])  
       bat ''' cd C:\\Apps\\Jenkins\\workflow-libs && java -jar spring-cloud-dataflow-shell-2.0.1.RELEASE.jar --spring.shell.commandFile=spring.shell'''
  }
}
