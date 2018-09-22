// cerner_2^5_2018
// New pipeline jobs are not responsive few times, it can't be killed by clicking abort/kill or all the option available on the build page, then we can the following script to kill it.
// Release/ReleaseProject -> folder/jobName
// 400 is job Id.
// 'Aborting build' is message would show up on the Job.
Jenkins.instance.getItemByFullName("Release/ReleaseProject").getBuildByNumber(400).finish(hudson.model.Result.ABORTED, new java.io.IOException("Aborting build"));

// If you still see a zombie process running after a restart of Jenkins, you can delete the entire job to kill those processes but may loose the history here. 
Jenkins.instance.getItemByFullName("Release/ReleaseProject").getBuildByNumber(400).delete()