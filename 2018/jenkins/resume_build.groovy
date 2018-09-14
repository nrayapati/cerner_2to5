import jenkins.model.*;

// Init hook to resume Jenkins builds.
// cerner_2^5_2018

Jenkins.instance.doCancelQuietDown()
