package MyResftfullApp.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Usuario {
	@JsonProperty("id")
  private int id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("lastname")
	private String lastName;
	@JsonProperty("email")
	private String email;
	@JsonProperty("password")
	private String password;
	
  @JsonCreator
  public Usuario(
  		@JsonProperty("id") int id,
  		@JsonProperty("name")  String name,
  		@JsonProperty("lastname")  String lastName,
  		@JsonProperty("email")  String email,
  		@JsonProperty("password") String password){   
  	this.id = id;
  	this.name = name;
  	this.lastName = lastName;
  	this.email = email;
  	this.password = password;
  }
  
}
