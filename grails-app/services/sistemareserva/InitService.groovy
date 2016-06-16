package sistemareserva

import grails.transaction.Transactional

@Transactional
class InitService {

    def init() {
      log.println("iniciando")

      def tipo = new TipoUsuario()
      def tC = TipoUsuario.createCriteria()
      def tU = tC {
        ilike("tipo", "su%")
      }

      if (!SUser.findAll()){
        def sudo = new SUser()
      }

    }
}
