class BootStrap {

  def initService

    def init = { servletContext ->
      log.println("iniciando aplicacion")
      initService.init()
    }
    def destroy = {
    }
}
