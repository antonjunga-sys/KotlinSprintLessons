
fun main() {
    val price = 1200
    val discount = 15

    val savings = price * discount / 100
    val finalPrice = price - savings

    println("Цена: $price руб. Со скидкой: $finalPrice руб. Экономия: $savings руб.")
}
