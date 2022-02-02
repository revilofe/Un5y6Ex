

//Un piano es un instrumento que interpreta las notas con un timbre muy característico
class Violin : Instrumento() {

    //Recorreremos las notas y las interpretaremos de la forma específica del piano.
    override fun play() {
        println("===> Tocando violin")
        melodia.forEach { nota ->
            when (nota) {
                Nota.DO -> print("doggg ")
                Nota.RE -> print("reggg ")
                Nota.MI -> print("miggg ")
                Nota.FA -> print("faggg ")
                Nota.SOL -> print("soggl ")
                Nota.LA -> print("laggg ")
                Nota.SI -> print("siggg ")
            }
        }
        println("")
    }
}
