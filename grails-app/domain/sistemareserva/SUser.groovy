package sistemareserva

class SUser {
  String  nombre
  String  password

  static  belongsTo = [tipoUsuario: TipoUsuario]
  static  hasMany = [tipos: TipoUsuario, usuarios: Usuario]

    static constraints = {
      nombre      (nullable:true, unique:true)
      password    (nullable:true)
      tipoUsuario (nullable:true)
    }
}
