package part01


fun main() {
//    findPrimesNaive()

    findPrimesSequence()

}

fun findPrimesNaive() {
    var numbers = (2..100).toList()
    val primes = mutableListOf<Int>()

    while (numbers.isNotEmpty()) {
        val prime = numbers.first()
        primes.add(prime)
        numbers = numbers.filter { it % prime != 0 }
    }
    print(primes)
}

fun findPrimesSequence() {
    val primes = sequence {
        var numbers = generateSequence(2) { it + 1}
        var prime: Int
        while (true) {
            prime = numbers.first()
            yield(prime)

            numbers = numbers.drop(1)
                .filter { it % prime != 0 }
        }
    }

    print(primes.take(10).toList())
}