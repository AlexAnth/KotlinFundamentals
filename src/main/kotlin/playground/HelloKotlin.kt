package playground

/**
 no need for class
 variables -> val (read only) or var (mutable)
 object references can be val but still have their content modified (just like in Java)
 in essence val corresponds to a final variable in Java
 kotlin is a statically typed language meaning that every variable & expression has a type even if you emit it
 var number = 1 is the same as var number:Int = 1
 strive to declare val (immutable) as it is closer to the functional style of programming
 */

fun main() {
    val name = "Kotlin"
    println("Hello, $name!")
}

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")
}