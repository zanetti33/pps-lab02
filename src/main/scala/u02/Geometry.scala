package u02

import u02.Geometry.Shape.* 

object Geometry extends App {
  
    enum Shape:
        case Circle(radius: Double)
        case Square(edge: Double)
        case Rectangle(base: Double, height: Double)

    object Shape:
        def radius(shape: Shape) = shape match
            case Circle(radius) => radius

        def edge(shape: Shape) = shape match
            case Square(edge) => edge

        def base(shape: Shape) = shape match
            case Rectangle(base, height) => base

        def height(shape: Shape) = shape match
            case Rectangle(base, height) => height

        def perimeter(shape: Shape): Double = shape match
            case Circle(radius) => radius * 2 * Math.PI
            case Square(edge) => edge * 4
            case Rectangle(base, height) => base * height
            
        def scale(shape: Shape, alpha: Double): Shape = shape match
            case Circle(radius) => Circle(radius * alpha)
            case Square(edge) => Square(edge * alpha)
            case Rectangle(base, height) => Rectangle(base * alpha, height * alpha)
        
        

    val circle: Shape.Circle = Shape.Circle(5.2)
    println(radius(circle))

    println(perimeter(circle))

    println(radius(scale(circle, 0.5)))
        
}
