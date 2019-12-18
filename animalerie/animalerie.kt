
fun main(arg: Array<String>) {

    println("Bienvenue dans cet animalerie")

    val profil = Animalerie()



    var name = Animalerie()
    val Livi: Animal = Chat()
    val ErBao: Animal = Chien()
    val Pikajou: Animal = Perroquet()


    name.add(Livi)
    name.add(ErBao)
    name.add(Pikajou)


    name.profil()

}



class Animalerie{

    var Names = mutableListOf<Animal>()

    fun add(animaux : Animal){
        Names.add(animaux)
    }

    fun profil(){
        println("Les animaux disponnibles sont: $Names")
        for (animal in Names)
        {
            println("Type:")
            animal.quiSuisJe()
            println("Moyen de communication:")
            animal.parler()

        }
    }
}

interface Animal{
    fun quiSuisJe()
    fun parler()

}

class Chien:Animal{
    override fun quiSuisJe() {
        println("chien")
    }
    override fun parler() {
        println("aboieyement")
    }

}
class Chat:Animal{
    override fun quiSuisJe() {
        println("chat")
    }
    override fun parler() {
        println("miaulements")
    }


}
class Perroquet:Animal{
    override fun quiSuisJe() {
        println("Perroquet")
    }

    override fun parler() {
        println("imitation de la parole humaine")
    }

}
