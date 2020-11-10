fun main(){
    //Kotlin mendukung 2 jenis variable
    //1. Mutabel bisa diubah var
    //2. Immutabel tidak bisa diubaha val
    //3. nullable variable : tapi tidak direkomendasikan
    var test : String? ="jojo"
//    test=null

    println(test?.length)

    //constant adalah variable immutable yang bisa diakses untuk keperluan global,
    //biasanya digunakan UPPERCASE untuk nama variable
    //biasanya di luar fun main dan wajib menggunakan val!
}