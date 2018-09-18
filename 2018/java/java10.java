// Most interesting features in Java 10. cerner_2^5_2018

// ##### JEP-286
// http://openjdk.java.net/jeps/286

// Something that is new in Java 10 and perhaps the most interesting feature,
// at least from a coding perspective, is that the language attempts to improve
// the developer’s experience by removing some of the strict type declaration,
// allowing developers to let the compiler infer the type by only using var

var list = new ArrayList<String>(); // infers ArrayList<String>
var stream = list.stream(); // infers Stream<String>

// -----------------------------------------------------------------------------
// ##### JEP-322
// http://openjdk.java.net/jeps/322

// This JEP talks about revising the version string scheme of the Java SE Platform
// and the JDK, as well as the related versioning information, for present and future
// time-based release models for some needed clarifications, with a six-month release model.

// So the March 2018 release was named JDK 10, September 2018 release will be named JDK 11 and so on.
// The Update element will increment one month after the Feature element is incremented,
// so the Oct 2018 Java release will be JDK 11.0.1 and so on.
