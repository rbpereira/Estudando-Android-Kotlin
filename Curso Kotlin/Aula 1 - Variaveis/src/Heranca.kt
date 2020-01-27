fun main(args: Array<String>) {
    val cao = Cao()
    cao.dormir()

    val passaro = Passaro()
    passaro.dormir()
}

open class Animal(){
    fun dormir(){
        println("Dormir")
    }
}

class Passaro : Animal(){
}

class Cao : Animal(){
}