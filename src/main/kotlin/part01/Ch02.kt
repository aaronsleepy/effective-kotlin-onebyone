package part01


fun main() {
    findPrimesNaive()
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