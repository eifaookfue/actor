// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Apl/searchapp/actor-search-play-example/conf/routes
// @DATE:Wed Feb 20 22:57:14 JST 2019


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
