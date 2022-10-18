const val NO: String = "Нет "
const val YES: String = "Да "
const val EXISTS: String = "Есть "

// Травоядные
class Herbivore (name:String, animalClass:String) : Animal(name, animalClass){
    var hooves = false // копыта
    var horns = false // рога
    var foodForHuman = false
    override fun print() {
        super.print()
        println(
            outputProperty("Копыта", if (hooves) EXISTS else NO) +
                    outputProperty("Рога", if (horns) EXISTS else NO) +
                    outputProperty("Пища для человека", if (foodForHuman) YES else NO)
        )
    }
}