package ejemplo.soap;

import javax.jws.WebService;

import ejemplo.model.Operacion;

@WebService(endpointInterface = "ejemplo.soap.SOAPI")  //anotación que indica que esta clase será expuesta como web service
													   //Nombre del servicio, que será utilizado para crear la URL del endpoint
public class SOAPImpl implements SOAPI{

	@Override
	public int sumar(int num1, int num2) {
		Operacion.setN1(num1);
		Operacion.setN2(num2);
		return Operacion.sumar();
	
	}


}
