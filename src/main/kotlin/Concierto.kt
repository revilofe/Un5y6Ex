

fun main() {
    val obra = arrayOf<Nota?>(Nota.MI, Nota.MI, Nota.DO, Nota.FA)
    val interpretes = mutableMapOf<String, Interprete>(
        "Pinista" to Pianista( Piano(), obra),
        "Violinista" to Violinista( Violin(), obra)
    )

    repeat(2)
    {
        interpretes.keys.random().run {
            interpretes[this]?.interpretar()
            interpretes.remove(this)
        }
    }
}
