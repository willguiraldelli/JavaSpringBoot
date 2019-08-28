package br.com.unifacef.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeuPrimeiroProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoSpringApplication.class, args);
		System.out.println("Alteramos o arquivo application.properties ");
		System.out.println("de modo que não precisemos configurar agora a fonte de dados do MySQL ");
	}

}
