(defproject lein-new-vagrant-sample "0.1.0-SNAPSHOT"
  :description "Basic project generated by lein-new-vagrant Leiningen plugin"
  :url "http://example.com/FIXME"
  :repositories [["central-proxy" "http://repository.sonatype.org/content/repositories/central/"]]
  :jvm-opts ["-Xmx1G"]

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.datomic/datomic-free "0.9.4899"]]

  :plugins [[cider/cider-nrepl "0.8.0-SNAPSHOT"]])
