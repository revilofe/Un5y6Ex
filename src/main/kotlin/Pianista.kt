
class Pianista(unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)) {

    private val piano = Piano()
    var cancion: Array<Nota?> = unaCancion
        set(value) {
            field = value
            value.forEach { nota ->
                i("Pianista.setCancion","incorpora nota $nota de canción")
                nota?.let { piano.incorporaNota(nota) }
            }
        }

    init {
        cancion = unaCancion
    }

    fun interpretar() = piano.play()
}