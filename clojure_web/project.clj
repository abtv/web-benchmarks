(defproject cljweb "1.0.0"
  :description "Simple web server in Clojure"
  :url "https://github.com/abtv/web-benchmarks"
  :main cljweb.core
  :aot [cljweb.core]
  :uberjar-name "cljweb.jar"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.4.0"]
                 [org.immutant/immutant "2.1.2"]])
