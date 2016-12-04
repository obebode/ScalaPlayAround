

object BankAccount {
  private val accountNum: Int = 0
}

class BankAccount(var accountNumber: Int, var _initialBalance: Double) extends Logger {
  def this(accountNumber: Int) = this(accountNumber, 0.0)

  accountNumber = BankAccount.accountNum
  private var balance = _initialBalance

  def withdraw(amount: Double) = {
    if (amount > balance) log("You don't have enough amount")
    else
      balance = balance - amount
    balance
  }

  def deposit(amount: Double) = {
    balance = balance + amount
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

trait Logger {
  def log(msg: String) {}
}

trait ConsoleLogger extends Logger {
  override def log(msg: String) {
    println(msg)
  }
}

trait TimestampLogger extends Logger {
  override def log(msg: String) {
    super.log(new java.util.Date() + " " + msg)
  }
}

// Testing with Bank Objects
val bank = new BankAccount(123, 6.0)
bank.deposit(10)
bank.withdraw(5)
bank.withdraw(4)
bank.deposit(20)
bank.withdraw(30)

// Savings account objects creation
val savings = new SavingsAccount(123, 100)
savings.addInterest(10.0)
savings.withdraw(1000)

// Testing the Logger trait
val bank1 = new BankAccount(123, 0)
val bank2 = new BankAccount(123, 50) with ConsoleLogger
bank2.withdraw(100)

// Testing multiple inheritance
val bank3 = new BankAccount(123, 100) with ConsoleLogger with TimestampLogger
bank3.deposit(100)
bank3.withdraw(500)

