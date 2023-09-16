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
        "0${hours.toString()}"
    } else hours.toString()

    val minutes: Int = secondsInSpace / 60 % 60
    val minutesToString = if (minutes < 10) {
        "0${minutes.toString()}"
    } else minutes.toString()

    val seconds: Int = secondsInSpace % 60
    val secondsToString = if (seconds < 10) {
        "0${seconds.toString()}"
    } else seconds.toString()

    print(hoursToString + ":")
    print(minutesToString + ":")
    print(secondsToString)
}