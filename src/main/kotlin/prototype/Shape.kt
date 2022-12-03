package prototype

class Shape(
    var xCoordinate: Int = 0,
    var yCoordinate: Int = 0,
    var color: String = ""
) : Cloneable {

    fun cloneTo(): Shape? {
        try {
            val copy: Shape = super.clone() as Shape
            copy.xCoordinate = this.xCoordinate
            copy.yCoordinate = this.yCoordinate
            copy.color = this.color
            return copy
        } catch (e: CloneNotSupportedException) {
            e.printStackTrace()
        }
        return null
    }

    override fun toString(): String {
        return "Shape(xCoordinate=$xCoordinate, yCoordinate=$yCoordinate, color='$color')"
    }


}