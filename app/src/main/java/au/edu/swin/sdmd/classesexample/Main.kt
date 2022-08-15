package au.edu.swin.sdmd.classesexample

fun buildAquarium() {
    //Can create obj with default constructor parameters
    //val myAquarium = Aquarium()
    //myAquarium.printSize() //Method applied to the object
    //myAquarium.height = 60 Modify properties directly (If using var)

    // default height and length
    //val aquarium2 = Aquarium(width = 25)
    //aquarium2.printSize()

    //Call of the second constructor
    //val aquarium6 = Aquarium(numberOfFish = 29)
    //aquarium6.volume = 70
    //aquarium6.printSize()

    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = Aquarium.TowerTank(diameter = 25, height = 40)
    myTower.printSize()


}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    println("Plecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()

}

fun main() {

    buildAquarium()
    makeFish()

}