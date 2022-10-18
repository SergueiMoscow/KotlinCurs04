class AnimalClass constructor (var paramKey:String) {
    var key:String = this.paramKey
        set(value) {
            setAnimalClassName(value)
        }
    var name: String = "Not Defined"

    fun setAnimalClassName(value:String) {
        when (paramKey) {
            "bird" -> name = "Птицы"
            "fish" -> name = "Рфбы"
            "mammal" -> name = "Млекопитающие"
            else -> {
                key = "NotDefined"
                name = "Не определено"
            }
        }
    }
}