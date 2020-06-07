import Core
import java.lang.Runtime.*
val core = Core()
fun main(args: Array<String>){
    do {
        core.clearConsole()
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
    core.clearConsole()
    println("Загадано 4-значное число с неповторяющимися цифрами")
    println("Приложение выводит в консоль, сколько цифр угадано без совпадения")
    println("с их позициями в тайном числе (то есть количество коров) и")
    println("сколько угадано вплоть до позиции в тайном числе (то есть количество быков).")
    println("")
    println("Для выхода введите 0")
    println("Для продолжения введите число, нажмите Enter")
    val secretNumber=core.getNumber()
    var input = String()
    var bullsCows = Core.BullsCowsStruct()
    do{
        input = readLine().toString()
        if (input=="0") {
            return
        }
        if(input==secretNumber.toString()){
            println("Вы выйграли")
            println("Для продолжения нажмите Enter")
            readLine()
            return
        }
        if (! core.checkInput(input)){
            println("Введите 4-значное число с неповторяющимися цифрами")
        }
        else{
            bullsCows=core.calcBullsCows(input, secretNumber.toString())
            println("быки: ${bullsCows.bulls}")
            println("коровы: ${bullsCows.cows}")
        }
    }while (true)
}
