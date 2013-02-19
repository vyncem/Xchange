package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import play.db.ebean.Model;

@Entity
public class Rate extends Model{
		@Id
		public String currency;
		public float rate;
		

}
