
abstract class Animal(_name: String, _age: Int) extends Vocal {
  override def toString: String = ""
  def move: String
}

class Cat(_name: String, _age: Int) extends Animal(_name, _age) {
  override def move: String = "Cat is gentle and soft"

  def makeNoise: String = "meun meun"

  override def toString: String = "(" + _name + ", " + _age + " )"
}

class Dog(_name: String, _age: Int) extends Animal(_name, _age) {
  override def move: String = "Dog is intelligent"

  def makeNoise: String = "woo woo"
  override def toString: String = "(" + _name + ", " + _age + " )"
}

class Rabbit(_name: String, _age: Int) extends Animal(_name, _age) {
  override def move: String = "Rabbit lives in the bush"

  def makeNoise: String = "yaw yaw"
  override def toString: String = "(" + _name + ", " + _age + " )"
}

class BankAccount(accountNumber: Int, _initialBalance: Double) {
  def this(accountNumber: Int) = this(accountNumber, 0.0)

  private var balance = _initialBalance

  def withdraw(amount: Double) = {
    if (amount > balance) println("Not possible")
    else
      balance -= amount
    balance
  }

  def deposit(amount: Double) = {
    balance += amount
    balance
  }

  override def toString: String = "(" + accountNumber + ", " + _initialBalance + ")"
}

trait Vocal {
  def makeNoise: String
}

trait Logger {
  def log(msg: String) {}
}

trait ConsoleLogger extends Logger {
  override def log(msg: String) {
    println(msg)
  }
}


val cat = new Cat("jak", 10)
val dog = new Dog("jake the dog", 10)
val rabbit = new Rabbit("jaky", 10)
cat.move
dog.move
rabbit.move
cat.toString
dog.toString
rabbit.toString
cat.makeNoise
dog.makeNoise
rabbit.makeNoise

