(ns cljweb.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [immutant.web :as web]
            [immutant.web.undertow :as undertow]) 
  (:gen-class))

(defroutes app-routes
   (GET "/" [] "Hello World")
   (route/not-found "Not Found"))

(defn -main [& args]
  (prn "clj web server was started")
  (->> (undertow/options {:host "0.0.0.0"
                          :port 3000})
       (web/run app-routes)))
