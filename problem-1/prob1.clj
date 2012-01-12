(ns prob1)
  
(defn mod2[arg]
  (mod 2 arg))
  
(defn isMod2[arg]
  (= (mod2 arg) 0))

(defn mod5[arg]
  (mod 5 arg))  

(defn isMod5[arg]
  (= (mod5 arg) 0))
  
(defn isMod2or5[arg]
  (or (isMod2 arg) (isMod5 arg)))

DOESN'T WORK :S
(defn main [] 
  (let [result 0]
    (doseq [i (range 1 1000)]
        (when (isMod2or5 i)
          (println (+ result i))))))