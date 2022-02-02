interface Interprete {
    val instrumento: Instrumento
    var partitura: Array<Nota?>

    fun interpretar()
}

open class Musico (unInstrumento:Instrumento, unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)) : Interprete {
    final override val instrumento = unInstrumento
    final override var partitura: Array<Nota?> = unaCancion
        set(value) {
            field = value
            instrumento.reset()
            instrumento.incorporaMelodia(value)
        }
    init {
        partitura = unaCancion
    }
    override fun interpretar() = instrumento.play()
}