package sistemareserva

class TipoUsuario {
  String  tipo
  Date    fechaCreacion
  Date    fechaUltMod

  static  belongsTo = [idUserCreador: Usuario]
  static  hasMany = [usuarios: Usuario]

    static constraints = {
      tipo          (nullable:true, unique:true)
      fechaCreacion (nullable:true)
      fechaUltMod   (nullable:true)
      idUserCreador (nullable:true)
    }
}
