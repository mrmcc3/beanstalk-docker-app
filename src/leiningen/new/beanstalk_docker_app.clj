(ns leiningen.new.beanstalk-docker-app
  (:require [leiningen.new.templates :refer [renderer
                                             name-to-path
                                             ->files
                                             sanitize-ns]]
            [leiningen.core.main :as main]))

(def render (renderer "beanstalk-docker-app"))

(defn beanstalk-docker-app
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (main/info "Generating clojure app for AWS Beanstalk and docker")
    (->files data
             ["Dockerfile" (render "Dockerfile" data)]
             ["Dockerrun.aws.json" (render "Dockerrun.aws.json" data)]
             ["project.clj" (render "project.clj" data)]
             ["src/{{sanitized}}/main.clj" (render "main.clj" data)])))
