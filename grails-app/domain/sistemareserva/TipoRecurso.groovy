package sistemareserva

class TipoRecurso {
  String  tipo

  static  hasMany = [recursos: Recurso]

    static constraints = {
      tipo  (nullable:true, unique:true)
    }
}
