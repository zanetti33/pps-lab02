package u02

object GreatestCommonDivisor extends App {
  
    def greatestCommonDivisor (a: Int, b: Int) : Int =
        val max = a match
            case a if a >= b => a
            case _ => b
        val min = a match
            case a if a < b => a
            case _ => b
        min match
            case 0 => max
            case _ => greatestCommonDivisor(min, max % min)

    println(greatestCommonDivisor(7, 14))
    println(greatestCommonDivisor(12, 4))
         
}
