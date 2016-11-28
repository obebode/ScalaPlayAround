

// Companion object
object BankAccount {
  private val accountNum: Int = 0
}
class BankAccount(var accountNumber: Int, var _initialBalance: Double) {
  def this(accountNumber: Int) = this(accountNumber, 0.0)

  accountNumber = BankAccount.accountNum
  private var balance = _initialBalance

  def withdraw(amount: Double) = {
    if (amount > balance) println("Not possible")
    else
      balance = balance - amount
    balance
  }
  def deposit(amount: Double) = {
    balance = balance + amount
    balance
  }

  override def toString: String = "("+ accountNumber +", "+ _initialBalance +")"
}


val bank = new BankAccount(123, 6.0)
bank.deposit(10)
bank.withdraw(5)
bank.withdraw(4)
bank.deposit(20)
bank.withdraw(30)


val bank1 = new BankAccount(123, 0)