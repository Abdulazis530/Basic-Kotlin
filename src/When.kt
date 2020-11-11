fun main() {
    val hasilUjian="A"
     when(hasilUjian){
         "A"-> println("MANTAP")
         "B"-> println("MAYAN")
         "C"-> println("DUHHH")
         "D"-> println("PEA")
         else ->println("PEA BANGET")
     }

    when(hasilUjian){
        "A","B","C"->println("LULUS")
        else-> println("GA LULUS")
    }

    //when expresion in

    val passValue= arrayOf("A","B","C")
    when(hasilUjian){
        in passValue -> println("PASS")
        !in passValue -> println("NOT PASS")
    }

    //when expresion is

    val name="AZZZZZ"

    when(name){
        is String -> println("Name is String")
        !is String -> println("NOT STRING")
    }


    //when pengganti if else

    val examValue =87
    when{
        examValue>88 -> println("nice gan")
        examValue>85 -> println("lumayan gan")
        else->println("belajar lagi!")
    }

}