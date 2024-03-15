package u02

object Neg extends App {
  
    def neg[X](predicate: X => Boolean): X => Boolean =
        x => !predicate(x)

    
    val negAsLambda: ([X] => Boolean) => ([X] => Boolean) = predicate => (x => !predicate(x))

    println(neg(_ == "")("pippo") && !neg(_ == "")(""))
    println(negAsLambda(_ == "")("pippo") && !negAsLambda(_ == "")(""))

    var positive: Int => Boolean = _ >= 0
    println(neg(positive)(-6) && !neg(positive)(17))
    println(negAsLambda(positive)(-6) && !negAsLambda(positive)(17))

}
