(defproject routine "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/tools.nrepl "0.2.12"]]
  :main ^:skip-aot routine.core
  :target-path "target/%s"
  :profiles {:dev {:plugins [[cider/cider-nrepl "0.11.0-SNAPSHOT"]
                             [lein-tar "3.2.0"]]}})

