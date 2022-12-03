import singleton.Singleton

fun main(args: Array<String>) {
//    TODO("Factory")
//    val door = DoorFactory().makeDoor(100f, 200f)
//    println(door)

//    TODO("Abstract Factory")
//    val makeAnimal = AnimalFactory().create("Dog")
//    println(makeAnimal)

//  TODO("Builder")
//    val foodOrder = FoodOrder.Builder()
//        .bread("white bread")
//        .meat("bacon")
//        .condiments("olive oil")
//        .build()
//
//    println(foodOrder)

    //TODO("Prototype")
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

    //TODO("Singleton")

    val singleton: Singleton? = Singleton.getInstance("FOO")
    val anotherSingleton: Singleton? = Singleton.getInstance("BAR")
    println(singleton?.value)
    println(anotherSingleton?.value)


}