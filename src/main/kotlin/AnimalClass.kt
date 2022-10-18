class AnimalClass constructor (var paramKey:String="") {
    var name: String = ""
    var key:String = this.paramKey
        set(value) {
            println("Set $field $value")
            when (value) {
                "bird" -> name = "Птицы"
                "fish" -> name = "Рфбы"
                "mammal" -> name = "Млекопитающие"
                else -> {
                    field = "NotDefined"
                    name = "Не определено"
                }
            }
        }

    fun init() {
        key = paramKey
    }
}