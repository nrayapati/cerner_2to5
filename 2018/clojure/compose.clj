; cerner_2^5_2018

; Clojure’s comp function allows you to give it a set of functions, and return a function that is the composition of those functions.

;without comp

(defn inc-and-to-string [num]
  (str (inc num)))

(inc-and-to-str 2)
; "3"

;with comp
(def inc-and-to-string-with-comp (comp str inc))

(inc-and-to-string-with-comp 2)
;"3"

; The with-comp version returns a function, which when called, applies inc to the argument passed in, then applies str to the result, the same as the other version.