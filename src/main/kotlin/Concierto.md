# Prueba especifica unidad 5 y 6

> Se evaluará el RA4 y RA7

## 1. Descripción de la prueba

Tenemos un conjunto de clases que nos permiten simular la realización de un concierto.
- `Log` contiene lo necesario para enviar mensajes de log. No cambiará.
- `Nota` es una clase enumerada para trabajar con las notas musicales. No cambiará.
- `Concierto` tiene el método `main` que ejecuta una prueba de nuestro programa concierto.
- `Piano` representa un instrumento, `melodía` es una lista de notas y el método `play` "las reproduce según el instrumento"
- `Pianista` representa un intérprete, `canción` es una lista de notas y el método `interpretar` toca el instrumento para reproducir las notas.

Actualmente solo se puede dar un concierto del pianista, tocando el piano. Se puede ver en el archivo `Concierto.kt`


Crear la clase abstracta Instrumento, que almacena en una tabla las notas musicales de
una melodía (dentro de una misma octava). El método ada () añade nuevas notas musi-
cales. La clase también dispone del método abstracto interpretar () que, en cada sub-
clase que herede de Instrumento, mostrará por consola las notas musicales según las
interprete. Utilizar enumerados para definir las notas musicales.

## 2. ¿Qué se pide?

1. Un `Pianista`, podrá tocar (método `play`) cualquier instrumento (`Instrumento`)
2. Añadir método `reset` al `Instrumento` para poder limpiar la melodía asociada.
3. Añadir método `incorporaCancion(Array<Nota?>)` para añadir una canción nueva directamente.
4. El método `play` es **específico** de cada instrumento en particular.
5. Por lo pronto, tendremos 2 instrumentos: `Piano`y `Violin`, cada uno con un `play` especializado.
6. Hay que evitar la dependencia que existe entre `Pianista` y `Piano`
7. Hay que documentar la clase `Instrumento`, según las indicaciones de KDoc.
8. Generar la documentación haciendo uso de Dokka.
9. Has ahora se daban concierto monoespecialista, ahora se quiere poder dar conciertos por cualquieer persona que sepa interpretar una obra. `Interprete`.
10. Hay que tener en cuenta que todos los músicos, tendrán un comportamiento común, aunque cada músico sobreescribirá su método `interpretar` (`Musico`)
11. Se quiere poder realizar conciertos por cualquier persona que sepa interpretar una obra. `Interprete`
12. Por lo pronto, tendremos 2 músicos: `Pianista`y `Violinista`, cada uno con un `Interpretar` especializado.

### Ejecución
La práctica se ejecutará con este código:
```kotlin
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
```


## 2. Evaluación

Se tendrá en cuenta el uso de superclases, interfaces, clases abstractas, el uso de jerarquía de clases ya conocidas y que nos las proporcionan kotlin, como por ejemplo List, Map, Set. etc.

###### d) Se han creado clases heredadas que sobrescriban la implementación de métodos de la superclase.
0. No lo hace; 5. Crea clases heredadas que sobreescriben pero no adecuadamente o no completo; 10. Correcto.
###### e) Se han diseñado y aplicado jerarquías de clases.
0. No lo hace; 5. Se diseña y aplica jerarquía pero no adecuadamente o no completa; 10. Correcto.
###### f) Se han probado y depurado las jerarquías de clases.
0. No lo hace; 5. No funciona adecuadamente; 10. Correcto.
###### g) Se han realizado programas que implementen y utilicen jerarquías de clases.
0. No lo hace; 5. Implementa y utiliza jerarquías de clases vistas pero no correctamente; 10. Correcto.


Adicionalmente se tendrá en cuenta:
- El código realizado es óptimo.
- El código realizado es limpio y está comentado.
- Se cumple requisitos de entrega.

## 3. Condiciones de entrega

Se entrega la URL al repositorio, el repositorio será:

- **privado**
- Compartido conmigo.
- El nombre del repositorio será `DAM1_id_iniciales` donde:
    - `id`: es el ide de la actividad, por ejemplo 6_5
    - `iniciales': son tus iniciales por ejemplo EFO las mías.

## 4. Bibliografía

- [Principio de inversión de dependencias](https://github.com/revilofe/IESRA-DAM-Prog/blob/master/ejercicios/src/main/kotlin/un6/dip/dip.md)