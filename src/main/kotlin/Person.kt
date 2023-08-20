class Person{
    var height: Int = 174
    val weight: Float = 61.6F
    var name: String = "Muhammed"

    fun run(){
        println("im running")
    }

    override fun toString(): String {
        return "Person(height=$height, weight=$weight, name='$name')"
    }
}