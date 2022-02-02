abstract class Instrumento {
    //tabla que almacena las notas a interpretar
    protected var melodia = mutableListOf<Nota>()
    fun incorporaNota(nota: Nota) {
        melodia.add(nota)
    }

    fun reset() = melodia.clear()

    fun incorporaMelodia(cancion:Array<Nota?>)
    {
        cancion.forEach { nota ->
            nota?.let { melodia.add(nota) }
        }
    }

    //Recorreremos las notas y las interpretaremos de la forma específica del instrumento
    //A implementar en cada subclase
    abstract fun play()
}

