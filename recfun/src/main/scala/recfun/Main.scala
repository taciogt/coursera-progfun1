package recfun

import scala.collection.mutable.Stack

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c < 0 || r < 0) 0
    else if (c == 0 && r == 0) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
    * Exercise 2
    */
  def hasParentheses(chars: List[Char]): Boolean = {
    chars.indexOf('(') != -1 || chars.indexOf(')') != -1
  }

  def firstOpens(chars: List[Char]): Boolean = ((chars indexOf ')') == -1 && (chars indexOf '(') >= 0) ||
    (chars.indexOf('(') < chars.indexOf(')') && chars.indexOf('(') >= 0)

  def lastCloses(chars: List[Char]): Boolean = {
    true
  }

  def remainingSentence(chars: List[Char]): List[Char] = {
    "".toList
  }

  def balance(chars: List[Char]): Boolean = {
    val parenthesesStack = new Stack[Char]

    def balanceIter(charsIter: List[Char]): Boolean = {
      if (charsIter.isEmpty) {
        println(charsIter)
        parenthesesStack.isEmpty
      } else if (charsIter.head == '(') {
        parenthesesStack.push('(')
        balanceIter(charsIter.drop(1))
      } else if (charsIter.head == ')') {
        if (parenthesesStack.isEmpty) {
          println(charsIter)
          false
        } else {
          parenthesesStack.pop()
          balanceIter(charsIter.drop(1))
        }
      } else {
        balanceIter(charsIter.drop(1))
      }
    }

    balanceIter(chars)

  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    var count = 0
    var remainingMoney = money
    if (money % coins.last == 0) {
      count += 1
      remainingMoney -= coins.last
    }

    while(remainingMoney >= 0 && coins.length > 1) {
      count += countChange(money - remainingMoney, coins.init)
      
      remainingMoney -= coins.last
    }

    count
  }

}
