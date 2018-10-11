// cerner_2^5_2018
// In functional programming we have the concept of an identity function. An identity function returns the same result as the input of the function. Groovy has a lot of functional paradigms including a identity function. Of course in Groovy's case it is an identity closure. It is defined as a constant in the Closure class: Closure.IDENTITY. If we use this closure we get the same result as the argument we provide.

// Identity closure should return the same value
// as the input.
def identity = { a -> a }
assert identity(42) == 42
assert identity('Groovy rocks!') == 'Groovy rocks!'
 
 
// Groovy adds constant Closure.IDENTITY to
// represent an identity closure:
assert Closure.IDENTITY('Groovy rocks!') == 'Groovy rocks!'
assert Closure.IDENTITY(['Groovy', 'is', 'gr8']) == ['Groovy', 'is', 'gr8']
assert Closure.IDENTITY(a: 1, b: 2, c: 3) == [a: 1, b: 2, c: 3]
 
// With static import we can reference
// the constant identity closure as well.
import static groovy.lang.Closure.IDENTITY
assert IDENTITY(42) == 42
 
 
// Can be useful to create a
// Closure for constant values.
def theAnswer = IDENTITY.curry(42)
assert theAnswer() == 42
 
 
// Useful default for Closure method argument.
// Without default for the transform argument,
// we have to pass two arguments. 
// Now the method accepts a single argument as well.
def transformString(String value, Closure transform = Closure.IDENTITY) {
   transform(value)
}
 
// Use default transform value (Closure.IDENTITY).
assert transformString('hubert') == 'hubert'
 
// Use custom transform Closure argument.
assert transformString('mrhaki') { s -> s.toUpperCase() } == 'MRHAKI'