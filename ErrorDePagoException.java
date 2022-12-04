import java.io.*;
public class ErrorDePagoException extends ErrorDeBoletoException{
	public ErrorDePagoException() {
		super("Se ha producido un error con el pago");
		
	}
	public ErrorDePagoException(String mensaje) {
		super(mensaje);
	}

}
