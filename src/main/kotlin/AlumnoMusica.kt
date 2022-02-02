class AlumnoMusica(unInstrumento:Instrumento, unaCancion: Array<Nota?>) : Interprete {
    override val instrumento: Instrumento = unInstrumento
    override var partitura: Array<Nota?> = unaCancion
        set(value) {
            field = value
            instrumento.reset()
            instrumento.incorporaMelodia(value)
        }
    init {
        partitura = unaCancion
    }
    override fun interpretar() {
        println("")
        println("####### - SOY AlUMNO DE MUSICA")
        instrumento.play()
    }
}