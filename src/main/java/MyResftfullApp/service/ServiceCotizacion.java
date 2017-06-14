package MyResftfullApp.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import MyResftfullApp.model.Moneda;
import MyResftfullApp.model.Monedas;

@Controller
public class ServiceCotizacion {
	static final Monedas monedas = new Monedas();

	@RequestMapping (value = "/app/api/Cotizacion/{MONEDA}", method = {RequestMethod.GET})
	@ResponseBody
	ResponseEntity<Moneda> home(@PathVariable("MONEDA") String unaMoneda) {
		return monedas.getCotizacion(unaMoneda);
	}
}
