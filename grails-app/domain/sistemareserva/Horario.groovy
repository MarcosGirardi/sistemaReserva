package sistemareserva

class Horario {
  String  hora

  static  hasMany = [reservas: Reserva]

    static constraints = {
      hora  (nullable:true, unique:true)
    }
}
