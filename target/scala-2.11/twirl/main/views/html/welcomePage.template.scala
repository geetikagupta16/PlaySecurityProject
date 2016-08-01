
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object welcomePage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class welcomePage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Welcome")/*1.17*/{_display_(Seq[Any](format.raw/*1.18*/("""

    """),format.raw/*3.5*/("""<h1>Hello User !!</h1>
    <img src="http://www.gettyimages.ca/gi-resources/images/Homepage/Hero/UK/CMS_Creative_164657191_Kingfisher.jpg" alt="Cannot load image !!">

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object welcomePage extends welcomePage_Scope0.welcomePage
              /*
                  -- GENERATED --
                  DATE: Mon Aug 01 16:09:55 IST 2016
                  SOURCE: /home/knoldus/SecurityProject/PlaySecurityProject/app/views/welcomePage.scala.html
                  HASH: 55435f97343aa74861a2f392a00d4eec796c2e46
                  MATRIX: 621->1|644->16|682->17|714->23
                  LINES: 25->1|25->1|25->1|27->3
                  -- GENERATED --
              */
          