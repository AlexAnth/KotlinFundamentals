package playground

data class Person(var name: String, var experience: Int)

// data modifier adds equals hashCode and toString method

fun definePerson(expertise: Int): String {
    return when {
        expertise > 15 -> "Senior"
        expertise > 6 -> "Mid"
        else -> "Junior"
    }
}

