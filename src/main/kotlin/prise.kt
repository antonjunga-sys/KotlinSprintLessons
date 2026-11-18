
fun main() {
    val price = 1200
    val discountPercent = 15

    val savings = price * discountPercent / 100
    val finalPrice = price - savings

    println("Цена: $price руб.")
    println("Со скидкой: $finalPrice руб.")
    println("Экономия: $savings руб.")
}

