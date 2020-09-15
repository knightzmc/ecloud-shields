(ns ecloud-shields.routes.home
  (:require
    [ecloud-shields.layout :as layout]
    [clojure.java.io :as io]
    [ecloud-shields.middleware :as middleware]
    [ring.util.response]
    [ring.util.http-response :as response]))

(defn home-page [request]
  (layout/render request "home.html" {:docs (-> "docs/docs.md" io/resource slurp)}))

(defn about-page [request]
  (layout/render request "about.html"))

(defn lol-page [request]
  (layout/render request "lol.html"))

(defn home-routes []
  [""
   {:middleware [middleware/wrap-csrf
                 middleware/wrap-formats]}
   ["/" {:get home-page}]
   ["/lol" {:get lol-page}]
   ["/about" {:get about-page}]])

