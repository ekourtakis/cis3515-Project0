/* Emmanuel Kourtakis
 * Assignment 0
 * CIS 3515
 * 9/6/24
 */

fun main() {
    val square : Shape = Square("square")
    val circle : Shape = Circle("circle")
    val triangle : Shape = Triangle("triangle")
    val eqTriangle : Shape = EquilateralTriangle("eqTriangle")

    println("SQUARE")
    print("enter legnth: ")
    val length : Double = readln().toDouble()
    print("enter width: ")
    val width : Double = readln().toDouble()
    square.setDimensions(length, width)

    println("CIRCLE")
    print("enter radius: ")
    val radius : Double = readln().toDouble()
    circle.setDimensions(radius)

    println("TRIANGLE")
    print("enter side A: ")
    val sideA : Double = readln().toDouble()
    print("enter side B: ")
    val sideB : Double = readln().toDouble()
    print("enter side C: ")
    val sideC : Double = readln().toDouble()
    triangle.setDimensions(sideA, sideB, sideC)

    println("EQUILATERAL TRIANGLE")
    print("enter side: ")
    val side : Double = readln().toDouble()
    eqTriangle.setDimensions(side)

    printInfo(square)
    printInfo(circle)
    printInfo(triangle)
    printInfo(eqTriangle)
}

fun printInfo(shape: Shape) {
    shape.printDimensions()
    println("Area: ${shape.getArea()}")
}