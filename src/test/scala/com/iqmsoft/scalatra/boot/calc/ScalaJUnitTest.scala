package com.iqmsoft.scalatra.boot.calc

import org.junit.Test
import org.junit.Assert._

//import com.iqmsoft.scalatra.boot.calc.Calc;

import Calc._

class ScalaJUnitTest {
  
  @Test def testAdd() {
    assertEquals(3, add(1, 2))
  }
  @Test def testSub() {
    assertEquals(2, sub(3, 1))
  }
  @Test def testMul() {
    assertEquals(3, mul(3, 1))
  }
  @Test def testDiv() {
    assertEquals(3, div(3, 1))
  }
  
}
