// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Apl/searchapp/actor-search-play-example/conf/routes
// @DATE:Wed Feb 20 22:57:14 JST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:15
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:5
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def delete(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "actor/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:7
    def detail(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "actor/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:8
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "actor/create")
    }
  
    // @LINE:12
    def init(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "init")
    }
  
    // @LINE:9
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "actor/save")
    }
  
    // @LINE:5
    def index(): Call = {
    
      () match {
      
        // @LINE:5
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
  }


}
