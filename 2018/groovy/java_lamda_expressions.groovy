// cerner_2^5_2018
// Java 8 introduced lambda expressions we can use for example with the new Java Streams API. The Groovy syntax doesn't support the lambda expressions, but we can rely on closure coersion to use Groovy closures as Java lambda expressions in our code.
// In the following sample we use the Java Streams API. Instead of lambda expressions for the filter and map methods we use Groovy closures. They are automatically transformed to lambda expressions, so it is very easy to use Java streams from Groovy code.

import groovy.transform.*
@Canonical
class Building {
    String name
    int floors
    boolean officeSpace
}
 
// Create Building objects.
def officeSpace = new Building('Initech office', 3, true)
def theOffice = new Building('Wernham Hogg Paper Company', 4, true)
def coffeeShop = new Building('Hunter Green', 1, false)
 
// And add to a list.
def buildings = [officeSpace, theOffice, coffeeShop]
 
// Create a closure which we will use
// later in our code.
def mapBuildingName = { building -> building.name }

// Invoke Java Streams API with lambda methods,
// but we use Groovy closures.
def officeBuildingNames =
    buildings
        .stream() // Get Java streams.
        .filter { building ->
            building.officeSpace && building.floors > 2
        } // 'anonymous' closure.
        .map(mapBuildingName) // Predefined closure.
        .collect()
         
assert officeBuildingNames == ['Initech office', 'Wernham Hogg Paper Company']