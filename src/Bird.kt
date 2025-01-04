open class Bird(val kind: String, open val abilityToFly: Boolean = true) {

    open fun infoBird(){
        println("Птицы — теплокровные позвоночные животные, передние конечности которых превратились в крылья," +
                " а тело покрыто перьями. Большинство видов птиц приспособлено к полёту.")
    }

    override fun toString(): String {
        return "Bird(kind='$kind', abilityToFly=$abilityToFly)"
    }


}