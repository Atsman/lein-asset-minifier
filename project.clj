(defproject lein-asset-minifier "0.4.3"
  :description "plugin for CSS/Js asset minification"
  :url "https://github.com/yogthos/lein-asset-minifier"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [asset-minifier "0.2.4"]
                 [org.clojure/core.async "0.3.443"]]
  :eval-in-leiningen true)
