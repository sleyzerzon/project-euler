(ns prob-004)

(comment
 "Problem 4
16 November 2001

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91  99.

Find the largest palindrome made from the product of two 3-digit numbers.
"
  )


(defn palindrome? [n]
    (let [str_n       (Integer/toString n)
          rev_str_n   (apply str (reverse str_n))]
      (= str_n rev_str_n)  
    )
)



(defn multiply_collection [s1 s2]
  (let [s1Len (count s1)]
	  (letfn [(innerMul [m1 m2 nbIter s]
			        (if (= nbIter 0)
				        (sort > (distinct s))
				        (recur 
				          (rest m1) 
				          m2
	                (dec nbIter)
				          (concat
				            (filter palindrome? (map #(* (first m1) %) m2))
				            s
				          )
				        )
			        )
	          )]
	    (innerMul s1 s2 s1Len [])
	  )
  )
)

(defn generateRange-Ndigits [n]
  (let [lowerBound (int (Math/pow 10 (- 1 n)))
        upperBound (int (Math/pow 10 n))]
    (range lowerBound  upperBound)
  )
)


(defn greatestPalindrom-NdigitMultiplication [n]
  (let [rNdigits (generateRange-Ndigits n)]
    (first (multiply_collection rNdigits rNdigits))
  )
)

(defn greatestPalindrom-3digitMultiplication []
  (greatestPalindrom-NdigitMultiplication 3)
)


(defn computeListPalindrome [n]
  (letfn [(innerCompute [iter palSeq]
			    (if (<= iter 0)
			      palSeq
			      (recur (dec iter) (cons (greatestPalindrom-NdigitMultiplication iter) palSeq))
			    )
         )]
		  (innerCompute n [])
  )
)


;;=> (prob-4/computeListPalindrome 3)
;;(9 9009 906609)