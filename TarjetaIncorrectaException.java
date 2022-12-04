import java.io.*;
public class TarjetaIncorrectaException extends ErrorDePagoException {
	public TarjetaIncorrectaException() {
		super("El número de la tarjeta es incorrecta");
	}
	public TarjetaIncorrectaException(String mensaje) {
		super(mensaje);
	}

}
