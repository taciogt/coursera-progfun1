package recfun

import org.scalatest.FunSuite


import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class BalanceSuite extends FunSuite {
  import Main.hasParentheses
  import Main.firstOpens
  import Main.balance

//  test("hasParentheses: empty string has no parentheses") {
//    assert(!hasParentheses("".toList))
//  }
//
//  test("hasParentheses: string with opening parenthesis is not empty") {
//    assert(hasParentheses("adsd ( asdasd".toList))
//  }
//
//  test("hasParentheses: string with closing parenthesis is not empty") {
//    assert(hasParentheses("adsd ) asdasd".toList))
//  }
//
//  test("firstOpens: first opens for happy scenario"){
//    assert(firstOpens("sdaas ( sadasd ) qweqw".toList))
//  }
//
//  test("firstOpens: inverted parenthesis"){
//    assert(!firstOpens("sdaas ) sadasd ( qweqw".toList))
//  }
//
//  test("firstOpens: only opens") {
//    assert(firstOpens("sdaas sadasd ( qweqw".toList))
//  }
//
//  test("firstOpens: only closes") {
//    assert(!firstOpens("sdaas sadasd ) qweqw".toList))
//  }

  test("balance: '(if (zero? x) max (/ 1 x))' is balanced") {
    assert(balance("(if (zero? x) max (/ 1 x))".toList))
  }

  test("balance: 'I told him ...' is balanced") {
    assert(balance("I told him (that it's not (yet) done).\n(But he wasn't listening)".toList))
  }

  test("balance: ':-)' is unbalanced") {
    assert(!balance(":-)".toList))
  }

  test("balance: counting is not enough") {
    assert(!balance("())(".toList))
  }

}
