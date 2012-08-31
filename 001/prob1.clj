(ns prob1)
    
(defn isMod3or5[arg]
  (or (zero? (mod arg 3)) (zero? (mod arg 5))))

(defn calculation[]
 (reduce + (filter isMod3or5 (range 1000))))