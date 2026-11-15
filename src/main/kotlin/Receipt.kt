
fun main() {
    // Цены и количество товаров
    val mugPrice = 350
    val mugCount = 2

    val shirtPrice = 1200
    val shirtCount = 1

    val stickerPrice = 150
    val stickerCount = 3

    // Стоимость каждой позиции
    val mugTotal = mugPrice * mugCount
    val shirtTotal = shirtPrice * shirtCount
    val stickerTotal = stickerPrice * stickerCount

    // Общая стоимость заказа
    val total = mugTotal + shirtTotal + stickerTotal

    // Вывод чека
    println("Кружка x$mugCount — $mugTotal руб.")
    println("Футболка x$shirtCount — $shirtTotal руб.")
    println("Стикерпак x$stickerCount — $stickerTotal руб.")
    println("Итого: $total руб.")
}
