package u02

object Positive extends App {

    def positiveFunction(value: Int): String =
        value match
            case x if x < 0 => "negative"
            case _ => "positive"
    
    val positiveLambda: Int => String = value => value match
            case x if x < 0 => "negative"
            case _ => "positive"

    println(positiveFunction(10))
    println(positiveFunction(0))
    println(positiveFunction(-1))
    println(positiveLambda(10))
    println(positiveLambda(0))
    println(positiveLambda(-1))
  
}
