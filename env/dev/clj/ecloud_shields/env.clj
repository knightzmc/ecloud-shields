(ns ecloud-shields.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [ecloud-shields.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[ecloud-shields started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[ecloud-shields has shut down successfully]=-"))
   :middleware wrap-dev})
