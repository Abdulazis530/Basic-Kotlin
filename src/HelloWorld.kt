fun main() {
    // type data kotlin
    //number : integer and float
    var age : Byte =30;
    var height :Int =232
    var distance:Short=2000
    var balance:Long=100000000L

    var thisIsFloat :Float =22.54F
    var thisIsDouble:Double=22.54221312

    println(age > height)
    println(thisIsFloat)
    println(thisIsDouble)

    //Conversion
    var number :Int= 100

    var byte: Byte=number.toByte()
    var short: Short=number.toShort()

    println(byte)
    println(short)


}