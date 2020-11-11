fun makeArray(value1:String, value2:String, value3:String):Array<String>{
return arrayOf(value1,value2,value3)



}

fun main() {
val result =makeArray("A","B","C")
    val sizeOfResult=result.size-1
    for (i in 0..sizeOfResult){
        println(result[i])
    }

}