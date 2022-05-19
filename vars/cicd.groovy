def newGit(repo)
{
  git "${repo}" 
}

def newMaven()
{
  sh 'mvn package'
}

def newDeploy(ip,contextpath)
{
   sh "scp /home/ubuntu/.jenkins/workspace/DeclarativePipelinewithSharedLibrarires/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${contextpath}.war" 
}
