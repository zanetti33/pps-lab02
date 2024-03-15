package u02

object Neg extends App {
  
    def neg[X](predicate: X => Boolean): X => Boolean =
        x => !predicate(x)


    println(neg(_ == "")("pippo") && !neg(_ == "")(""))

    var positive: Int => Boolean = _ >= 0
    println(neg(positive)(-6) && !neg(positive)(17))

}
