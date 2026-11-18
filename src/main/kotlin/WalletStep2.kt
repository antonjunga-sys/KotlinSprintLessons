
fun main() {
    var balance = 5200

    val salary = 34000
    val rent = 15000
    val food = 8500
    val transport = 2100
    val books = 1590

    println("Старт месяца: $balance руб.")

    balance += salary
    println("Стипендия: $balance руб.")

    balance -= rent
    println("Аренда: $balance руб.")

    balance -= food
    println("Еда: $balance руб.")

    balance -= transport
    println("Транспорт: $balance руб.")

    balance -= books
    println("Книги: $balance руб.")

    println("Конец месяца: $balance руб.")

    val spent = rent + food + transport + books
    val spentShare = spent * 100 / salary
    val saved = salary - spent
    val averageSpent = spent / 30
    val averageSpentExact = spent.toDouble() / 30

    println("--- Аналитика месяца ---")
    println("Потрачено всего: $spent руб.")
    println("Доля трат от дохода: $spentShare%")
    println("Отложено за месяц: $saved руб.")
    println("Средние траты в день: $averageSpent руб.")
    println("Точнее: $averageSpentExact руб.")
}

