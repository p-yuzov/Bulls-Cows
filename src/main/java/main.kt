import Core
import java.lang.Runtime.*

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
    return
}
