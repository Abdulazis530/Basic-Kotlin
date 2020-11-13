/*Parameter yang berada diposisi akhir, memiliki kemampuan menjadi varags*/
/*Varags artinya datanya bisa menerima lebih dari satu input, atau anggap saja semacam array*/
/*Bedanya dengan parameter biasa dengan tipe data Array adalah:*/
/*1.Jika parameter tipe Array, kita wajib membuat array terlebih dahulu sebelum mengirimkan ke function*/
/*2.Jika parameter menggunakan varrags, kita bisa langsung mengirim datanya, jika lebih dari satu cukup gunakan tanda koma*/

fun hitungTotalArray(values: Array<Int>): Int{
    var total=0
    for(value in values){
        total+=value
    }
    return total
}

fun hitungTotalVarags(name: String,vararg values: Int): String{
    var total=0
    for(value in values){
        total+=value
    }
    return "Duit si $name cuma $total ribu, ih miskin!"
}

fun main() {
    /*dengan array biasa*/
    var valuesArray= arrayOf(10,10,10,10)
    var result=hitungTotalArray(valuesArray)

    /*dengan varags biasa*/
    var name ="Azis"
    var resultVarags=hitungTotalVarags(name,10,10)
    println(result)
    println(resultVarags)
}