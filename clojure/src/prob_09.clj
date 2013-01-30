(ns prob-09)

(comment 
  "Problem 9
25 January 2002

A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc."
)


(defn is-triplet-pythagore? [a b c]
  (= (+ (Math/pow a 2) (Math/pow b 2)) (Math/pow c 2))
)

(def sum-value 1000)
(def tri-range (range 1 (/ sum-value 3)))
(def full-range (range 1 sum-value))  

(defn is-sum-valid? [a b c]
  (and (> a 0) (> b 0) (> c 0) (= (+ a b c) sum-value))
)


(defn valid-sum-and-pythagore [a b c]
  (and (is-sum-valid? a b c)
       (is-triplet-pythagore? a b c)
  )
)


(defn find-triplet-with-sum-valid []
  (loop [a 1 ares ()]
    (let [res (loop [b 1 bres ()]
      (let [res (loop [c 1 cres ()]
        (if (valid-sum-and-pythagore a b c)
          (cons {:a a, :b b, :c c} cres)
          (if (> c sum-value)
             cres
            (recur (inc c) cres)
          )
        )
      )]
      (if (> b sum-value)
        bres
        (if (> (count res) 0)
          res
          (recur (inc b) bres)
        )
      )
     )
    )]
    (if (> a sum-value)
      ares
        (if (> (count res) 0)
         res
         (recur (inc a) ares)
        )
    )
   )
  )
)

;; (time (prob-09/find-triplet-with-sum-valid))
;;"Elapsed time: 24728.807423 msecs"
;;({:a 200, :b 375, :c 425})

(defn find-rand-triplet-with-sum-valid []
  (loop [n 0]
    (let [a (rand-int sum-value)
         b (rand-int sum-value)
         c (rand-int sum-value)]
     (if (valid-sum-and-pythagore a b c) 
       {:a a, :b b, :c c, :n n}
       (recur (inc n))
     )
   )
  )
)



;; (prob-09/find-rand-triplet-with-sum-valid)
;;{:a 375, :b 200, :c 425, :n 235345602}
;;~78s

;; (time (prob-09/find-rand-triplet-with-sum-valid))
;;"Elapsed time: 32889.790617 msecs"
;;{:a 200, :b 375, :c 425, :n 97565018}


;;(dotimes [n 10] (time (prob-09/find-rand-triplet-with-sum-valid)))
;;"Elapsed time: 31742.960437 msecs"
;;"Elapsed time: 135866.726108 msecs"
;;"Elapsed time: 173421.191774 msecs"
;;"Elapsed time: 259432.90164 msecs"
;;"Elapsed time: 236388.337431 msecs"
;;"Elapsed time: 251805.314238 msecs"
;;"Elapsed time: 30595.532253 msecs"
;;"Elapsed time: 12851.671844 msecs"
;;"Elapsed time: 74415.047524 msecs"
;;"Elapsed time: 15212.616698 msecs"