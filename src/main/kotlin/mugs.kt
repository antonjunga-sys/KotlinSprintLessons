
fun main() {
    val mugs = 127
    val boxSize = 12

    val fullBoxes = mugs / boxSize
    val remainingMugs = mugs % boxSize
    val boxesNeeded = (mugs + boxSize - 1) / boxSize

    println("Полных коробок: $fullBoxes")
    println("Кружек без коробки: $remainingMugs")
    println("Коробок нужно всего: $boxesNeeded")
}

