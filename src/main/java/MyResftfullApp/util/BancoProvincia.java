package MyResftfullApp.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import com.fasterxml.jackson.databind.ObjectMapper;


public class BancoProvincia {
	private static final ObjectMapper JSON_MAPPER = new ObjectMapper();
	

	public static String[] Cotizacion(){
		String[] dolarProvincia = null;
		try {
			URL urlServicio = new URL("https://www.bancoprovincia.com.ar/Principal/Dolar");
			HttpsURLConnection connection = (HttpsURLConnection) urlServicio.openConnection();
			connection.connect();
			BufferedReader br = new BufferedReader(new InputStreamReader((connection.getInputStream())));
			String linea = br.readLine();
			dolarProvincia = JSON_MAPPER.readValue(linea, String[].class);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
    return dolarProvincia;
	}
}
