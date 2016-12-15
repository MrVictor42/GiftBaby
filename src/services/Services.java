package services;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Services {
	
	public static String transformaSenha(String senha) throws NoSuchAlgorithmException {
	
		String senhaValida = "";
		byte[] bytesDaSenha = null;
		try {
			bytesDaSenha = senha.getBytes("UTF-8");
		} catch (UnsupportedEncodingException error) {
			error.printStackTrace();
		}
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");
		byte[] digest = messageDigest.digest(bytesDaSenha);
		senhaValida = String.valueOf(digest);
		
		return senhaValida;
	}
}
