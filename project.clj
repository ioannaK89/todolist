(defproject todolist "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [compojure "1.4.0"]
                 [org.postgresql/postgresql  "9.4-1201-jdbc41"]
                 [korma  "0.4.2"]
                 [ragtime  "0.5.1"]]
  :plugins [[lein-ring "0.9.6"]]
  :ring {:handler todolist.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
