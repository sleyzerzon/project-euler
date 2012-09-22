(ns prob-03)


(comment
  "Problem 3
02 November 2001

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

"
)


(defn primes [n]
  "iteration sieve erathostene"
    (loop [p 2
          seq (range 2 n)]
       (if (> (* p p) n)
          seq
         (let [new-seq (filter #(or (= % p) (not= 0 (mod % p))) seq)
               new-p (first (filter #(> % p) new-seq))]
            (recur new-p new-seq)
         )
       )      
    )
)


 
(defn largest-prime-factor
  [n]
  (let [sqrt-of-n (int (Math/sqrt n))
    prime-factors-of-n (filter #(zero? (mod n %)) (primes sqrt-of-n))]
    (last prime-factors-of-n)))
 
;;(largest-prime-factor 600851475143)
;;6857
