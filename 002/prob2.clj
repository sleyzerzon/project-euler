(ns prob2)
  
(defn lazy-seq-fibo 
    ([] 
        (concat [0 1] (lazy-seq-fibo 0 1))) 
    ([a b] 
        (let [n (+ a b)] 
            (lazy-seq 
                (cons n (lazy-seq-fibo b n))))))

(defn less-than-four-million? [n]
  (< n 4000000))

(defn calculation []
  (reduce + (filter even? (take-while less-than-four-million? (lazy-seq-fibo)))))