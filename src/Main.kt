//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val persona1 = Persona("Pepe", 30)
    persona1.actividad()


    val estudiante1 = Estudiante("Inma", 26, "Psicología")
    estudiante1.actividad()

    val persona2 = Persona("", 26)
    println(persona2)

    val estudiante2 = Persona("Paco", -2)
    println(estudiante2)
}