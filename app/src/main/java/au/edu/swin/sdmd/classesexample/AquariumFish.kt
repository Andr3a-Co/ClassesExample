package au.edu.swin.sdmd.classesexample

//Implementation of abstract class example
//abstract class AquariumFish {

    //abstract val color: String

//}

//New interface to implement delegation
interface FishColor {
    val color: String

}

interface FishAction  {
    fun eat()
}

object GoldColor : FishColor {
    override val color = "gold"
}

object GreyColor : FishColor {
    override val color = "grey"
}


//Subclasses of AquariumFish abstract class
//Include () for constructor
//After , the interface created is included
//Implement the color using object "by" object name
class Shark: FishAction, FishColor by GreyColor {
    //Override property of the interface
    override fun eat() {
        println("hunt and eat fish")
    }
}

//Implement color as default in the constructor
//declare a name: interface = object name
// include by variable name
class Plecostomus (fishColor: FishColor = GoldColor): FishAction  by PrintingFishAction("eat algae"), FishColor by fishColor {}

//implements FishAction, which takes a String, food, then prints what the fish eats.
//must include val when declaring food as paremeter
//considering the function returns the val
class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

