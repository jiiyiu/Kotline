fun main(args: Array<String>) {

    var i = 1

    println("Premier joueur, veuillez rentrer un nombre entre 1 et 10: ")
    var mdp = readLine()

    val compteur = null

    while (mdp!= compteur) {

        println("A ton tour joueur2, devine le nommbre entré par ton adversaire:")
        var tenta = readLine()

        if (tenta == mdp) {
            
            if (i >2) {
                println("Tu peux faire mieux")
                
                } else if (i < 2) {
                    println("Bien joué!")
                }
                println("tu a reussi en $i essais")
                println("Fin de partie.")


        } else if (mdp > tenta.toString()) {
            println("C'est superieur.\n")
            i++
            
        } else if (mdp < tenta.toString()) {
            println("C'est inferieur.\n")
            i++
        }
    }
    }
