// data classes check can check if the data objects hold the same property value
// they automatically override the equals function in Any() and make it check equality based on the values of each
// objects properties.

// to create a copy of an object altering some properties and leaving the rest we can use the copy function
class Recipe(
    val title: String,
    val isVEg: Boolean = false,
    val difficulty: String = "Easy"
)

class Mushroom(val size: Int, val isMagic: Boolean) {
    // secondary constructor
    constructor(isMagic_param: Boolean) : this(0, isMagic_param) {

    }
}



fun main(args: Array<String>) {
    val r1 = Recipe("Chicken", false)
    val r2 = Recipe("Chicken", false)
    //val r3 = r1.copy(title = "Thai")

    println("r1 hashcode: ${r1.hashCode()}")
    println("r2 hashcode: ${r2.hashCode()}")
    //println("r3 hashcode: ${r3.hashCode()}")

    println("r1 ToString: ${r1.toString()}")

    println("r1 == r2?? ${r1 == r2}")
    println("r1 === r2?? ${r1 === r2}")
    //println("r1 == r3?? ${r1 == r3}")

    //val (title, vegetarian) = r1

    //println("title is $title and vegetarian is $vegetarian")
}

