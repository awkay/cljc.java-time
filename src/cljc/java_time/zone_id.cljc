(ns cljc.java-time.zone-id (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [ZoneId]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time ZoneId])))
(def short-ids (. java.time.ZoneId -SHORT_IDS))
(clojure.core/defn get-available-zone-ids {:arglists (quote ([]))} (^java.util.Set [] (. java.time.ZoneId getAvailableZoneIds)))
(clojure.core/defn of {:arglists (quote (["java.lang.String"] ["java.lang.String" "java.util.Map"]))} (^java.time.ZoneId [^java.lang.String java-lang-String2602] (. java.time.ZoneId of java-lang-String2602)) (^java.time.ZoneId [^java.lang.String java-lang-String2603 ^java.util.Map java-util-Map2604] (. java.time.ZoneId of java-lang-String2603 java-util-Map2604)))
(clojure.core/defn of-offset {:arglists (quote (["java.lang.String" "java.time.ZoneOffset"]))} (^java.time.ZoneId [^java.lang.String java-lang-String2605 ^java.time.ZoneOffset java-time-ZoneOffset2606] (. java.time.ZoneId ofOffset java-lang-String2605 java-time-ZoneOffset2606)))
(clojure.core/defn to-string {:arglists (quote (["java.time.ZoneId"]))} (^java.lang.String [^java.time.ZoneId this2607] (.toString this2607)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.ZoneId" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^java.time.ZoneId this2608 ^java.time.format.TextStyle java-time-format-TextStyle2609 ^java.util.Locale java-util-Locale2610] (jti/getter displayName this2608 java-time-format-TextStyle2609 java-util-Locale2610)))
(clojure.core/defn get-rules {:arglists (quote (["java.time.ZoneId"]))} (^java.time.zone.ZoneRules [^java.time.ZoneId this2611] (jti/getter rules this2611)))
(clojure.core/defn get-id {:arglists (quote (["java.time.ZoneId"]))} (^java.lang.String [^java.time.ZoneId this2612] (jti/getter id this2612)))
(clojure.core/defn normalized {:arglists (quote (["java.time.ZoneId"]))} (^java.time.ZoneId [^java.time.ZoneId this2613] (.normalized this2613)))
(clojure.core/defn system-default {:arglists (quote ([]))} (^java.time.ZoneId [] (. java.time.ZoneId systemDefault)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.ZoneId [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor2614] (. java.time.ZoneId from java-time-temporal-TemporalAccessor2614)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.ZoneId"]))} (^java.lang.Integer [^java.time.ZoneId this2615] (.hashCode this2615)))
(clojure.core/defn equals {:arglists (quote (["java.time.ZoneId" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.ZoneId this2616 ^java.lang.Object java-lang-Object2617] (.equals this2616 java-lang-Object2617)))
