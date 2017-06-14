package MyResftfullApp.db;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;

import MyResftfullApp.model.Usuario;

public class DataBase {
	private static final MongoClient mongoClient = new MongoClient("localhost");
	public static final ObjectMapper JSON_MAPPER = new ObjectMapper();

	public static final List<Usuario> getUserList () throws JsonParseException, JsonMappingException, IOException{
		MongoDatabase database = mongoClient.getDatabase("virtualmind"); //mongoClient es un pool de conexiones
		
		FindIterable<Document> docs = database.getCollection("Usuarios").find().projection(Projections.excludeId());
		List<Usuario> userList = new ArrayList<Usuario>();

		for (Document doc : docs) {
			userList.add(JSON_MAPPER.readValue(doc.toJson(), Usuario.class));
		}
		
		return userList;
	}
}
