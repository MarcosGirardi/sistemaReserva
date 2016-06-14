package sistemareserva

class Usuario {
  Integer dni
  String  nombre
  String  apellido
  String  password
  Boolean habilitado
  Date    fechaCreacion
  Date    fechaUltMod

  static  belongsTo = [tipoUsuario: TipoUsuario, idUserCreador: Usuario]
  static  hasMany = [usuarios: Usuario, tipos: TipoUsuario, resrvas: Reserva]

    static constraints = {
      dni           (nullable:true, unique:true)
      nombre        (nullable:true)
      apellido      (nullable:true)
      password      (nullable:true)
      habilitado    (nullable:true)
      fechaCreacion (nullable:true)
      fechaUltMod   (nullable:true)
      tipoUsuario   (nullable:true)
      idUserCreador (nullable:true)
    }
}
