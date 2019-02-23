// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Apl/searchapp/actor-search-play-example/conf/routes
// @DATE:Sat Feb 23 08:47:12 JST 2019


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
