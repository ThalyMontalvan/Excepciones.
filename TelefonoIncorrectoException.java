import java.io.*;
public class TelefonoIncorrectoException extends ErrorDeCuentaException{
	public TelefonoIncorrectoException() {
		super("El número de teléfono es incorrecto");
		}
	public TelefonoIncorrectoException(String mensaje) {
		super(mensaje);
	}

}
