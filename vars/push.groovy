def call(String project, String imagetag, String dockerhubuser){
   echo "Pushing the image to DockerHub"
                withCredentials([usernamePassword('credentialsId':"dockerhubcred",
                usernameVariable:"DOCKER_USER",
                passwordVariable:"DOCKER_PASS")]){
                
                sh "docker login -u ${env.DOCKER_USER} -p ${env.DOCKER_PASS} "
                sh "docker image tag notes-app:latest ${env.DOCKER_USER}/notes-app:latest"
                sh "docker push ${env.DOCKER_USER}/notes-app:latest"
                }
}
