fun fullName(firstName:String,middleName:String,lastName:String){
    println("$firstName $middleName $lastName")
}

fun main() {

    fullName(
            firstName = "tukiman",
            middleName = "Edward",
            lastName="Gate"
    )

    fullName(
            lastName="Gate",
            firstName = "tukiman",
            middleName = "Edward"

    )
}