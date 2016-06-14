package sistemareserva

class Carrera {
  String  nombre

  static  hasMany = [materias: Materia, reservas: Reserva]

    static constraints = {
      nombre  (nullable:true, unique:true)
    }
}
