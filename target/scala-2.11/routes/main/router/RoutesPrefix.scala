
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/SecurityProject/PlaySecurityProject/conf/routes
// @DATE:Mon Aug 01 15:41:48 IST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
