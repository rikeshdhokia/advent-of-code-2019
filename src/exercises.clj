(ns exercises)

; day 1 part 1
(defn fuel-required [mass]
  (-> (/ mass 3)
      Math/floor
      (- 2)
      long))

(def masses [1 2 3 4])
(reduce + (map fuel-required masses))

; day 1 part 2