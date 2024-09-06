import kotlin.math.PI

class Circle(_name: String) : Shape(_name) {

    var radius: Double = 0.0

    fun setDimensions(radius : Double) {
        this.radius = radius
    }
    override fun printDimensions() {
        println("$name: radius = $radius")
    }

    override fun getArea(): Double {
        return PI * radius * radius
    }
}