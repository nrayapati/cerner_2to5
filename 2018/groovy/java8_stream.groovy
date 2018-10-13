// cerner_2^5_2018
// Groovy 2.5.0 adds several methods to make working with Java 8 Streams more Groovy. First of all the methods toList and toSet are added to the Stream class. These methods will convert the stream to a List and Set using the Stream.collect method with Collectors.toList and Collectors.toSet as argument. Furthermore we can convert any array object to a Stream using the stream method that is added to all array objects.

def sample = ['Groovy', 'Gradle', 'Grails', 'Spock'] as String[]
 
def result = sample.stream()  // Use stream() on array objects
                   .filter { s -> s.startsWith('Gr') }
                   .map { s -> s.toUpperCase() }
                   .toList()  // toList() added to Stream by Groovy
                    
assert result == ['GROOVY', 'GRADLE', 'GRAILS']
 
 
def numbers = [1, 2, 3, 1, 4, 2, 5, 6] as int[]
 
def even = numbers.stream()  // Use stream() on array objects
                  .filter { n -> n % 2 == 0 }
                  .toSet()  // toSet() added to Stream
                   
assert even == [2, 4, 6] as Set