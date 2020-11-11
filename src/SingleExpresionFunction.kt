fun singleButNoReturn(name:String):Unit= println("hei $name ini nge test aja")
fun singleReturn(a:Int):Int=a*a

fun main() {
    singleButNoReturn("Azis");
    val resultSingleReturn:Int = singleReturn(2)
    println(resultSingleReturn)
}