import java.io.*;
public class DineroInsuficienteException extends ErrorDePagoException {
	public DineroInsuficienteException() {
		super("El dinero es insuficiente");
		}
	public DineroInsuficienteException(String mensaje) {
		super(mensaje);
	}

}
