(ns {{ns-name}}.main
  "Contains the main entry point for the app"
  (:require [clojure.tools.logging :refer :all]
            [org.httpkit.server :refer [run-server]])
  (:gen-class))

(defn handler "Minimal default handler" [_]
  {:status 200 :body "{{name}} is running!"
   :headers {"Content-Type" "text/html"}})

(defn -main
  "main entry point for the app"
  [& args]
  (info "starting {{name}}")

  ;; app specific stuff goes here

  (info "serving status message")
  (run-server handler {:port 8080}))
