package creational.simpleFactory

class WoodenDoor(
    private val width: Float,
    private val height: Float
) : Door {


    override fun getWidth(): Float {
        return this.width
    }

    override fun getHeigth(): Float {
        return this.height
    }

    override fun toString(): String {
        return "WoodenDoor(width=$width, height=$height)"
    }


}