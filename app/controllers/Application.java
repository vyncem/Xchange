package controllers;

import java.util.List;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.*;
import models.Rate;

import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render("Xchange"));
    }
    
    public static Result addRate() {
    	Rate rate = Form.form(Rate.class).bindFromRequest().get();
    	rate.save();
    			
        return redirect(routes.Application.index());
    }
  
    public static Result getRate() {
    	List<Rate> rates = new Model.Finder<String, Rate>(String.class, Rate.class).all();
    	return ok(play.libs.Json.toJson(rates));
    }
}
