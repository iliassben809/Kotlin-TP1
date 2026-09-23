//1. Déclare une variable nom de type String avec ton prénom.
// 2. Déclare une variable age de type Int.
// 3. Affiche : Je m'appelle [nom] et j'ai [age] ans.
// 4. Déclare une variable  ville de type String et donne-lui comme valeur ta ville.
// 5. Affiche la phrase suivante : J'habite à [ville].
// 6. Déclare une variable taille de type Double. Affiche : Ma taille est de [taille] mètres.
//7. Utilise l'interpolation de chaînes Kotlin pour afficher toutes les informations sur une seule ligne : a. Je m'appelle ilias, j'ai 18 ans, j'habite à Rabat et je mesure 1.75 m.

fun main(){
    val nom : String = "ilias"
    val age: Int = 18
    val Ville : String = "sale"
    val taille : Double = 1.72
    println("Je m'appelle $nom et j'ai $age ans, J'habite à $Ville et ma taille est de $taille mètres.")
}
