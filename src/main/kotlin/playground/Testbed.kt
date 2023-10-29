import playground.Person
import playground.definePerson

fun main() {
    val person = Person("Alice", 27) // no new keyword
    println("Professional name : ${person.name}")
    println("Professional level : ${definePerson(person.experience)}")
}

fun listsInKt() {
    val mutableList = mutableListOf("Java")
    mutableList.add("Kotlin")

    val readOnlyList = listOf("Java")
}