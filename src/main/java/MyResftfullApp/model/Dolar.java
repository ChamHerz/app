package MyResftfullApp.model;

import MyResftfullApp.util.BancoProvincia;

public class Dolar extends Moneda {

	public Dolar(Double compra, Double venta) {
		super(compra, venta);
	}
	
	@Override
	public void cotizar() {
		try {
			String[] dolarProvincia = BancoProvincia.Cotizacion();
			this.compra = Double.parseDouble(dolarProvincia[0]);
			this.venta = Double.parseDouble(dolarProvincia[1]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}