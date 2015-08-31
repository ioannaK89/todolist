(ns todolist.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            ))

(defroutes app
  (GET "/" [] "Hello World")
  (route/not-found "Not Found"))

