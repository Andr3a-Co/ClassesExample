package au.edu.swin.sdmd.classesexample
import java.lang.Math.PI

//Constructor can be created in the declaration of the class
//Can directly assign the var/ properties of the class
//Open keyword means  to allow it to be subclassed
open class Aquarium (open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {

//Properties  the width, height, and length can be created in body
   // var width: Int = 20
   // var height: Int = 40
   // var length: Int = 100

//Open variables can be override  in the subclass
    open val shape = "rectangle"
    open var water : Double = 0.0
        get() = volume * 0.9


//Init blocks initialize when the constructor is called
    init {
        println("aquarium initializing")
    }

//Getter, define val and get() method to get the corresponding volume
    open var volume: Int
        get() = width * height * length / 1000  // 1000 cm^3 = 1 l
    //Setter (value) default value param
        set(value) {
            height = (value * 1000) / (width * length)
        }

    //Secondary constrcutor must call the primary constructor first using this()
    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        // calculate the height needed
        height = (tank / (length * width)).toInt()

    }
//Method to print aquarium size
    fun printSize() {
        println(shape)
        println("Aquarium size: ")
        println("Width: $width" +" Lenght: $length " + "Height: $height")
        // 1 l = 1000 cm^3
        println("Volume: $volume l Water: $water l (${water/volume*100.0}% full)")
    }

//Creating a subclass in same file overrriding Open class and setting Aquarium parameters
class TowerTank (override var height: Int, var diameter: Int): Aquarium(height = height, width = diameter, length = diameter) {

    //Override variables marked as open in
    override var volume: Int
        // ellipse area = π * r1 * r2
        get() = (width / 2 * length / 2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width / 2 * length / 2)).toInt()
        }
    override var water = volume * 0.8
    override val shape = "cylinder"


    }



}

