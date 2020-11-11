fun sayHello(firstName:String, lastName:String?){
    if(lastName==null) {
        println("test")
    } else {
        println("Hello $firstName $lastName")
    }
}

//default parameter
fun defaultParam(firstName: String,lastName: String ="wkkww"){
    println("$firstName $lastName")
}

fun main() {
    sayHello("ABdul",null)
    defaultParam("Abdul")
    defaultParam("Abdul","GOMU goMU")
}