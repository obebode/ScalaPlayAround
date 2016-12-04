
// 1. Write a function to sum all integers between two given numbers a and b:

def sumInts(a: Int, b: Int): Int = {
  if (a > b) 0 else a + sumInts(a + 1, b)
}

val x = sumInts(4, 10)

//2. Write a function to sum the squares of all integers between two given numbers
//a and b:

def square(x: Int): Int = x * x
def sumSquareInts(a: Int, b: Int): Int = {
  if (a > b) 0 else square(a) + sumSquareInts(a + 1, b)
}

val y = sumSquareInts(4, 10)

//3. Write a function to sum the powers 2n of all integers n between two given
//numbers a and b:

def powerOfTwo(x: Int): Int = if (x == 0) 1 else 2 * powerOfTwo(x - 1)
def sumPowersOfTwo(a: Int, b: Int): Int =
  if (a > b) 0 else powerOfTwo(a) + sumPowersOfTwo(a + 1, b)

val z = sumPowersOfTwo(4, 10)

def sum(f: Int => Int, a: Int, b: Int): Int =
  if (a > b) 0 else f(a) + sum(f, a + 1, b)

//High Order Functions

/*def id(x: Int): Int = x
def square(x: Int): Int = x * x
def powerOfTwo(x: Int): Int = if (x == 0) 1 else 2 * powerOfTwo(x - 1)

def sumInts(a: Int, b: Int): Int = sum(id, a, b)
def sumSquares(a: Int, b: Int): Int = sum(square, a, b)
def sumPowersOfTwo(a: Int, b: Int): Int = sum(powerOfTwo, a, b)
*/

// Anonymous Functions
(x: Int) => x * x
(x: Int, y: Int) => x * y

def sumInt(a: Int, b: Int): Int = sum((x: Int) => x, a, b)
def sumSquares(a: Int, b: Int): Int = sum((x: Int) => x * x, a, b)
