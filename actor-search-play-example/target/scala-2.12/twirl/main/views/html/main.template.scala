
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, header: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="ja">
<head>
	<title>"""),_display_(/*6.10*/title),format.raw/*6.15*/("""</title>
	<meta charset="UTF-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<link rel="stylesheet" media="screen" href=""""),_display_(/*10.47*/routes/*10.53*/.Assets.versioned("vendor/bootstrap-3.3.5/css/bootstrap.min.css")),format.raw/*10.118*/("""" />
	<link rel="stylesheet" media="screen" href=""""),_display_(/*11.47*/routes/*11.53*/.Assets.versioned("stylesheets/main.css")),format.raw/*11.94*/("""">
	<link rel="shortcut icon" type="image/png" href=""""),_display_(/*12.52*/routes/*12.58*/.Assets.versioned("images/favicon.png")),format.raw/*12.97*/("""">
	<script src=""""),_display_(/*13.16*/routes/*13.22*/.Assets.versioned("javascripts/hello.js")),format.raw/*13.63*/("""" type="text/javascript"></script>
</head>
<body>
	<div class="container">
		<div class="page-header">
			<h1>"""),_display_(/*18.9*/header),format.raw/*18.15*/("""</h1>
		</div>

		<div class="row">
			<div class="col-md-12">
				<ul class="nav nav-pills">
					<li role="presentation"><a href="/actor">index</a></li>
					<li role="presentation"><a href="/actor/create">create</a></li>
					<li role="presentation"><a href="/init">init</a></li>
				</ul>
			</div>
		</div>

		"""),_display_(/*31.4*/content),format.raw/*31.11*/("""

		"""),format.raw/*33.3*/("""<div class="page-footer">
			<div>footer</div>
		</div>
	</div>
	<script src=""""),_display_(/*37.16*/routes/*37.22*/.Assets.versioned("vendor/jquery/jquery-1.11.3.js")),format.raw/*37.73*/("""" ></script>
	<script src=""""),_display_(/*38.16*/routes/*38.22*/.Assets.versioned("vendor/bootstrap-3.3.5/js/bootstrap.js")),format.raw/*38.81*/("""" ></script>
</body>
</html>"""))
      }
    }
  }

  def render(title:String,header:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,header)(content)

  def f:((String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,header) => (content) => apply(title,header)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 20 22:57:15 JST 2019
                  SOURCE: D:/Apl/searchapp/actor-search-play-example/app/views/main.scala.html
                  HASH: c11b142d12d21b7b01d11a0f18fbd8af2d73825b
                  MATRIX: 959->1|1100->47|1130->51|1208->103|1233->108|1474->322|1489->328|1576->393|1655->445|1670->451|1732->492|1814->547|1829->553|1889->592|1935->611|1950->617|2012->658|2154->774|2181->780|2536->1109|2564->1116|2597->1122|2707->1205|2722->1211|2794->1262|2850->1291|2865->1297|2945->1356
                  LINES: 28->1|33->1|35->3|38->6|38->6|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|50->18|50->18|63->31|63->31|65->33|69->37|69->37|69->37|70->38|70->38|70->38
                  -- GENERATED --
              */
          