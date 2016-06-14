package sistemareserva

class Recurso {
  String  nombre
  Boolean enServicio

  static  belongsTo = [tipoRecurso: TipoRecurso]
  static  hasMany = [reservas: Reserva]

    static constraints = {
      nombre      (nullable:true, unique:true)
      tipoRecurso (nullable:true)
      enServicio  (nullable:true)
    }
}
