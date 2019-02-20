
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,List[models.Actor],play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, result: List[models.Actor], messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import java.util.Date
/*4.2*/import play.i18n._
/*5.2*/import utils.DateParser

def /*10.2*/d/*10.3*/(date: Date):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.19*/("""
  """),_display_(/*11.4*/if(date != null)/*11.20*/ {_display_(Seq[Any](format.raw/*11.22*/("""
    """),_display_(/*12.6*/date/*12.10*/.format("yyyy-MM-dd")),format.raw/*12.31*/("""
  """)))}/*13.5*/else/*13.10*/{_display_(Seq[Any](format.raw/*13.11*/("""
    """),format.raw/*14.5*/("""---
  """)))}),format.raw/*15.4*/("""
""")))};
Seq[Any](format.raw/*1.77*/("""

"""),format.raw/*6.1*/("""
"""),format.raw/*9.31*/("""
"""),format.raw/*16.2*/("""

"""),_display_(/*18.2*/main("Actor Index", "俳優一覧")/*18.29*/ {_display_(Seq[Any](format.raw/*18.31*/("""
	"""),_display_(/*19.3*/if(flash.containsKey("success") || flash.containsKey("error"))/*19.65*/ {_display_(Seq[Any](format.raw/*19.67*/("""
	"""),format.raw/*20.2*/("""<div class="row">
      <div class="col-md-12 well">
        """),_display_(/*22.10*/if(flash.containsKey("success"))/*22.42*/ {_display_(Seq[Any](format.raw/*22.44*/("""
        """),format.raw/*23.9*/("""<div id="success-message" class="text-success">
          """),_display_(/*24.12*/flash/*24.17*/.get("success")),format.raw/*24.32*/("""
        """),format.raw/*25.9*/("""</div>
        """)))}),format.raw/*26.10*/("""
        """),_display_(/*27.10*/if(flash.containsKey("error"))/*27.40*/ {_display_(Seq[Any](format.raw/*27.42*/("""
        """),format.raw/*28.9*/("""<div id="error-message" class="text-danger">
          """),_display_(/*29.12*/flash/*29.17*/.get("error")),format.raw/*29.30*/("""
        """),format.raw/*30.9*/("""</div>
        """)))}),format.raw/*31.10*/("""
      """),format.raw/*32.7*/("""</div>
    </div>
    """)))}),format.raw/*34.6*/("""
    """),format.raw/*35.5*/("""<div class="row">
      <div class="col-md-12">
        <table class="table table-striped">
          <thead>
            <tr>
              <th>"""),_display_(/*40.20*/messages("actor.id")),format.raw/*40.40*/("""</th>
              <th>"""),_display_(/*41.20*/messages("actor.name")),format.raw/*41.42*/("""</th>
              <th>"""),_display_(/*42.20*/messages("actor.height")),format.raw/*42.44*/("""</th>
              <th>"""),_display_(/*43.20*/messages("actor.blood")),format.raw/*43.43*/("""</th>
              <th>"""),_display_(/*44.20*/messages("actor.birthday")),format.raw/*44.46*/("""</th>
              <th>"""),_display_(/*45.20*/messages("actor.birthplace")),format.raw/*45.48*/("""</th>
              <th>"""),_display_(/*46.20*/messages("actor.update_at")),format.raw/*46.47*/("""</th>
              <th>&nbsp;</th>
            </tr>
          </thead>
          <tbody>
            """),_display_(/*51.14*/for(actor <- result) yield /*51.34*/ {_display_(Seq[Any](format.raw/*51.36*/("""
            """),format.raw/*52.13*/("""<tr>
              <td>
                <a class="btn btn-default" href="/actor/detail/"""),_display_(/*54.65*/actor/*54.70*/.id),format.raw/*54.73*/("""">"""),_display_(/*54.76*/actor/*54.81*/.id),format.raw/*54.84*/("""</a>
              </td>
              <td>"""),_display_(/*56.20*/actor/*56.25*/.name),format.raw/*56.30*/("""</td>
              <td>"""),_display_(/*57.20*/if(actor.height != null)/*57.44*/ {_display_(_display_(/*57.47*/actor/*57.52*/.height))}/*57.61*/else/*57.66*/{_display_(Seq[Any](format.raw/*57.67*/("""---""")))}),format.raw/*57.71*/("""</td>
              <td>"""),_display_(/*58.20*/if(actor.blood)/*58.35*/ {_display_(_display_(/*58.38*/actor/*58.43*/.blood))}/*58.51*/else/*58.56*/{_display_(Seq[Any](format.raw/*58.57*/("""---""")))}),format.raw/*58.61*/("""</td>
              <td>"""),_display_(/*59.20*/DateParser/*59.30*/.format(actor.birthday)),format.raw/*59.53*/("""</td>
              <td>"""),_display_(/*60.20*/actor/*60.25*/.birthplaceId),format.raw/*60.38*/("""</td>
              <td>"""),_display_(/*61.20*/actor/*61.25*/.updateAt.format("yyyy-MM-dd HH:mm:ss")),format.raw/*61.64*/("""</td>
              <td>
                <form action="/actor/delete/"""),_display_(/*63.46*/actor/*63.51*/.id),format.raw/*63.54*/("""" method="post">
                  <input class="btn btn-warning" type="submit" value="delete">
                </form>
              </td>
            </tr>
            """)))}),format.raw/*68.14*/("""
          """),format.raw/*69.11*/("""</tbody>
        </table>
      </div>
    </div>
""")))}))
      }
    }
  }

  def render(message:String,result:List[models.Actor],messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(message,result,messages)

  def f:((String,List[models.Actor],play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (message,result,messages) => apply(message,result,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 20 22:57:15 JST 2019
                  SOURCE: D:/Apl/searchapp/actor-search-play-example/app/views/index.scala.html
                  HASH: 6693819430fd4da97bac08807e553114dd2926d2
                  MATRIX: 986->1|1134->81|1163->105|1189->126|1226->250|1235->251|1328->267|1359->272|1384->288|1424->290|1457->297|1470->301|1512->322|1535->328|1548->333|1587->334|1620->340|1658->348|1700->76|1730->151|1759->247|1788->351|1819->356|1855->383|1895->385|1925->389|1996->451|2036->453|2066->456|2157->520|2198->552|2238->554|2275->564|2362->624|2376->629|2412->644|2449->654|2497->671|2535->682|2574->712|2614->714|2651->724|2735->781|2749->786|2783->799|2820->809|2868->826|2903->834|2958->859|2991->865|3169->1016|3210->1036|3263->1062|3306->1084|3359->1110|3404->1134|3457->1160|3501->1183|3554->1209|3601->1235|3654->1261|3703->1289|3756->1315|3804->1342|3940->1451|3976->1471|4016->1473|4058->1487|4175->1577|4189->1582|4213->1585|4243->1588|4257->1593|4281->1596|4354->1642|4368->1647|4394->1652|4447->1678|4480->1702|4511->1705|4525->1710|4544->1719|4557->1724|4596->1725|4631->1729|4684->1755|4708->1770|4739->1773|4753->1778|4771->1786|4784->1791|4823->1792|4858->1796|4911->1822|4930->1832|4974->1855|5027->1881|5041->1886|5075->1899|5128->1925|5142->1930|5202->1969|5301->2041|5315->2046|5339->2049|5546->2225|5586->2237
                  LINES: 28->1|31->3|32->4|33->5|35->10|35->10|37->10|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|41->14|42->15|44->1|46->6|47->9|48->16|50->18|50->18|50->18|51->19|51->19|51->19|52->20|54->22|54->22|54->22|55->23|56->24|56->24|56->24|57->25|58->26|59->27|59->27|59->27|60->28|61->29|61->29|61->29|62->30|63->31|64->32|66->34|67->35|72->40|72->40|73->41|73->41|74->42|74->42|75->43|75->43|76->44|76->44|77->45|77->45|78->46|78->46|83->51|83->51|83->51|84->52|86->54|86->54|86->54|86->54|86->54|86->54|88->56|88->56|88->56|89->57|89->57|89->57|89->57|89->57|89->57|89->57|89->57|90->58|90->58|90->58|90->58|90->58|90->58|90->58|90->58|91->59|91->59|91->59|92->60|92->60|92->60|93->61|93->61|93->61|95->63|95->63|95->63|100->68|101->69
                  -- GENERATED --
              */
          