fun main(args: Array<String>){
    println("Hello, ${args[0]}")
    val temp = 20
    val isHot = if (temp > 40) true else false
    println(isHot)
    val isUnit = println("this is an expression")
    println(isUnit)
    printHello("boss")

    drive()
    drive("slow")
    drive(speed = "turtle-like")

    val books = listOf("nature","biology","birds")
    println(books.filter { it[0] == 'b' })

    println(shouldChangeWater())
    //primary construct
    val aa0 = A(a = 66.0)
    aa0
    //second construct
    val aa1 = A(name = "sad")
    aa1
    //second construct
    val aa2 = A(dia = 6)
    aa2
    val cc = Constructors(i = 2)
    cc

    val thaiCode = Language.THAI.code
    println(thaiCode)
}

fun printHello(name: String?):Unit {
    println("Hi there!")
}

fun drive(speed: String = "fast"){
    println("driving $speed")
}

//compact function
fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

//default values
fun shouldChangeWater (day: String = "Sunday", temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else  -> false
    }
}

class A(val a:Double) {
    constructor(name: String) : this(1.0){
        println(a)
        println(name)
    }
    constructor(dia:Int) : this(dia / 2.0){
        println("$dia + $a")
    }
    init {
        println("area : ${Math.PI * a * a}")
    }

}

class Constructors {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor $i")
    }
}

enum class Language(var code: String) {
    //ในวงเล็บคือตัวแปร code
    ENGLISH("en"),
    JAPANESE("ja"),
    KOREAN("ko"),
    RUSSIAN("ru"),
    THAI("th")
}
