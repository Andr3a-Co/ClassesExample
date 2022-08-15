package au.edu.swin.sdmd.classesexample.dataClass

import au.edu.swin.sdmd.classesexample.buildAquarium
import au.edu.swin.sdmd.classesexample.makeFish

//Data class must implement a val in the constructor
data class Decoration(val rock: String) {

}

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

//Checking if values are equal
    println (decoration1.equals(decoration2))
    println (decoration3.equals(decoration2))
}

//Data class with 3 parameters
data class Decoration2(val rocks: String, val wood: String, val diver: String){
}

fun makeDecorations2() {

    //variable yo apply destructuring
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

// Assign all properties to variables.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}

//Define enum name
//Must define parameters in constructor to allow int string etc to be applied
enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}



fun main() {

    makeDecorations()
    makeDecorations2()

    println(Direction.EAST.name)
    //Gets number position in enum
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)

    val l: Long = "17".toLong()
    println(Long)


}