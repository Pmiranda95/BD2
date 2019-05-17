package conexionbd;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;

public class Connexion {
	DB BaseDatos;
	DBCollection collection;
	BasicDBObject Document = new BasicDBObject();
	
	public Connexion() {
		try {
			Mongo mongo =  new Mongo("localhost",27017);
			BaseDatos =mongo.getDB("admin");
			collection = BaseDatos.getCollection("Cliente");
			System.out.println("conexion establecida");
		} catch (Exception e) {
			Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE,null,e);
		}
	}
	
	public boolean insert(String dato) {
		Document.put("nombre", dato);
		collection.insert(Document);
		return true;
	}
	
	public void mostrar() {
		DBCursor cursor = collection.find();
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
		}
	}
	
	public boolean actualizar(String accionVieja, String accionNueva) {
		Document.put("nombre", accionVieja);
		BasicDBObject documentNuevo = new BasicDBObject();
		documentNuevo.put("nombre",accionNueva);
		collection.findAndModify(Document, documentNuevo);
		return true;
	}
	
	public boolean eliminar(String dato) {
		Document.put("nombre",dato);
		collection.remove(Document);
		return true;
	}
	
	
	
	
	
	
}
