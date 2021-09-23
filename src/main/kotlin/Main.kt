fun main() {

    do {
        println("Please enter the number of your selection:")
        println("1: Scrambled eggs")
        println("2: Omelette")
        println("3: Sunny side up")
        println("4: Exit")
        val choice = readLine()!!.toInt()

        val result = when (choice) {
            !in 1..4 -> "Choice out of range\n"
            1 -> "You have selected\n1: Scrambled eggs\n"
            2 -> "You have selected\n2: Omelette\n"
            3 -> "You have selected\n3: Sunny side up\n"
            4 -> "You have selected\n4: Exit\n"
            else -> "Unknown choice\n"
        }
        println(result)

    } while (choice != 4)
    print("Goodbye!")


}
