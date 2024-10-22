def call(String projectname, String imagetag, String docker_user){
   sh "docker build -t ${docker_user}/${imagetag}:${imagetag} ."
}
