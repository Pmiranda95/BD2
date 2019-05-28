package conexionbd;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import modelo.Cliente;
import modelo.ObraSocial;
import modelo.Sucursal;

import org.mongojack.JacksonDBCollection;
import org.mongojack.WriteResult;
import org.omg.CORBA.Any;

public class Connexion {
	DB BaseDatos;
	DBCollection collection;
	BasicDBObject Document = new BasicDBObject();
	
	public Connexion() {
		try {
			Mongo mongo =  new Mongo("localhost",27017);
			BaseDatos =mongo.getDB("admin");
			collection = BaseDatos.getCollection("Sucursal");
			
			System.out.println("conexion establecida");
		} catch (Exception e) {
			Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE,null,e);
		}
	}
	
	/*public boolean insert(Cliente dato) {
		//magia que hace el insert
		JacksonDBCollection<Cliente, String> coll = JacksonDBCollection.wrap(collection, Cliente.class, String.class);
		Cliente myObject = dato;
		WriteResult<Cliente, String> result = coll.insert(myObject);
		return true;
	}*/
	
	
	public boolean insert(Sucursal dato) {
		//magia que hace el insert
		JacksonDBCollection<Sucursal, String> coll = JacksonDBCollection.wrap(collection, Sucursal.class, String.class);
		Sucursal myObject = dato;
		WriteResult<Sucursal, String> result = coll.insert(myObject);
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
