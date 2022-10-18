const val BLUE :String = "\u001B[34m"
const val RESET :String = "\u001B[0m"

public open class Animal constructor(var name:String, var initAnimalClass:String) {
    //animalClass - рыбы, птицы, млекопитающие и т.д.
    open var legsCount = 4
    var animalClass: AnimalClass

    init {
        animalClass = AnimalClass(initAnimalClass)
        animalClass.key = initAnimalClass
    }

    open fun print() {
        print(
            outputProperty("Название", name) +
                    outputProperty("Класс", animalClass.name) +
                    outputProperty("Ног", legsCount.toString())
        )
    }

    fun outputProperty(caption: String, value: String) :String {
        return " $caption: $BLUE$value$RESET "
    }

}