import java.io.*;
public class ErrorDeCuentaException extends ErrorDeBoletoException {
	public ErrorDeCuentaException() {
		super("Se ha producido un error en la cuenta");
		
	}
	public ErrorDeCuentaException(String mensaje) {
		super(mensaje);
	}

}
