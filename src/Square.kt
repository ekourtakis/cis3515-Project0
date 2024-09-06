// this class should really be called "Rectangle", with Square as a child
class Square(_name: String) : Shape(_name) {

    private var length : Double = 0.0
    private var height : Double = 0.0

    fun setDimensions(length: Double, height: Double) {
        this.length = length
        this.height = height
    }

    override fun printDimensions() {
        println("$name: length = $length, height = $height")
    }

    override fun getArea() : Double{
        return length * height
    }
}