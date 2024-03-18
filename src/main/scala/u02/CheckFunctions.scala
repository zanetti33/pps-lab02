package u02

object CheckFunctions extends App {
  
    def checkNonCurryingMethod(x: Int, y: Int, z: Int): Boolean =
        x <= y && y == z

    def checkCurryingMethod(x: Int) (y: Int) (z: Int): Boolean =
        x <= y && y == z

    val checkNonCurryingLambda: (Int, Int, Int) => Boolean = (x, y, z) => x <= y && y == z
    val checkCurryingLambda: Int => Int => Int => Boolean = x => y => z => x <= y && y == z
    
    println(checkNonCurryingMethod(3, 4, 4))
    println(checkCurryingMethod(3)(4)(4))
    println(checkNonCurryingLambda(3, 4, 4))
    println(checkCurryingLambda(3)(4)(4))

}
