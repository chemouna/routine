(ns routine.core
  (:gen-class)
  (:require [clojure.string :as string]))

(defprotocol Validatable
  "A protocol to define a task that can be in a workflow"
  (validate [this] "Validate the task"))

;; maybe validate method here shld be a multimethod

(defrecord WorkflowTask [name ignore_errors]
  Validatable)

(defn workflowTask [name ignore_errors]
  "Create a new workflow task."
  {:pre [(string? name)
         (not (string/blank? name))]}
  (->WorkflowTask name ignore_errors))


;; i need to go reading and find out how to can i have a defrecord with an abstract data type
(defrecord WorkflowTaskRunner [WorkflowTask])

;(def task1 (workflowTask "task 1" true))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (:name task1)))


