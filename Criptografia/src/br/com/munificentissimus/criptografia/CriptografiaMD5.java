package br.com.munificentissimus.criptografia;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class CriptografiaMD5 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		String entrada = "Teste";
		String resultado = getMD5(entrada);
		
		System.out.println("MD5: " + resultado);
	}
	
	private static String getMD5(String entrada) throws NoSuchAlgorithmException {
		MessageDigest m = MessageDigest.getInstance("MD5");
		m.update(entrada.getBytes(), 0, entrada.length());
		return new BigInteger(1, m.digest()).toString(16);
	}
}
