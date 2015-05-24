package br.com.munificentissimus.criptografia;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class CriptografiaBase64 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String entrada = "Teste";
		String resultado = "";

		System.out.println("De String: " + entrada);
		resultado = getToBase64(entrada);
		System.out.println("Para base 64: " + resultado);

		entrada = resultado;
		
		System.out.println("\nDe base 64: " + entrada);
		resultado = getFromBase64(entrada);
		System.out.println("Para String: " + resultado);

	}

	private static String getToBase64(String entrada)
			throws UnsupportedEncodingException {
		return Base64.getEncoder().encodeToString(entrada.getBytes("utf-8"));
	}

	private static String getFromBase64(String entrada)
			throws UnsupportedEncodingException {
		return new String(Base64.getDecoder().decode(entrada), "utf-8");
	}
}
