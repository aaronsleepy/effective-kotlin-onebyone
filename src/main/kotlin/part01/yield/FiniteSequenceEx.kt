package part01.yield

fun main() {
    val vowels = sequence {
        yield("a")
        yield("e")
        yield("i")
        yield("o")
        yield("u")
    }

    val vowelIterator = vowels.iterator()
    while (vowelIterator.hasNext()) {
        println(vowelIterator.next())
    }
}