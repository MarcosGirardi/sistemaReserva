package sistemareserva

class Reserva {
  Date    fecha

  Recurso proyector
  Recurso retro
  Recurso pc
  Recurso sonido
  Recurso puntero
  Recurso adaptador

  Boolean semestral
  String  horaEntregado
  String  horaRetirado
  String  observaciones
  Boolean activa
  Date    fechaCreacion
  Date    fechaUltMod

  static  belongsTo = [horaEntrega: Horario, horaRetiro: Horario, lugar: Lugar, carrera: Carrera, materia: Materia, docente: Usuario,
                      adminCreador: Usuario]

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
