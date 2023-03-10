package part01

import kotlin.properties.Delegates

/** 읽기 전용 프로퍼티 */
val name: String? = "Marton"
val surname: String = "Braun"

val fullName: String?
    get() = name?.let { "$it $surname" }

val fullName2: String? = name?.let { "$it $surname" }



fun main() {
    /** 다른 종료의 변경 가능 지점 */
    val list1: MutableList<Int> = mutableListOf()
    var list2: List<Int> = listOf()

    list1.add(1)
    list1.add(2)
    println(list1)

    list2 = list2 + 1
    list2 = list2 + 2
    println(list2)

    var names by Delegates.observable(listOf<String>()) { _, old, new ->
        println("Names cahnged from $old to $new")
    }

    names +=  "Fabio"
    names += "Bill"
}