package sistemareserva

class Materia {
  String  nombre

  static  belongsTo = [carrera: Carrera]
  static  hasMany = [reservas: Reserva]

    static constraints = {
      nombre  (nullable:true)
      carrera (nullable:true)
    }
}
