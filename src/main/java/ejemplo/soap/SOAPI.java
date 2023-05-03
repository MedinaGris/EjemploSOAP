package ejemplo.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface SOAPI {
	@WebMethod
	public int sumar(int num1, int num2);
}
