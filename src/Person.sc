
object Person {
  def apply(_name: String, _age: Int, _email: String, _acctNum: Int) : Person = {
    val p = new Person
    p._name = _name
    p._age = _age
    p._email = _email
    p._acctNum = _acctNum
    p

  }
}

class Person  {
  var _name: String = ""
  var _age : Int = 0
  var _email: String = ""
  var _acctNum: Int = 0

  def name = _name
  def name_= (aName: String) {
    _name = aName
  }
  def age = _age

  def age_= (newAge: Int){
    if (newAge > _age)
      _age = newAge
  }
  def email = _email

  // Define setter - email
  def email_= (aEmail: String){
    _email = aEmail
  }
  def acct = _acctNum

  override def toString: String = "(" + _name + ", " + _age + ", "+ _email +")"
}

val pp = Person("James", 10, "BBBB", 123)
val pq = Person("John", 30, "CCCC", 123)
pp._age
pp._email
pp._name
pq._email
pq._age



/*val person = new Person("James", 10, "james@yahoo.com")
println(person)
person.age
person.email
person.name
person.toString */

