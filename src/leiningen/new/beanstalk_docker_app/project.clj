(defproject {{ns-name}} "0.1.0"
  :description "Clojure app that runs on AWS Beanstalk with docker"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.logging "0.2.6"]
                 [ch.qos.logback/logback-classic "1.1.2"]
                 [http-kit "2.1.18"]]
  :profiles {:uberjar {:aot :all}
             :dev {:plugins [[lein-marginalia "0.7.1"] ;; for doc generation
                             [lein-ancient "0.5.5"]    ;; check for old deps
                             [lein-zip "0.1.0"]]}}     ;; zip for aws deployment
  :main {{ns-name}}.main
  :uberjar-name "production.jar"
  :zip ["target/production.jar" "Dockerfile" "Dockerrun.aws.json"])
