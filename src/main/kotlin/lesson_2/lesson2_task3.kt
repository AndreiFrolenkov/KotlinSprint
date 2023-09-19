package lesson_2

/*Задача 3 к Уроку 2

Сайт с расписанием поездов получает данные с сервера.
Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них.
Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.
 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.
*/

fun main() {

    val departHour = 9
    val departMinute = 39
    val travelTime = 457
    val departureTimeInMinutes = departHour * 60 + departMinute
    val totalMinutes = departureTimeInMinutes + travelTime
    val arrivalHour = (totalMinutes / 60) % 24
    val arrivalMinute = totalMinutes % 60

    val result = String.format("%02d:%02d", arrivalHour, arrivalMinute)
    println(result)
}