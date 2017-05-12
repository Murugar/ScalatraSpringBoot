package com.iqmsoft.scalatra.boot.domain

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = false)
case class Address(id: Int, street: String, state: String, zip: String)

@JsonIgnoreProperties(ignoreUnknown = false)
case class Person(id: Int, first: String, last: String)

@JsonIgnoreProperties(ignoreUnknown = false)
case class Price(id: Int, valu : Float)
