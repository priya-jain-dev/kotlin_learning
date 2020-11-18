class Dog(val name:String, var weight:Int, val breed:String){
    fun bark(){
        println(if(weight > 20) "Yip" else "Woof")
    }
}

fun main() {
    var dog = Dog("Fido", 70,"mixed")
    dog.bark()
}