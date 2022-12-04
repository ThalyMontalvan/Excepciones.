import java.io.*;
public class ErrorDeBoletoException extends Exception{
	public ErrorDeBoletoException() {
		super("Se ha presentado un error al comprar el boleto");	
		}
	public ErrorDeBoletoException(String mensaje) {
		super(mensaje);
	}
	

}
