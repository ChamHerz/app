package MyResftfullApp.model;

import org.springframework.http.HttpStatus;

public class Real extends Moneda {

	public Real(Double compra, Double venta) {
		super(compra, venta);
		
	}
	
	@Override
	public HttpStatus obtenerHttpSatus() {
		//return HttpStatus.UNAUTHORIZED;
		return HttpStatus.OK;
	}

	@Override
	public void cotizar() {
		
	}
	
}