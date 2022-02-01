//Un piano es un instrumento que interpreta las notas con un timbre muy
//característico
class Piano  //podenos añadir tantos atributos y métodos como necesitemos
    : Instrumento() {
    //implementamos el método abstracto
    //Recorreremos las notas y las interpretaremos de la forma específica del piano.
    override fun interpretar() {
        for (nota in melodia) {
            when (nota) {
                Nota.DO -> print("do ")
                Nota.RE -> print("re ")
                Nota.MI -> print("mi ")
                Nota.FA -> print("fa ")
                Nota.SOL -> print("sol ")
                Nota.LA -> print("la ")
                Nota.SI -> print("si ")
            }
        }
        println("")
    }
}

//Programa Principal
fun main(args: Array<String>) {
    val cancion = arrayOf(Nota.DO, Nota.SI, Nota.SOL, Nota.RE, Nota.FA) //notas
    val p = Piano()
    for (nota in cancion) { //añadimos las notas al piano
        p.add(nota)
    }
    p.interpretar()
}