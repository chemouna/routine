(ns routine.core
  (:gen-class)
  (:require [clojure.string :as str]))

(defprotocol ValidatableTask
  "A protocol to define a task that can be in a workflow"
  (validate [this] "Validate the task"))

;; maybe validate method here shld be a multimethod

(defrecord WorkflowTask [name ignore_errors]
  ValidatableTask)

(defn workflowTask
  "Create a new workflow task."
  [{:keys [name ignore_errors]}]
  {:pre [(string? name)
         (blank? name)]}
  (->WorkflowTask name ignore_errors))

(def task1 (workflowTask "task 1" true))

(map->WorkflowTask {:name "task2" :ignore_errors false  :name "task3" :ignore_errors true})

(:ignore_errors task)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (:name task1)))

