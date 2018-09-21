// cerner_2^5_2018
// Few interesting basic features in golang.

//  #### 1
// Use Go Printf argument twice with adverbs

fmt.Printf("Hello %s, nice to meet you %s", "Lauren", "Harry")
// Prints --> Hello Lauren, nice to meet you Harry
fmt.Printf("Hello %s, nice to meet you %[1]s", "Lauren")
// Prints --> Hello Lauren, nice to meet you Lauren

// #### 2
// In Go, NaN does not equal NaN

// It’s false, it returns false.
fmt.Println(math.NaN == math.NaN)
// Don’t fret though, there is a function that can tell you whether or not a value is NaN.
fmt.Println(math.IsNaN(math.Log(-1.0)))
// The above returns true and all is well with the world. Don’t use math.NaN as a sentinel value, it does not work, use the math.IsNaN function.

// #### 3
// `new` returns a pointer, not a value

p := new(int)
print(*p)
// The above returns 0.

// #### 4
// Access Go Docs Offline
$ godoc -http=:6060

// #### 5
// Go iota

const (
    foo = iota  // foo == 0
    bar = iota  // bar == 1
    baz = iota  // baz == 2
)
// Anytime const is invoked, the counter resets.
