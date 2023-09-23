package lesson_3

/*Задача 5* к Уроку 3
Продолжаем работать над приложением “Шахматы”. Напиши программу для сервера, которая примет строку,
отправленную игроком (считаем эти данные уже известными и объявляем строку с данными: “D2-D4;0”.
Необходимо будет сделать обратное. Распарсить строку – разбить ее на 3 составляющих: откуда, куда и номер хода,
присвоить соответствующим переменным и распечатать по отдельности.
*/

fun main() {

    val stepInfo = "D2-D4;0"
    val startPosition = stepInfo.substringBefore("-")
    val endPosition = stepInfo.substring(3,5)
    val stepNumber = (stepInfo.substringAfter(";")).toInt()
    println(startPosition)
    println(endPosition)
    println(stepNumber)
}