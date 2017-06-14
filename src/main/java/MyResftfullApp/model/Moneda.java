package MyResftfullApp.model;

import org.springframework.http.HttpStatus;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class Moneda {
	@JsonProperty("compra")
	protected double compra;
	@JsonProperty("venta")
	protected double venta;
	
	@JsonCreator
	public Moneda(
			@JsonProperty("compra") Double compra,
			@JsonProperty("venta") Double venta){
		this.compra = compra;
		this.venta = venta;
	}
	
	public HttpStatus obtenerHttpSatus() {
		return HttpStatus.OK;
	}
	
	public abstract void cotizar();
	
}