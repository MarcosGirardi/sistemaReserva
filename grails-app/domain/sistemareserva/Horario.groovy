package sistemareserva

class Horario {
  String  hora

  static  hasMany = [horaEntregas: Reserva, horaRetiros: Reserva]
  static  mappedBy = [horaEntregas: "horaEntrega", horaRetiros: "horaRetiro"]

    static constraints = {
      hora  (nullable:true, unique:true)
    }
}
