package MyResftfullApp.model;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.ResponseEntity;

public class Monedas {

	static final Map<String, Moneda> monedasMap = new HashMap<String, Moneda>();
	static final Moneda monedaPesos = new Pesos(1.0,1.0);
	static final Moneda monedaReal = new Real(4.2,5.0);
	static final Moneda monedaDolar = new Dolar(0.0,0.0);
	
	public Monedas(){
		monedasMap.put("PESOS", monedaPesos);
		monedasMap.put("REAL", monedaReal);
		monedasMap.put("DOLAR", monedaDolar);
	}
	
	public ResponseEntity<Moneda> getCotizacion(String unaMoneda) {
		monedasMap.get(unaMoneda).cotizar();
		return ResponseEntity.status(monedasMap.get(unaMoneda).obtenerHttpSatus()).body(monedasMap.get(unaMoneda));
	}
}
