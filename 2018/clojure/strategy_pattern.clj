;; implementing comparator in Clojure, sorting users by subscription. cerner_2^5_2018
;; User has subscription and each subscription have a name, to sort these users by subscription name.
(sort (comparator
       (fn [u1 u2]
         (cond
          (= (:subscription u1)
             (:subscription u2)) (neg? (compare (:name u1)
                                                (:name u2)))
             (:subscription u1) true
             :else false))) users)

;; or simple format with juxt

;; forward sort
(sort-by (juxt (complement :subscription) :name) users)

;; reverse sort
(sort-by (juxt :subscription :name) #(compare %2 %1) users)
