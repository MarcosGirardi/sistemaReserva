package sistemareserva

import grails.transaction.Transactional

@Transactional
class InitService {
  def encodingService

    def init() {
      log.println("iniciando...")
      def sudo = new SUser()
      def tSudo = new TipoUsuario()

      if (!SUser.findAll()){
        log.println("no hay sudo")
        sudo.nombre = "sudo"
        sudo.password = encodingService.encode("admin")
        sudo.save(flush:true)
        log.println("se creo sudo")

        if(!TipoUsuario.findByTipoIlike("su%")){
          log.println("no hay tipo sudo")
          tSudo.tipo = "super usuario"
          tSudo.save(flush:true)
          log.println("se creo tipo sudo")
        }

        log.println("correcciones")
        sudo = SUser.findAll()
        tSudo = TipoUsuario.findByTipoIlike("su%")
        sudo[0].tipoUsuario = tSudo
        tSudo.creador = sudo[0]
        log.println("fin correcciones")

      }
      log.println("fin inicializacion")

    }
}
