class Pianista(unInstrumento:Instrumento, unaCancion: Array<Nota?>) : Musico(unInstrumento, unaCancion) {

    override fun interpretar() {
        println("SOY PIANISTA")
        return super.interpretar()
    }
}
