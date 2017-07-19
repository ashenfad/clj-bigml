(defproject bigml/clj-bigml "0.2.0-SNAPSHOT"
  :description "Clojure bindings for the BigML.io API"
  :url "https://github.com/bigmlcom/clj-bigml"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :aliases {"lint" ["do" "check," "eastwood"]
            "distcheck" ["do" "clean," "lint," "test"]}
  :profiles {:dev {:plugins [[jonase/eastwood "0.1.4"]]}}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [cheshire "5.5.0"]
                 [org.clojure/data.csv "0.1.3"]
                 [clj-http "2.1.0"]
                 [commons-validator "1.5.0"]])
