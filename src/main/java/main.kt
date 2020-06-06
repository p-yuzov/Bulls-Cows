import Core
import java.lang.Runtime.*
val core = Core()
fun main(){
    do {
        getRuntime().exec("clear")
        println("1-Новая игра ")
        println("0-Выход ")
        val input = readLine()
        when(input)
        {
            "1"->newGame()
            "0"->return
            else -> {
                println("Введите номер меню и нажмите Enter")
                println("Для продолжения нажмите Enter")
                readLine()
            }

        }
    }while (true)

}

fun newGame() {
    getRuntime().exec("clear")
    println("Загадано число 4-значное число с неповторяющимися цифрами")
    println("Введите число, нажмите Enter")
    println("Приложение выводит в консоль, сколько цифр угадано без совпадения")
    println("с их позициями в тайном числе (то есть количество коров) и")
    println("сколько угадано вплоть до позиции в тайном числе (то есть количество быков).")
    println("")
    println("Для выхода введите 0")
    val secretNumber=core.getNumber()
    do{
        val input = readLine()
        if (input=="0") {
            return
        }
        if(input==secretNumber.toString()){
            println("Вы выйграли")
            println("Для продолжения нажмите Enter")
            readLine()
        }

    }while (true)
}
