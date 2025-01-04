fun main() {

    /*
    Создать класс Bird(птица).
    Определить у него несколько свойств, например, тип(пеликанообразные, фламингообразные и тд).
    Создать в классе свойство, которое будет характеризовать по какому-то явному признаку,
    например, есть птицы, которые не могут подниматься в воздух или по –другому признаку.
    Определить функциональность класса птица.
    Создать несколько классов наследников, которые могут переопределять свойства и функции класса – родителя.
    */
    val ostrich = Ostrich()
    println(ostrich)
    ostrich.infoBird()
    val penguin = Penguin()
    println(penguin)
    penguin.infoBird()
    val stork = Stork()
    println(stork)
    stork.infoBird()
    println()

    val array = arrayOf("свойств", "Определить функциональность", "функции", "массив",
        "несколько классов наследников")
    println(array.contentDeepToString())
    val result = longestWordInTheArray(array)
    println("Самое длинное слово в массиве: $result, и количество букв в этом слове: ${result.length}")
    println()

    val string = "ПриВет, кАк деЛа"
    println(string)
    println("Количество символов, находящихся в верхнем регистре: ${uppercaseCharacters(string)}")
}

/*
Дан массив строк.
Найти самое длинное слово в массиве и количество букв в этом слове.
*/
fun longestWordInTheArray(array: Array<String>): String{
    var result = ""
    for (a in array) for (b in a.split(" ")) if (b.length > result.length) result = b
    return result
}

/*
Дана строка «ПриВет, кАк деЛа».
Необходимо найти символы, находящиеся в верхнем регистре, вывести их и посчитать их количество.
*/
fun uppercaseCharacters(string: String): Int {
    var count = 0
    print("Символы, находящиеся в верхнем регистре: ")
    for (a in string.toCharArray()){
        if (a.isUpperCase()){
            print("$a ")
            count++
        }
    }
    println()
    return count
}

/*
Примечания:
Для вывода значений на экран используйте функцию println().
*/