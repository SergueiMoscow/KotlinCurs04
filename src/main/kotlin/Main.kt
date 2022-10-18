var animalsList = mutableListOf<Animal>()
fun loadLists() {
    var herbivore = Herbivore("Слон", "mammal")
    herbivore.hooves = false
    herbivore.horns = false
    herbivore.foodForHuman = false
    herbivore.legsCount = 4
    animalsList.add(herbivore)

    herbivore = Herbivore("Корова", "mammal")
    herbivore.hooves = true
    herbivore.horns = true
    herbivore.foodForHuman = true
    herbivore.legsCount = 4
    animalsList.add(herbivore)

    herbivore = Herbivore("Курица", "bird")
    herbivore.hooves = false
    herbivore.horns = false
    herbivore.foodForHuman = true
    herbivore.legsCount = 2
    animalsList.add(herbivore)

    var carnivour = Carnivorus("Волк", "mammal")
    carnivour.predator = true
    carnivour.legsCount = 4
    animalsList.add(carnivour)

    carnivour = Carnivorus("Акула", "fish")
    carnivour.predator = true
    carnivour.legsCount = 0
    animalsList.add(carnivour)

    carnivour = Carnivorus("Ястреб", "bird")
    carnivour.predator = true
    carnivour.legsCount = 2
    animalsList.add(carnivour)

    carnivour = Carnivorus("Шакал", "mammal")
    carnivour.predator = false
    carnivour.legsCount = 4
    animalsList.add(carnivour)
}

fun printList() {
    animalsList.forEach {it.print()}
}
fun main() {
    loadLists()
    printList()
}