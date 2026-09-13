fun main(){
// le Caree :
    println("===Le caree d'un nombre===")
    print("Saisir un nombre entie: ")
    val nbr : Int = readLine()!!.toInt()
    val resultcaree = Carre(nbr)
    println("le carre du nombre $nbr est $resultcaree")

// l'Addition :
    println("===La somme de deux nombres===")
    print("Saisir le 1er nombre entie: ")
    val nbr1 : Int = readLine()!!.toInt()
    print("Saisir le 2eme nombre entie: ")
    val nbr2 : Int = readLine()!!.toInt()
    val resultsum = Addition(nbr1 , nbr2)
    println("$nbr1 + $nbr2 = $resultsum")

//le Max:
    println("===Le plus grande nombre===")
    print("Saisir le 1er nombre entie: ")
    val nbr3 = readLine()!!.toInt()
    print("Saisir le 1er nombre entie: ")
    val nbr4 = readLine()!!.toInt()
    val resultmax = Maximun(nbr3, nbr4)
    println("$resultmax")


// la paraite :
    println("===La paraite des nombres===")
    print("Saisir un nombre entie: ")
    val nbr5 : Int = readLine()!!.toInt()
    val resultparaite = EstPair(nbr5)
    println("$resultparaite")

}
fun Carre(nbr : Int): Int{
    var x : Int =  nbr * nbr
    return x
}
fun Addition(nbr1 : Int, nbr2 : Int) : Int{
   val x : Int = nbr1 + nbr2
    return x
}
fun Maximun(nbr3: Int , nbr4 : Int):String{
    if (nbr3 > nbr4){
       return "le plus grande nombre entie $nbr3"
    }
    else {
        return "le plus grande nombre entie est $nbr4"
    }
}

fun EstPair(nbr5 : Int) : String{
    if (nbr5 % 2 ==0){
        return "le nombre $nbr5 est pair."
    }
    else{
        return "le nombre $nbr5 est impair"
    }


}