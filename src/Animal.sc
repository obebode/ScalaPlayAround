
abstract class Animal(_name: String, _age: Int) {
  override def toString: String = ""

  def move: String
}

class Cat(_name: String, _age: Int) extends Animal(_name, _age) {
  override def move: String = "Cat is gentle and soft"

  override def toString: String = "(" + _name + ", " + _age + " )"
}

class Dog(_name: String, _age: Int) extends Animal(_name, _age) {
  override def move: String = "Dog is intelligent"

  override def toString: String = "(" + _name + ", " + _age + " )"
}

class Rabbit(_name: String, _age: Int) extends Animal(_name, _age) {
  override def move: String = "Rabbit lives in the bush"

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

class SavingsAccount(accountNumber: Int, _initialBalance: Double) extends BankAccount(accountNumber, _initialBalance) {
  def this(accountNumber: Int) = this(accountNumber, 0.0)

  private var balance = _initialBalance

  def addInterest(percentInterestRate: Double) {
    balance += (percentInterestRate / 100) * balance
    balance
  }

  override def withdraw(amount: Double) = {
    balance -= amount
    balance
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

val savings = new SavingsAccount(123, 100)
savings.addInterest(10.0)
savings.withdraw(1000)