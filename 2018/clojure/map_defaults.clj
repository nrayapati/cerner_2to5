; In clojure when retrieving values from a map, you can specify default values in case the key is not found:
; cerner_2^5_2018

(= 2 (:foo {:bar 0, :baz 1} 2))

; However, what if you want the map itself to contain the default values?

(ns live.test
  (:require [cljs.test :refer-macros [deftest is run-tests]]))

(defn map-defaults [v ks]
  (into {}
        (map (juxt
               identity
               (constantly v))
             ks)))

(deftest map-defaults-test
  (is (= (map-defaults 0 [:a :b :c])
         {:a 0 :b 0 :c 0}))
  (is (= (map-defaults "x" [1 2 3])
         {1 "x" 2 "x" 3 "x"}))
  (is (= (map-defaults [:a :b] [:foo :bar])
         {:foo [:a :b] :bar [:a :b]})))

(run-tests)

; Testing live.test

; Ran 1 tests containing 3 assertions.
; 0 failures, 0 errors.
; nil


