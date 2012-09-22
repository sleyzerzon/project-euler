(ns prob-05)

(comment
  "Problem 5
30 November 2001

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?"
)


(defn is-divisible? [a b]
  "return true if a%b==0"
  (= (mod a b) 0)
)


(defn is-divisible-coll? [a coll]
  "return true if is-divisible a each element of coll == 0"
  (reduce #(and %1 %2) (map #(is-divisible? a %) coll))
)


(defn smallest-divisible-coll [coll]
  (loop [n 1]
     (if (or (= n 10000000) (is-divisible-coll? n coll))
       n
       (recur (inc n))
     )
  )
)

;;=> (smallest-divisible-coll (range 1 10))
;;2520


;;=> (smallest-divisible-coll (filter even? (range 1 20)))
;;5040


;;=> (smallest-divisible-coll (filter even? (range 1 30)))
;;720720