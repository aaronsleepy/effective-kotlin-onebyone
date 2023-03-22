package part01.yield

fun main() {
    val fibonacci = sequence {
        var terms = Pair(0, 1)
        while (true) {
            yield(terms.first)
            terms = Pair(terms.second, terms.first + terms.second)
        }
    }


    val fibonacciIterator = fibonacci.iterator()
    var count = 5
    while (count > 0) {
        println(fibonacciIterator.next())
        count--
    }

}