import java.util.Arrays //Enumerado Nota.

abstract class Instrumento {
    //tabla que almacena las notas a interpretar
    protected var melodia : Array<Nota?>
    init {
        melodia = arrayOfNulls(0) //creamos la tabla
    }

    fun add(m: Nota?) {
        melodia = Arrays.copyOf(melodia, melodia.size + 1) //redimensionanos
        melodia[melodia.size - 1] = m //insertanos el muevo elemento al final
    }

    abstract fun interpretar() //a implenentar en cada subclase

 }