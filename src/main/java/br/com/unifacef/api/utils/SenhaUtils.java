package br.com.unifacef.api.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {
	/**
	 * Gera um hash utilizando o BCrypt.
	 *
	 * @param senha
	 * @return String
	 */
	public static String gerarBCrypt(String senha) {
		if (senha == null) {
			return senha;
		}
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.encode(senha);
	}

	/**
	 * Verifica se a senha é válida.
	 *
	 * @param senha
	 * @param senhaEncoded
	 * @return boolean
	 */

	/*
	 * O metodo a seguir verificar se a senha é valida, validando se as senhas
	 * criptografadas significam a senha
	 */

	public static boolean senhaValida(String senha, String senhaEncoded) {
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.matches(senha, senhaEncoded);
	}
}