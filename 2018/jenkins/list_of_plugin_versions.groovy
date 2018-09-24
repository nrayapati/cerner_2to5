// cerner_2^5_2018
// List of Jenkins Plugin versions - Very useful for Jenkins admin who are trying to create docker image with plugins.txt file.
// Run this on Script Console.

Jenkins.instance.pluginManager.plugins.each{
  plugin ->
    println ("${plugin.getDisplayName()} (${plugin.getShortName()}): ${plugin.getVersion()}")
}
