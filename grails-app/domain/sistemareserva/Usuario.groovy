package sistemareserva

class Usuario {
  Integer dni
  String  nombre
  String  apellido
  String  mail
  String  password
  Boolean habilitado
  Date    fechaCreacion
  Date    fechaUltMod

  static  belongsTo = [tipoUsuario: TipoUsuario, creador: SUser]
  static  hasMany = [docentes: Reserva, adminCreadores: Reserva]
  static  mappedBy = [docentes: "docente", adminCreadores: "adminCreador"]

    static constraints = {
      dni           (nullable:true, unique:true)
      nombre        (nullable:true)
      apellido      (nullable:true)
      mail          (nullable:true, email:true)
      password      (nullable:true)
      habilitado    (nullable:true)
      fechaCreacion (nullable:true)
      fechaUltMod   (nullable:true)
      tipoUsuario   (nullable:true)
      creador       (nullable:true)
    }
}
