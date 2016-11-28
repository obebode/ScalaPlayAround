val n = 5
var m = 5.0


val name = "Alice"
val c = 'a'
val f = 3.0f
val b = true

name + c
c + n
name + b

val thisIsADouble : Double = 10
val thisIsAFloat : Float = 10

val result = { val a = 20; val b = 5; a / b}

val y = { val m = 1.0; val x = 10; val c = 15; m*x + c}

val total = {val input = 10.00; input + (input* 0.2)}


def fact(n: Int): Int = {
  if (n == 0) 1
  else {
    n * fact(n - 1)
  }
}

val factTest = fact(10)

