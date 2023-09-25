package lesson_3

/*Задача 5* к Уроку 3
Продолжаем работать над приложением “Шахматы”. Напиши программу для сервера, которая примет строку,
отправленную игроком (считаем эти данные уже известными и объявляем строку с данными: “D2-D4;0”.
Необходимо будет сделать обратное. Распарсить строку – разбить ее на 3 составляющих: откуда, куда и номер хода,
присвоить соответствующим переменным и распечатать по отдельности.
*/

fun main() {

    val stepInfo = "D2-D4;0"
    val dataString = stepInfo.split("-", ";")
    val startPosition = dataString[0]
    val endPosition = dataString[1]
    val stepNumber = dataString[2]

    println(startPosition)
    println(endPosition)
    println(stepNumber)
}