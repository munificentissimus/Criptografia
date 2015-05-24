package br.com.munificentissimus.criptografia;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class CriptografiaSHA1 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		String entrada = "Teste";
		String resultado = getSHA1(entrada);
		
		System.out.println("SHA-1: " + resultado);
	}
	
	private static String getSHA1(String entrada) throws NoSuchAlgorithmException {
		MessageDigest m = MessageDigest.getInstance("SHA-1");
		m.update(entrada.getBytes(), 0, entrada.length());
		return new BigInteger(1, m.digest()).toString(16);
	}
}
