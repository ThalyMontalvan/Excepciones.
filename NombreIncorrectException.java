import java.io.*;
public class NombreIncorrectException extends ErrorDeCuentaException {
	public NombreIncorrectException() {
		super("Nombre de usuario incorrecto");
		}
	public NombreIncorrectException(String mensaje) {
		super(mensaje);
	}

}
