
fun main() {
    // Выручка касс в копейках
    val cash1 = 1254350
    val cash2 = 987425
    val cash3 = 758225
    val orders = 40

    // Общая выручка
    val total = cash1 + cash2 + cash3

    // Рубли и копейки каждой кассы
    val rub1 = cash1 / 100
    val kop1 = cash1 % 100

    val rub2 = cash2 / 100
    val kop2 = cash2 % 100

    val rub3 = cash3 / 100
    val kop3 = cash3 % 100

    // Доля каждой кассы в процентах
    val percent1 = cash1 * 100 / total
    val percent2 = cash2 * 100 / total
    val percent3 = cash3 * 100 / total

    // Общая выручка в рублях и копейках
    val totalRub = total / 100
    val totalKop = total % 100

    // Средний чек
    val average = total / orders
    val averageRub = average / 100
    val averageKop = average % 100

    // Вывод отчёта
    println("=== Отчёт за смену ===")
    println("Касса 1: $rub1 руб. $kop1 коп. ($percent1%)")
    println("Касса 2: $rub2 руб. $kop2 коп. ($percent2%)")
    println("Касса 3: $rub3 руб. $kop3 коп. ($percent3%)")
    println("Итого: $totalRub руб. $totalKop коп.")
    println("Заказов: $orders")
    println("Средний чек: $averageRub руб. $averageKop коп.")
}

