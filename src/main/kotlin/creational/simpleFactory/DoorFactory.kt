package creational.simpleFactory

class DoorFactory {

    fun makeDoor(width: Float, height: Float) : Door {
        return WoodenDoor(width, height)
    }
}