(ns brain-fuel.project-euler.project_euler-test
  (:require [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]
            [clojure.test.check.clojure-test :refer [defspec]]
            [brain-fuel.project-euler.greeter.interface :as sut]))

(defspec greeting-test 100
  (prop/for-all [v (gen/fmap #(hash-map :person %) gen/string-alphanumeric)]
                (= (str "Hello, " (:person v) "!")
                   (sut/greeting v))))
