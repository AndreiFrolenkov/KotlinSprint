package lesson_4

/*Задача 2 к Уроку 4
При работе на таможенном терминале важно точно определить категорию каждого груза.
Напиши программу, которая проверяет, соответствует ли груз категории "Average".
Эта категория имеет следующие параметры: вес от 35 кг до 100 кг (включительно), и объем меньше 100 литров.
Создай программу, которая отображает соответствие данных груза категории "Average".
Вывод программы может выглядеть так: "Груз с весом 42 кг и объемом 120 л соответствует категории 'Average': false".
- укажи предварительно заданные параметры категории;
- проверь, соответствуют ли следующие грузы категории "Average": 20 кг / 80 л и 50 кг / 100 л;
- сделай сравнение непосредственно внутри println() и без использования диапазонов.
*/

fun main() {

    val minAverageWeight = 35
    val maxAverageWeight = 100
    val maxAverageVolume = 100

    var currentWeight = 42
    var currentVolume = 120
    println("Груз с весом $currentWeight и объемом $currentVolume"
            + " соответствует категории \'Average\': " +
            "${(minAverageWeight <= currentWeight && maxAverageWeight >= currentWeight) && (currentVolume < maxAverageVolume)}")
    println()

    currentWeight = 20
    currentVolume = 80
    println("Груз с весом $currentWeight и объемом $currentVolume"
            + " соответствует категории \'Average\': " +
            "${(minAverageWeight <= currentWeight && maxAverageWeight >= currentWeight) && (currentVolume < maxAverageVolume)}")
    println()

    currentWeight = 50
    currentVolume = 100
    println("Груз с весом $currentWeight и объемом $currentVolume"
            + " соответствует категории \'Average\': " +
            "${(minAverageWeight <= currentWeight && maxAverageWeight >= currentWeight) && (currentVolume < maxAverageVolume)}")
}