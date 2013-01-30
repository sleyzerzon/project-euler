(ns prob-06)

(comment 
  "Problem 6
14 December 2001

The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 55^2 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum."
)


(defn square [n]
  "return n^2"
  (int (Math/pow n 2))
)


(defn sumColl [coll]
  "return sum of element in coll"
  (loop [sum 0
         currColl coll
         iter (count coll)]
       (if (= iter 0)
         sum
         (recur (+ sum (first currColl)) (rest currColl) (dec iter))
       )
  )
)

;;=> (prob-6/sumColl (map #(prob-6/square %) (range 1 11)))
;;385
;;=> (prob-6/square (prob-6/sumColl (range 1 11)))
;;3025


(defn diffSumSquareAndSqureSumOfRange [r]
  "return the difference between the sum of the squares of range r and the square of the sum"
  (- (prob-06/square (prob-06/sumColl r)) (prob-06/sumColl (map #(prob-06/square %) r)))
)


;;=> (prob-06/diffSumSquareAndSqureSumOfRange (range 1 11))
;;2640
;;=> (prob-06/diffSumSquareAndSqureSumOfRange (range 1 101))
;;25164150  