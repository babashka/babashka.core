(ns babashka.core
  (:require [clojure.string :as str]))

(defn windows? []
  (str/starts-with? (System/getProperty "os.name") "Windows"))
