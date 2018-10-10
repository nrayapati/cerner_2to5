// cerner_2^5_2018
// See More Info About Downloading With Grape

import org.apache.commons.lang3.SystemUtils
import static org.apache.commons.lang3.JavaVersion.JAVA_1_8 as Java8
 
@Grab(group='org.apache.commons', module='commons-lang3', version='3.4')
def printInfo() {
    if (SystemUtils.isJavaVersionAtLeast(Java8)) {
        println 'We are ready to use the Stream API in our code.'
    } else {
        println 'We cannot use the Stram API in our code.'
    }
}
 
printInfo()

// $ groovy -Dgroovy.grape.report.downloads=true sample.groovy
// Resolving dependency: org.apache.commons#commons-lang3;3.4 {default=[default]}
// Preparing to download artifact org.apache.commons#commons-lang3;3.4!commons-lang3.jar
// Downloaded 424 Kbytes in 414ms:
//   [SUCCESSFUL ] org.apache.commons#commons-lang3;3.4!commons-lang3.jar (408ms)
// We are ready to use the Stream API in our code.
// $ groovy -Dgroovy.grape.report.downloads=true sample.groovy
// Resolving dependency: org.apache.commons#commons-lang3;3.4 {default=[default]}
// Preparing to download artifact org.apache.commons#commons-lang3;3.4!commons-lang3.jar
// We are ready to use the Stream API in our code.

// Notice that the second time we run the script the logging shows the JAR file is not downloaded. That is because grape use the downloaded file from the USER_HOME/.groovy/grapes directory.

// Written with Groovy 2.4.12.