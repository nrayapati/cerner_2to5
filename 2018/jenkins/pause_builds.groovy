import jenkins.model.*;

// Init hook to pause Jenkins builds.
// cerner_2^5_2018

Jenkins.instance.doQuietDown();
