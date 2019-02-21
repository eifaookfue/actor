
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

object detail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.Actor,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, actor: models.Actor, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import play.i18n._
/*4.2*/import utils.DateParser


Seq[Any](format.raw/*1.70*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Actor Detail", "俳優詳細")/*6.30*/ {_display_(Seq[Any](format.raw/*6.32*/("""
    """),format.raw/*7.5*/("""<div class="row">
      <div class="col-md-12">
        """),_display_(/*9.10*/if(actor != null)/*9.27*/ {_display_(Seq[Any](format.raw/*9.29*/("""
        """),format.raw/*10.9*/("""<table class="table">
          <tr>
            <th class="col-md-3 active">"""),_display_(/*12.42*/messages("actor.id")),format.raw/*12.62*/("""</th>
            <td class="col-md-9">"""),_display_(/*13.35*/actor/*13.40*/.id),format.raw/*13.43*/("""</td>
          </tr>
          <tr>
            <th class="col-md-3 active">"""),_display_(/*16.42*/messages("actor.name")),format.raw/*16.64*/("""</th>
            <td class="col-md-9">"""),_display_(/*17.35*/actor/*17.40*/.name),format.raw/*17.45*/("""</td>
          </tr>
          <tr>
            <th class="col-md-3 active">"""),_display_(/*20.42*/messages("actor.height")),format.raw/*20.66*/("""</th>
            <td class="col-md-9">"""),_display_(/*21.35*/if(actor.height != null)/*21.59*/ {_display_(_display_(/*21.62*/actor/*21.67*/.height))}/*21.76*/else/*21.81*/{_display_(Seq[Any](format.raw/*21.82*/("""---""")))}),format.raw/*21.86*/("""</td>
          </tr>
          <tr>
            <th class="col-md-3 active">"""),_display_(/*24.42*/messages("actor.blood")),format.raw/*24.65*/("""</th>
            <td class="col-md-9">"""),_display_(/*25.35*/if(actor.blood)/*25.50*/ {_display_(_display_(/*25.53*/actor/*25.58*/.blood.toLowerCase))}/*25.78*/else/*25.83*/{_display_(Seq[Any](format.raw/*25.84*/("""---""")))}),format.raw/*25.88*/("""</td>
          </tr>
          <tr>
            <th class="col-md-3 active">"""),_display_(/*28.42*/messages("actor.birthday")),format.raw/*28.68*/("""</th>
            <td class="col-md-9">"""),_display_(/*29.35*/DateParser/*29.45*/.format(actor.birthday)),format.raw/*29.68*/("""</td>
          </tr>
          <tr>
            <th class="col-md-3 active">"""),_display_(/*32.42*/messages("actor.birthplace")),format.raw/*32.70*/("""</th>
            <td class="col-md-9">"""),_display_(/*33.35*/actor/*33.40*/.birthplaceId),format.raw/*33.53*/("""</td>
          </tr>
          <tr>
            <th class="col-md-3 active">"""),_display_(/*36.42*/messages("actor.update_at")),format.raw/*36.69*/("""</th>
            <td class="col-md-9">"""),_display_(/*37.35*/actor/*37.40*/.updateAt.format("yyyy-MM-dd HH:mm:ss")),format.raw/*37.79*/("""</td>
          </tr>
        </table>
        """)))}/*40.11*/else/*40.16*/{_display_(Seq[Any](format.raw/*40.17*/("""
        """),format.raw/*41.9*/("""<div class="alert alert-warning">
          <span>データはありません。</span>
        </div>
        """)))}),format.raw/*44.10*/("""
      """),format.raw/*45.7*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(message:String,actor:models.Actor,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(message,actor,messages)

  def f:((String,models.Actor,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (message,actor,messages) => apply(message,actor,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Feb 21 22:47:08 JST 2019
                  SOURCE: D:/Apl/searchapp/actor-search-play-example/app/views/detail.scala.html
                  HASH: 43b3cd8d3b2768275f83c274e5694da7edb13e9c
                  MATRIX: 981->1|1122->74|1148->95|1201->69|1231->120|1259->123|1295->151|1334->153|1366->159|1451->218|1476->235|1515->237|1552->247|1659->327|1700->347|1768->388|1782->393|1806->396|1914->477|1957->499|2025->540|2039->545|2065->550|2173->631|2218->655|2286->696|2319->720|2350->723|2364->728|2383->737|2396->742|2435->743|2470->747|2578->828|2622->851|2690->892|2714->907|2745->910|2759->915|2789->935|2802->940|2841->941|2876->945|2984->1026|3031->1052|3099->1093|3118->1103|3162->1126|3270->1207|3319->1235|3387->1276|3401->1281|3435->1294|3543->1375|3591->1402|3659->1443|3673->1448|3733->1487|3803->1539|3816->1544|3855->1545|3892->1555|4018->1650|4053->1658
                  LINES: 28->1|31->3|32->4|35->1|37->5|38->6|38->6|38->6|39->7|41->9|41->9|41->9|42->10|44->12|44->12|45->13|45->13|45->13|48->16|48->16|49->17|49->17|49->17|52->20|52->20|53->21|53->21|53->21|53->21|53->21|53->21|53->21|53->21|56->24|56->24|57->25|57->25|57->25|57->25|57->25|57->25|57->25|57->25|60->28|60->28|61->29|61->29|61->29|64->32|64->32|65->33|65->33|65->33|68->36|68->36|69->37|69->37|69->37|72->40|72->40|72->40|73->41|76->44|77->45
                  -- GENERATED --
              */
          