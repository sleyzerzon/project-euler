(ns prob-01)

(comment 
  "Problem 1
05 October 2001

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000."
 )
  
(defn isMod3or5[arg]
  (or (zero? (mod arg 3)) (zero? (mod arg 5))))

(defn calculation[]
 (reduce + (filter isMod3or5 (range 1000))))


;;=> (calculation)
;;233168