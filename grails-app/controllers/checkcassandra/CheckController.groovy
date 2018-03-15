package checkcassandra

class CheckController {
    def index(){
        session.checkSession = "Session OK"
        flash.checkFlash = "Flash OK"
        session.checkParams = "Params OK"
        return
    }
}
