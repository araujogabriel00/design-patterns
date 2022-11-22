import simpleFactory.DoorFactory

fun main(args: Array<String>) {


    val door = DoorFactory().makeDoor(100f, 200f)
    println(door)

}