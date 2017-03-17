(ns re-native.svg
  (:require [reagent.core :as r]
            [re-frame.core :as re]))

(def react-native-svg (js/require "react-native-svg"))

(assert react-native-svg)
