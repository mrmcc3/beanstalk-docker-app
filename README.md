# beanstalk-docker-app

A Leiningen template for clojure apps that run on aws beanstalk via docker

## Usage

    $ lein new beanstalk-docker-app superapp

Check dependencies with

    $ lein ancient

Generate Docs with

    $ lein marg

Generate a production jar

    $ lein uberjar

Zip the Dockerfiles along with the production jar with

    $ lein zip

The zip file can be uploaded to aws beanstalk
