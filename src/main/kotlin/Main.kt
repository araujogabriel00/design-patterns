import structural.BasicRemote
import structural.Device
import structural.Radio

fun main(args: Array<String>) {

//    val door = DoorFactory().makeDoor(100f, 200f)
//    println(door)


//    val makeAnimal = AnimalFactory().create("Dog")
//    println(makeAnimal)


//    val foodOrder = FoodOrder.Builder()
//        .bread("white bread")
//        .meat("bacon")
//        .condiments("olive oil")
//        .build()
//
//    println(foodOrder)


//    val original: Shape = Shape().apply {
//        xCoordinate = 10
//        yCoordinate = 3
//        color = "red"
//    }
//
//    val copy = original.cloneTo()?.apply {
//        xCoordinate = 14
//        yCoordinate = 80
//        color = "blue"
//    }
//
//    println(copy!!)


//    val singleton: Singleton? = Singleton.getInstance("FOO")
//    val anotherSingleton: Singleton? = Singleton.getInstance("BAR")
//    println(singleton?.value)
//    println(anotherSingleton?.value)

    testDevice(Radio())

}

fun testDevice(device: Device) {
    println("Tests with basic remote.")
    val basicRemote = BasicRemote(device)
    basicRemote.togglePower()
    device.printStatus()
}