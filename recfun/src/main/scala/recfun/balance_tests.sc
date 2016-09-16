import scala.collection.mutable.Stack

var coins = List(1, 2, 3, 4)
coins take (coins.length - 1)
coins.init
coins.init.init.init.init
5 % 6

val string_1 = "this is a (test)".toList


string_1 indexOf 'H'
string_1 indexOf '('
string_1 indexOf ')'
string_1.reverse indexOf '('
string_1.reverse indexOf ')'

string_1 takeWhile ( _ == '(')
string_1 takeWhile ( _ != '(' )
string_1
string_1 dropWhile ( _ == '(')
string_1
string_1 dropWhile ( _ == '(')
string_1
string_1 dropWhile ( _ != '(')

string_1 indexOf('(')
string_1 indexOf(')')

val string_2 = "this is a (test)".toList
(string_2 take 1).toList == "t".toList
string_2
string_2 drop 1
string_2
string_2.head == 't'

val stack = new Stack[Char]
stack.push('(')
stack.push(')')
stack.push('a')
stack.pop()
stack.pop()
stack.pop()
//stack.pop()