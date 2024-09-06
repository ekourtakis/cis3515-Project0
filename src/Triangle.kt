import kotlin.math.sqrt

open class Triangle(_name: String) : Shape(_name) {

    private var sideA : Double = 0.0
    private var sideB : Double = 0.0
    private var sideC : Double = 0.0

    fun setDimensions(sideA : Double, sideB : Double, sideC : Double) {
        this.sideA = sideA
        this.sideB = sideB
        this.sideC = sideC
    }

    override fun printDimensions() {
        println("$name: sideA = $sideA, sideB = $sideB, sideC = $sideC")
    }

    // heron's formula for area of triangle
    override fun getArea(): Double {
        val s : Double = (sideA + sideB + sideC) / 2.0
        return sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}