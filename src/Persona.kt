open class Persona(var nombre: String = "Lucía", var edad: Int = 15) {

    init{
        require(nombre.isNotEmpty()){"El nombre no puede estar vacío"}
        require(edad >= 0){"La edad debe ser un número positivo"}
    }
    open fun cumple(){
        edad += 1
    }

    open fun mostrarEdad(){
        println(edad)
    }

    open fun actividad(){
        println("$nombre está realizando una actividad")
    }
    override fun toString(): String {
        return "(nombre = $nombre, edad = $edad)"
    }
}

