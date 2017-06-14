package MyResftfullApp.service;

import java.io.IOException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import MyResftfullApp.db.DataBase;
import MyResftfullApp.model.Usuario;

@Controller
public class ServiceUsuarios {
	@RequestMapping (value = "/app/api/Usuarios", method = {RequestMethod.GET})
	@ResponseBody
	ResponseEntity<List<Usuario>> get() throws JsonParseException, JsonMappingException, IOException {
		
		return ResponseEntity.status(HttpStatus.OK).body(DataBase.getUserList());
	}
}
