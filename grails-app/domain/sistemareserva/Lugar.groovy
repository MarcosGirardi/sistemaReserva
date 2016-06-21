package sistemareserva

class Lugar {
  String  edificio
  String  aula

  static  hasMany = [reservas: Reserva]

    static constraints = {
      edificio  (nullable:true, unique:true)
      aula      (nullable:true)
    }
}
