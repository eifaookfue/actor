
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

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Form[views.form.ActorForm],play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, actorForm: Form[views.form.ActorForm], messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import play.i18n._
/*4.2*/import models.Prefecture


Seq[Any](format.raw/*1.88*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Actor Create", "俳優登録")/*6.30*/ {_display_(Seq[Any](format.raw/*6.32*/("""
    """),_display_(/*7.6*/if(flash.containsKey("error"))/*7.36*/ {_display_(Seq[Any](format.raw/*7.38*/("""
    """),format.raw/*8.5*/("""<div class="row">
      <div class="col-md-12 well">
        <div id="error-message" class="text-danger">
          """),_display_(/*11.12*/flash/*11.17*/.get("error")),format.raw/*11.30*/("""
        """),format.raw/*12.9*/("""</div>
      </div>
    </div>
    """)))}),format.raw/*15.6*/("""
    """),format.raw/*16.5*/("""<div class="row">
      <div class="col-md-12">
        <form class="form-horizontal" role="form" action="/actor/save" method="post">
          """),_display_(/*19.12*/defining(actorForm("id"))/*19.37*/ { idField =>_display_(Seq[Any](format.raw/*19.50*/("""
            """),format.raw/*20.13*/("""<input type="hidden" id=""""),_display_(/*20.39*/idField/*20.46*/.id),format.raw/*20.49*/("""" name=""""),_display_(/*20.58*/idField/*20.65*/.name),format.raw/*20.70*/("""" value=""""),_display_(/*20.80*/idField/*20.87*/.value),format.raw/*20.93*/("""">
          """)))}),format.raw/*21.12*/("""
          """),format.raw/*22.11*/("""<!-- name -->
          <div class="form-group">
            """),_display_(/*24.14*/defining(actorForm("name"))/*24.41*/ { nameField =>_display_(Seq[Any](format.raw/*24.56*/("""
            """),format.raw/*25.13*/("""<label for="nameField.id" class="col-sm-2 control-label">"""),_display_(/*25.71*/messages("actor.name")),format.raw/*25.93*/("""</label>
            <div class="col-sm-10">
              <input type="text" id=""""),_display_(/*27.39*/nameField/*27.48*/.id),format.raw/*27.51*/("""" class="form-control" name=""""),_display_(/*27.81*/nameField/*27.90*/.name),format.raw/*27.95*/("""" value=""""),_display_(/*27.105*/nameField/*27.114*/.value),format.raw/*27.120*/("""">
              """),_display_(/*28.16*/if(nameField.hasErrors)/*28.39*/ {_display_(Seq[Any](format.raw/*28.41*/("""
              """),format.raw/*29.15*/("""<span class="help-block">"""),_display_(/*29.41*/nameField/*29.50*/.errors.mkString(", ")),format.raw/*29.72*/("""</span>
              """)))}),format.raw/*30.16*/("""
            """),format.raw/*31.13*/("""</div>
            """)))}),format.raw/*32.14*/("""
          """),format.raw/*33.11*/("""</div>
          <!-- height -->
          <div class="form-group">
            """),_display_(/*36.14*/defining(actorForm("height"))/*36.43*/ { heightField =>_display_(Seq[Any](format.raw/*36.60*/("""
            """),format.raw/*37.13*/("""<label for="heightField.id" class="col-sm-2 control-label">"""),_display_(/*37.73*/messages("actor.height")),format.raw/*37.97*/("""</label>
            <div class="col-sm-10">
              <input type="text" id=""""),_display_(/*39.39*/heightField/*39.50*/.id),format.raw/*39.53*/("""" class="form-control" name=""""),_display_(/*39.83*/heightField/*39.94*/.name),format.raw/*39.99*/("""" value=""""),_display_(/*39.109*/heightField/*39.120*/.value),format.raw/*39.126*/("""">
              """),_display_(/*40.16*/if(heightField.hasErrors)/*40.41*/ {_display_(Seq[Any](format.raw/*40.43*/("""
              """),format.raw/*41.15*/("""<span class="help-block">"""),_display_(/*41.41*/heightField/*41.52*/.errors.mkString(", ")),format.raw/*41.74*/("""</span>
              """)))}),format.raw/*42.16*/("""
            """),format.raw/*43.13*/("""</div>
            """)))}),format.raw/*44.14*/("""
          """),format.raw/*45.11*/("""</div>
          <!-- blood -->
          <div class="form-group">
            """),_display_(/*48.14*/defining(actorForm("blood"))/*48.42*/ { bloodField =>_display_(Seq[Any](format.raw/*48.58*/("""
            """),format.raw/*49.13*/("""<label for="bloodField.id" class="col-sm-2 control-label">"""),_display_(/*49.72*/messages("actor.blood")),format.raw/*49.95*/("""</label>
            <div class="col-sm-10">
              <input type="text" id=""""),_display_(/*51.39*/bloodField/*51.49*/.id),format.raw/*51.52*/("""" class="form-control" name=""""),_display_(/*51.82*/bloodField/*51.92*/.name),format.raw/*51.97*/("""" value=""""),_display_(/*51.107*/bloodField/*51.117*/.value),format.raw/*51.123*/("""">
              """),_display_(/*52.16*/if(bloodField.hasErrors)/*52.40*/ {_display_(Seq[Any](format.raw/*52.42*/("""
              """),format.raw/*53.15*/("""<span class="help-block">"""),_display_(/*53.41*/bloodField/*53.51*/.errors.mkString(", ")),format.raw/*53.73*/("""</span>
              """)))}),format.raw/*54.16*/("""
            """),format.raw/*55.13*/("""</div>
            """)))}),format.raw/*56.14*/("""
          """),format.raw/*57.11*/("""</div>
          <!-- birthday -->
          <div class="form-group">
            """),_display_(/*60.14*/defining(actorForm("birthday"))/*60.45*/ { birthdayField =>_display_(Seq[Any](format.raw/*60.64*/("""
            """),format.raw/*61.13*/("""<label for="birthdayField.id" class="col-sm-2 control-label">"""),_display_(/*61.75*/messages("actor.birthday")),format.raw/*61.101*/("""</label>
            <div class="col-sm-10">
              <input type="text" id=""""),_display_(/*63.39*/birthdayField/*63.52*/.id),format.raw/*63.55*/("""" class="form-control" name=""""),_display_(/*63.85*/birthdayField/*63.98*/.name),format.raw/*63.103*/("""" value=""""),_display_(/*63.113*/birthdayField/*63.126*/.value),format.raw/*63.132*/("""">
              """),_display_(/*64.16*/if(birthdayField.hasErrors)/*64.43*/ {_display_(Seq[Any](format.raw/*64.45*/("""
              """),format.raw/*65.15*/("""<span class="help-block">"""),_display_(/*65.41*/birthdayField/*65.54*/.errors.mkString(", ")),format.raw/*65.76*/("""</span>
              """)))}),format.raw/*66.16*/("""
            """),format.raw/*67.13*/("""</div>
            """)))}),format.raw/*68.14*/("""
          """),format.raw/*69.11*/("""</div>
          <!-- birthplaceId -->
          <div class="form-group">
            """),_display_(/*72.14*/defining(actorForm("birthplaceId"))/*72.49*/ { birthplaceIdField =>_display_(Seq[Any](format.raw/*72.72*/("""
            """),format.raw/*73.13*/("""<label for="birthplaceIdField.id" class="col-sm-2 control-label">"""),_display_(/*73.79*/messages("actor.birthplace")),format.raw/*73.107*/("""</label>
            <div class="col-sm-10">
              <select id=""""),_display_(/*75.28*/birthplaceIdField/*75.45*/.id),format.raw/*75.48*/("""" class="form-control" name=""""),_display_(/*75.78*/birthplaceIdField/*75.95*/.name),format.raw/*75.100*/("""">
                <option value="">---</option>
                """),_display_(/*77.18*/for(pref <- Prefecture.list()) yield /*77.48*/ {_display_(Seq[Any](format.raw/*77.50*/("""
                """),format.raw/*78.17*/("""<option value=""""),_display_(/*78.33*/pref/*78.37*/.id),format.raw/*78.40*/("""">"""),_display_(/*78.43*/pref/*78.47*/.name),format.raw/*78.52*/("""</option>
                """)))}),format.raw/*79.18*/("""
              """),format.raw/*80.15*/("""</select>
              """),_display_(/*81.16*/if(birthplaceIdField.hasErrors)/*81.47*/ {_display_(Seq[Any](format.raw/*81.49*/("""
              """),format.raw/*82.15*/("""<span class="help-block">"""),_display_(/*82.41*/birthplaceIdField/*82.58*/.errors.mkString(", ")),format.raw/*82.80*/("""</span>
              """)))}),format.raw/*83.16*/("""
            """),format.raw/*84.13*/("""</div>
            """)))}),format.raw/*85.14*/("""
          """),format.raw/*86.11*/("""</div>
          <div class="form-group">
            <input class="btn btn-default" type="submit" value="save" />
          </div>
        </form>
      </div>
    </div>
""")))}))
      }
    }
  }

  def render(message:String,actorForm:Form[views.form.ActorForm],messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(message,actorForm,messages)

  def f:((String,Form[views.form.ActorForm],play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (message,actorForm,messages) => apply(message,actorForm,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 20 22:57:14 JST 2019
                  SOURCE: D:/Apl/searchapp/actor-search-play-example/app/views/create.scala.html
                  HASH: 2857e7371088bbc9626c2ff1d852f7d298159f1c
                  MATRIX: 995->1|1154->92|1180->113|1234->87|1264->139|1292->142|1328->170|1367->172|1399->179|1437->209|1476->211|1508->217|1655->337|1669->342|1703->355|1740->365|1809->404|1842->410|2017->558|2051->583|2102->596|2144->610|2197->636|2213->643|2237->646|2273->655|2289->662|2315->667|2352->677|2368->684|2395->690|2441->705|2481->717|2572->781|2608->808|2661->823|2703->837|2788->895|2831->917|2943->1002|2961->1011|2985->1014|3042->1044|3060->1053|3086->1058|3124->1068|3143->1077|3171->1083|3217->1102|3249->1125|3289->1127|3333->1143|3386->1169|3404->1178|3447->1200|3502->1224|3544->1238|3596->1259|3636->1271|3747->1355|3785->1384|3840->1401|3882->1415|3969->1475|4014->1499|4126->1584|4146->1595|4170->1598|4227->1628|4247->1639|4273->1644|4311->1654|4332->1665|4360->1671|4406->1690|4440->1715|4480->1717|4524->1733|4577->1759|4597->1770|4640->1792|4695->1816|4737->1830|4789->1851|4829->1863|4939->1946|4976->1974|5030->1990|5072->2004|5158->2063|5202->2086|5314->2171|5333->2181|5357->2184|5414->2214|5433->2224|5459->2229|5497->2239|5517->2249|5545->2255|5591->2274|5624->2298|5664->2300|5708->2316|5761->2342|5780->2352|5823->2374|5878->2398|5920->2412|5972->2433|6012->2445|6125->2531|6165->2562|6222->2581|6264->2595|6353->2657|6401->2683|6513->2768|6535->2781|6559->2784|6616->2814|6638->2827|6665->2832|6703->2842|6726->2855|6754->2861|6800->2880|6836->2907|6876->2909|6920->2925|6973->2951|6995->2964|7038->2986|7093->3010|7135->3024|7187->3045|7227->3057|7344->3147|7388->3182|7449->3205|7491->3219|7584->3285|7634->3313|7735->3387|7761->3404|7785->3407|7842->3437|7868->3454|7895->3459|7990->3527|8036->3557|8076->3559|8122->3577|8165->3593|8178->3597|8202->3600|8232->3603|8245->3607|8271->3612|8330->3640|8374->3656|8427->3682|8467->3713|8507->3715|8551->3731|8604->3757|8630->3774|8673->3796|8728->3820|8770->3834|8822->3855|8862->3867
                  LINES: 28->1|31->3|32->4|35->1|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|43->11|43->11|43->11|44->12|47->15|48->16|51->19|51->19|51->19|52->20|52->20|52->20|52->20|52->20|52->20|52->20|52->20|52->20|52->20|53->21|54->22|56->24|56->24|56->24|57->25|57->25|57->25|59->27|59->27|59->27|59->27|59->27|59->27|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|61->29|62->30|63->31|64->32|65->33|68->36|68->36|68->36|69->37|69->37|69->37|71->39|71->39|71->39|71->39|71->39|71->39|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|73->41|74->42|75->43|76->44|77->45|80->48|80->48|80->48|81->49|81->49|81->49|83->51|83->51|83->51|83->51|83->51|83->51|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|85->53|85->53|86->54|87->55|88->56|89->57|92->60|92->60|92->60|93->61|93->61|93->61|95->63|95->63|95->63|95->63|95->63|95->63|95->63|95->63|95->63|96->64|96->64|96->64|97->65|97->65|97->65|97->65|98->66|99->67|100->68|101->69|104->72|104->72|104->72|105->73|105->73|105->73|107->75|107->75|107->75|107->75|107->75|107->75|109->77|109->77|109->77|110->78|110->78|110->78|110->78|110->78|110->78|110->78|111->79|112->80|113->81|113->81|113->81|114->82|114->82|114->82|114->82|115->83|116->84|117->85|118->86
                  -- GENERATED --
              */
          