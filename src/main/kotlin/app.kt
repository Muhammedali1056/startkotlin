fun main(){
    var x = true
    var y = false
    val someNum = 10
    val values = 1..10
    var booleanValue = someNum !in values
    println(booleanValue)
}

fun printer(){
    print("firstname: ")
    val name = readLine()
    print("lastname: ")
    val lastname = readLine()
    print("email: ")
    val email = readLine()
    print("age: ")
    val age = readLine()
    println("your name is : $name")
    println("your lastname is : $lastname")
    println("your email is : $email")
    println("your age is: $age ")
}

fun anyType(){
    var numberValue: Any = 5
    println(numberValue)
    numberValue = "kiril"
    println(numberValue)
}

fun printMyName(){
    var firstName = "muhammed"
    var lastName = "aliev"
    var age = 14
    println("hello,$firstName $lastName im $age")
}

fun readtest(){
    print("Enter your name = ")
    var name = readlnOrNull()
    println("Your name is $name")
}

fun sum(val1: Int, val2: Int) : Int
{
    return val1 + val2
}

fun typeData(){
    val byteValue: Byte = 127
    val shortValue: Short = 32767
    val intValue: Int = 2_147_483_647
    val longValue: Long = 9_223_372_036_854_775_807
    val ubyteValue: UByte = 255u
    val float: Float = 234353.14F
    val d: Double = 45e3
    var booleanValue: Boolean = true
    booleanValue = false
    val charValue: Char = 'a'
    val stringValue: String = "my"+ " name is " + "Muhammed"
    val text: String = """
        SALT II was a series of talks between United States
                        and Soviet negotiators from 1972 to 1979.
                        It was a continuation of the SALT I talks.
    """
}

fun calculator(){
    println("show calculator"); println("show calculator") // this is test println
}

fun shoot(){
    println("i kill you")
}

fun swim(){
    println("i can swimm")
}

/*
this is the function for making the game
 */
fun play(){
    println("i make the Game")
}

fun longTest(){
    val sum = 567765757757656
    val valvalue: Int
    valvalue =5
    println(valvalue)

}