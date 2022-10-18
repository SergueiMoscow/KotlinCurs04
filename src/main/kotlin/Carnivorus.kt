// Плотоядные
class Carnivorus (name:String, animalClass:String) : Animal(name, animalClass){
    var predator = true // хищник

    override fun print() {
        super.print()
        println(outputProperty("Питание", if (predator) " Хищник " else " Падальщик "))
    }
}