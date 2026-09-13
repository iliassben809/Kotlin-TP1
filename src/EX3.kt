fun main(){
    //Exercice 3 :
    // Écris un programme qui demande à l’utilisateur d’entrer un nombre.
    // 1.  Si le nombre est pair, affiche 'Le nombre est pair'.
    // 2. Sinon, affiche 'Le nombre est impair'.
  println("==============PAIR / IMPAIR=========== ")
  print("Ecrire un nombre : ")
  val nbr = readLine()!!.toInt()
  if (nbr % 2 == 0){
      print("$nbr est pair")
  }
  else
      print("$nbr est impair")
}