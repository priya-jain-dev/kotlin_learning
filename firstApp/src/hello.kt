fun main() {
    //println always print in new line.
    println("Hello IntelliJ IDEA");
    //var - for variables whose value you want to change.
    //val - for variables whose value will stay same.
    var x = 1
    while (x < 3){ //run loop till x is less then 3
        print(if(x== 1) "Yab" else "Dab") //<- print in same line
        print("ba")
        x += 1 // increment by 1
    }
    if(x== 3){
        print("Do")
    }
    // How to explicitly declare a variable’s type
    var y:Long =6 //short data type .... Float, Int, Boolean, Char, String, Long.
    // How to convert a numeric value to another type
    //Every numeric type has the following conversion functions: toByte(), toShort(),
    // toInt(), toLong(), toFloat() and toDouble().
    var z:Long = x.toLong();
    var myArray = arrayOf(1,2,3);
    println("myArray.size =>" + myArray.size)//return length of array.

}