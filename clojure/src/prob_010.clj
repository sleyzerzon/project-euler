(ns prob-010
  (:use prob-003)  
)

(comment
  "Problem 10
08 February 2002

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million."
)

(defn sum-of-primes [n]
  (let [prim (primes n)]
    (reduce + prim)
  )
)

;;(prob-010/sum-of-primes 10)
;;17

;; (prob-010/sum-of-primes 2000000)
;;142913828922

;;(time (prob-010/sum-of-primes 2000000))
;;"Elapsed time: 14996.382256 msecs"
;;142913828922