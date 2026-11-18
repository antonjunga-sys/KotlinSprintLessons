
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

    val laptopPrice = 89990
    val remaining = laptopPrice - balance
    val monthsNeeded = (remaining + saved - 1) / saved

    println()
    println("=== Итог месяца ===")
    println("Доход: $salary руб.")
    println("Расходы: $spent руб. ($spentShare% дохода)")
    println("Отложено: $saved руб.")
    println("На счёте: $balance руб.")

    println()
    println("=== Цель: ноутбук за $laptopPrice руб. ===")
    println("Уже есть: $balance руб.")
    println("Осталось накопить: $remaining руб.")
    println("Откладывая по $saved руб. в месяц — цель через $monthsNeeded мес.")
}
