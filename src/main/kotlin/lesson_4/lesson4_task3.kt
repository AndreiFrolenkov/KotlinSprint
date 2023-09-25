package lesson_4

/*Задача 3 к Уроку 4
На территории агрокомплекса функционирует система автоматического мониторинга условий для роста растений.
Напиши программу, которая будет определять, подходят ли текущие условия для успешного роста бобовых культур.
Критерии благоприятных условий включают:
- наличие солнечной погоды;
- открытый тент;
- влажность воздуха составляет 20%;
- текущее время года - не зима.
Программа должна выводить результат анализа условий в формате: “Благоприятные ли условия сейчас для
роста бобовых? true/false”
Для проверки работы программы, инициализируй переменные следующими значениями:
- погода сегодня - солнечная;
- тент на данный момент - открыт;
- влажность воздуха - 20%;
- текущее время года - зима.
И типами данных - boolean, boolean, int, String.
*/


fun main() {

    val isCurrentSunnyWeather = true
    val isCurrentAwningOpened = true
    val currentAirHumidity = 20
    val currentSeason = "winter"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
                    (SUNNY_WEATHER == isCurrentSunnyWeather) &&
                    (AWNING_OPENED == isCurrentAwningOpened) &&
                    (AIR_HUMIDITY == currentAirHumidity) &&
                    (SEASON != "winter")}"
    )

}

const val SUNNY_WEATHER = true
const val AWNING_OPENED = true
const val AIR_HUMIDITY = 20
const val SEASON = "winter"