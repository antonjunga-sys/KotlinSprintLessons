
fun main() {
    val revenue: Int = 14250
    val orders: Int = 8

    val average = revenue.toDouble() / orders
    val averageRough = revenue / orders

    println("Выручка: $revenue руб.")
    println("Заказов: $orders")
    println("Средний чек: $average руб.")
    println("Средний чек (грубо): $averageRough руб.")
}

