package u02

object Compose extends  App {
  
    def compose[A,B,C] (f: B => C, g: A => B) : (A => C) =
        x => f(g(x))


    val g: Int => Boolean = _ >= 0
    val f: Boolean => String = x => if x then "pippo" else "ciccio"
    print(compose(f, g)(0) == "pippo")

}
