(ns brain-fuel.project-euler.greeter.interface
  (:require [brain-fuel.project-euler.greeter.core :as greeter]))

(defn greeting
  "Return a suitable greeting for the person."
  [{:keys [person] :as data}]
  (greeter/greeting data))
