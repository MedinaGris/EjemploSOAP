package ejemplo;

import javax.xml.ws.Endpoint;  //Clase que nos ayuda a publicar el Web Service 

import ejemplo.soap.SOAPImpl;

public class PublishService {

	public static void main(String[] args) {
		System.out.println("iniciando servicio Web");
		Endpoint.publish("http://localhost:1519/WS/Operaciones", new SOAPImpl());//publicación del servicio- parámetros: url, instancia al servicio
		//aqui se genera el wsdl
	}

}
