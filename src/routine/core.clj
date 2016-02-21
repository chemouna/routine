(ns routine.core
  (:gen-class))

(defprotocol Validatable
  "A protocol to define a task that can be in a workflow"
  (validate [this] "Validate the task"))

;; maybe validate method here shld be a multimethod

(defrecord WorkflowTask [name ignore_errors]
  Validatable
  )

(def task1 (->WorkflowTask "task 1" false))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (:name task1)))

