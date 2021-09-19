fun main(){
    val age = -1
    val min_age = 18;
    print("Enter your age: ")
    try {
        val age = readLine()!!.toInt()
        if (age <= min_age){
            print("You are not old enough")
        } else {
            print("Welcome!")
        }
    } catch (e: Exception){
        println("Please enter numbers only")
    }
}