
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Xchange")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
    
    """),_display_(Seq[Any](/*5.6*/message)),format.raw/*5.13*/("""    
    <ul id="rates" name="rates"/>
    <form action=""""),_display_(Seq[Any](/*7.20*/routes/*7.26*/.Application.addRate())),format.raw/*7.48*/("""" method="post">
    	<input name="currency"/>
    	<input name="rate"/>
    	<input type="submit"/>
    	<input type="button" onclick="loadXMLDoc()" value="load"/>
   	</form> 
   	<div id="mydiv" name="mydiv">
   	</div>
""")))})),format.raw/*15.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 19 22:54:40 GMT 2013
                    SOURCE: /home/vmuia/workspace/Xchange/app/views/index.scala.html
                    HASH: 31fcfad2b47653ca1d6083e2c58281df34a1d600
                    MATRIX: 723->1|817->18|854->21|877->36|916->38|961->49|989->56|1082->114|1096->120|1139->142|1394->366
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|35->7|35->7|35->7|43->15
                    -- GENERATED --
                */
            