/**
 * Here we have a class with a primary constructor and a member function.
 * Note that there's no `new` keyword used to create an object.
 * See http://kotlinlang.org/docs/reference/classes.html#classes
 */

class Greeter(val name: String) {
    fun greet() {
        println("Hello, ${name}");
    }
}

fun main(args: Array<String>) {
    if (args.isNotEmpty()){
        Greeter(args[0]).greet()
    }
    else{
        println("Please provide a name as a parameter")
    }
}