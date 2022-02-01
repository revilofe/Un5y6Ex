interface Interprete {
    val instrumento: Instrumento
    var cancion: Array<Nota?>

    fun interpretar()
}

open class Musico (unInstrumento:Instrumento, unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)) : Interprete {
    override val instrumento = unInstrumento
    final override var cancion: Array<Nota?> = unaCancion
        set(value) {
            field = value
            value.forEach { nota ->
                i("Pianista.setCancion","incorpora nota $nota de canción")
                nota?.let { instrumento.incorporaNota(nota) }
            }
        }
    init {
        cancion = unaCancion
    }
    override fun interpretar() = instrumento.play()
}