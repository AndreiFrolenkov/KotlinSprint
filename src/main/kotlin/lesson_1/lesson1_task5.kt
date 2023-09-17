package lesson_1

/*
Задача 5* к Уроку 1
Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.
6480
*/


fun main() {

    val secondsInSpace: Int = 6487
    val hours: Int = secondsInSpace / 3600 % 24
    val hoursToString = if (hours < 10) {
        String.format("0%d", hours)
    } else String.format("%d", hours)

    val minutes: Int = secondsInSpace / 60 % 60
    val minutesToString = if (minutes < 10) {
        String.format("0%d", minutes)
    } else String.format("%d", minutes)

    val seconds: Int = secondsInSpace % 60
    val secondsToString = if (seconds < 10) {
        String.format("0%d", seconds)
    } else String.format("%d", seconds)

    println(String.format("%s:%s:%s", hoursToString, minutesToString, secondsToString))

//    val resultString = "$hoursToString:$minutesToString:$secondsToString"
//    println(resultString)
}