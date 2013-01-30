(ns prob-007
  (:use prob-005)
  (:use prob-003)
)

(comment
  "By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?"
)


(defn non-divisible? [a b]
  (not (is-divisible? a b))
)


(defn non-divisible-coll? [a coll]
  "return true if non-divisible a each element of coll"
  (reduce #(and %1 %2) (map #(non-divisible? a %) coll))
)


(defn nextPrime-range [p r]
  (loop [new-p (+ 1 p)]
    (if (non-divisible-coll? new-p (filter #(not= % new-p) r))
      { :p new-p, :r r }
      (recur (inc new-p))
    )
  )
)

(defn nextPrime [p]
  (let [r (primes (* p p))]
    (nextPrime-range p r)
  )
)

(defn nth-prime [n]
  (if (> n 1)
	  (loop [rp (nextPrime 2)
	         nbIter 2]
	    ;;(println "p=" (rp :p) " n=" nbIter "/" n)
		  (if (= n nbIter) 
		     (rp :p)
       (let [new-range (if (< (rp :p) (last (rp :r)))
                              (rp :r)
                              (sort (cons (rp :p) (rp :r)))
                       )]
          (recur (nextPrime-range (rp :p) new-range) (inc nbIter))
       )
		  )
	  )
   2
  )
)

;; (prob-007/nth-prime 1)
;;2
;; (prob-007/nth-prime 2)
;;3
;; (prob-007/nth-prime 3)
;;5
;; (prob-007/nth-prime 5)
;;11
;; (prob-007/nth-prime 6)
;;13

;; (prob-007/nth-prime 1001)
;;7927

;; (prob-007/nth-prime 10001)
;;StackOverflowError   clojure.core/filter/fn--3830 (core.clj:2468)
;;(prob-007/nth-prime 10001)
;;104743
;;~297s, ~4min