
fun main() {
    val shiftMinutes = 437
    val orders = 23
    val payPerOrder = 85

    // Перевод минут в часы и минуты
    val hours = shiftMinutes / 60
    val minutes = shiftMinutes % 60

    // Расчёт заработка
    val totalPay = orders * payPerOrder

    // Средняя выручка с заказа
    val averagePay = totalPay / orders

    // Среднее время на один заказ
    val minutesPerOrder = shiftMinutes / orders

    // Вывод отчёта
    println("Смена: $hours ч $minutes мин")
    println("Заказов: $orders")
    println("Заработок: $totalPay руб.")
    println("Средняя выручка с заказа: $averagePay руб.")
    println("В среднем минут на заказ: $minutesPerOrder")
}

