package sistemareserva

class TipoUsuario {
  String  tipo
  Date    fechaCreacion
  Date    fechaUltMod

  static  belongsTo = [creador: Usuario]
  static  hasMany = [usuarios: Usuario]

    static constraints = {
      tipo          (nullable:true, unique:true)
      fechaCreacion (nullable:true)
      fechaUltMod   (nullable:true)
      creador (nullable:true)
    }
}
