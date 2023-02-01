package example.myapp

abstract class AquariumFish : FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}

//class Shark: AquariumFish(), FishAction {
//    override val color = "grey"
//    override fun eat() {
//        println("hunt and eat fish")
//    }
//}

class Shark: FishColor, FishAction {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}

//ver.1
//class Plecostomus: AquariumFish() {
//    override val color = "gold"
//    override fun eat() {
//        println("eat algae")
//    }
//}

//ver.2
//class Plecostomus: FishAction, FishColor by GoldColor {
//    override fun eat() {
//        println("eat algae")
//    }
//}

//ver.3
class Plecostomus(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae edition"),
    FishColor by fishColor {

}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

object GoldColor : FishColor {
    override val color = "gold edition"
}

interface FishAction  {
    fun eat()
}

interface FishColor {
    val color: String
}

