
class Pianista(unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)) {

    private val piano = Piano()
    var partitura: Array<Nota?> = unaCancion
        set(value) {
            field = value
            value.forEach { nota ->
                i("Pianista.setPartitura","incorpora nota $nota de canción")
                nota?.let { piano.incorporaNota(nota) }
            }
        }

    init {
        partitura = unaCancion
    }

    fun interpretar() = piano.play()
}