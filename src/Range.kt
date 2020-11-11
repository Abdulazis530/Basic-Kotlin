fun main() {
    //untuk  membuat array berururtan
    val range=1..100
    //operasi range
    //1. count()
    //2. contain(value)
    //3. first --> mendapatkan nilai awal
    //4. last --> nilai akhir
    //5. step --> kenaikan

    println("RANGE")
    println(range.count())
    println(range.contains(1))
    println(range.contains(101))
    println(range.first)
    println(range.last)
    println(range.step)

    println("RANGE TERBALIK")

    val reverseRange=100 downTo 0 step 2
    println(reverseRange.count())
    println(reverseRange.first)
    println(reverseRange.last)
    println(reverseRange.step)


}