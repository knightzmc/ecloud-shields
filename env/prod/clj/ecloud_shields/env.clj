(ns ecloud-shields.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[ecloud-shields started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[ecloud-shields has shut down successfully]=-"))
   :middleware identity})
