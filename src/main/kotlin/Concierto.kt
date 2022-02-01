
//Programa Principal
fun main(args: Array<String>) {
    val cancion = arrayOf(Nota.DO, Nota.SI, Nota.SOL, Nota.RE, Nota.FA) //notas
    val p = Piano()
    for (nota in cancion) { //añadimos las notas al piano
        p.add(nota)
    }
    p.interpretar()
}
