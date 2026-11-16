
fun main() {
    val orderTotal = 1350
    val received = 2000

    // Рассчитываем сдачу
    val change = received - orderTotal

    // Купюры по 500 рублей
    val count500 = change / 500
    val rest500 = change % 500

    // Купюры по 100 рублей
    val count100 = rest500 / 100
    val rest100 = rest500 % 100

    // Купюры по 50 рублей
    val count50 = rest100 / 50
    val rest50 = rest100 % 50

    // Купюры по 10 рублей
    val count10 = rest50 / 10

    // Общее количество купюр
    val totalCount = count500 + count100 + count50 + count10

    // Проверка правильности расчёта
    val check = count500 * 500 +
            count100 * 100 +
            count50 * 50 +
            count10 * 10 == change

    // Вывод чека
    println("К оплате: $orderTotal руб.")
    println("Получено: $received руб.")
    println("Сдача: $change руб.")
    println("  по 500: $count500")
    println("  по 100: $count100")
    println("  по 50: $count50")
    println("  по 10: $count10")
    println("Купюр всего: $totalCount")
    println("Проверка: $check")
}

