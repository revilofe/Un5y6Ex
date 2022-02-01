class Violinista(unInstrumento:Instrumento, unaCancion: Array<Nota?>) : Musico(unInstrumento, unaCancion) {

    override fun interpretar() {
        println("SOY VIOLINISTA")
        return super.interpretar()
    }
}