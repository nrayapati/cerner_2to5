// cerner_2^5_2018

// The Google Guava libraries contains useful utility classes and methods. If we want to convert between ASCII case conventions we can use the CaseFormat class. The class defines constants for upper and lower case CamelCase, upper and lower case hyphenated and upper case underscore. This means we can convert UPPER_VALUE to upper-value with a simple line of code.

import static com.google.common.base.CaseFormat.*;
 
assert LOWER_CAMEL.to(UPPER_UNDERSCORE, "lowerCase").equals("LOWER_CASE");
assert LOWER_HYPHEN.to(LOWER_UNDERSCORE, "manual-index").equals("manual_index");
assert UPPER_CAMEL.to(LOWER_UNDERSCORE, "UpperCase").equals("upper_case")