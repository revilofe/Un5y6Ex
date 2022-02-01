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
