package sistemareserva

class Reserva {
  Date    fecha

  Recurso proyector
  Recurso retro
  Recurso pc
  Recurso sonido
  Recurso puntero
  Recurso adaptador

  Horario horaEntrega
  Horario horaRetiro

  Usuario docente
  Usuario adminCreador

  Boolean semestral
  String  horaEntregado
  String  horaRetirado
  String  observaciones
  Boolean activa
  Date    fechaCreacion
  Date    fechaUltMod

  static  belongsTo = [lugar: Lugar, carrera: Carrera, materia: Materia]

    static constraints = {
      fecha         (nullable:true)
      semestral     (nullable:true)
      horaEntregado (nullable:true)
      horaRetirado  (nullable:true)
      observaciones (nullable:true)
      activa        (nullable:true)
      fechaCreacion (nullable:true)
      fechaUltMod   (nullable:true)
    }
}
