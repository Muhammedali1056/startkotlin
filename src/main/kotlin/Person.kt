class Person{
    private var height: Int = 174
    private val weight: Float = 61.6F
    private var name: String = "Muhammed"

    fun run(){
        println("im running")
    }

    override fun toString(): String {
        return "Person(height=$height, weight=$weight, name='$name')"
    }
}