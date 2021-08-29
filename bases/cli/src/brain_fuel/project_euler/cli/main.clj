(ns brain-fuel.project-euler.cli.main
  (:require [brain-fuel.project-euler.greeter.interface :as greeter])
  (:gen-class))

(defn -main
  "Say Hello!"
  [& args]
  (println (greeter/greeting {:person (first args)})))
