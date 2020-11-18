fun main() {
    val options = arrayOf("Rock","Paper","Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun printResult(userChoice:String, gameChoice:String) {
    val result:String
    if(userChoice == gameChoice) result = "Tie!"
    else if((userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")) result ="You win!"
    else result = "You lose!"
    println("You choose ${userChoice}. And I choose ${gameChoice}. Result - ${result}")
}

fun getUserChoice(optionParams: Array<String>):String {
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice){
        print("Please enter one of the following:")
        for (item in optionParams){ // for reverse order use  - downTo
            print(" ${item}")
        }
        println(".")
        //Read the user input
        val userInput = readLine();
        if(userInput != null && userInput in optionParams){
            isValidChoice = true
            userChoice = userInput.capitalize()
        }
        if(!isValidChoice) println("You must enter valid choice")
    }

    return userChoice
}

fun getGameChoice(optionParams: Array<String>) = optionParams[(Math.random() * optionParams.size).toInt()]
