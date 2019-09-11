package br.com.unifacef.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.unifacef.api.entities.Empresa;
import br.com.unifacef.api.utils.SenhaUtils;

@SpringBootApplication
public class MeuPrimeiroProjetoSpringApplication {

	// injeção de dependencia é chamar os metodos de uma classe sem ter que
	// instanciar

	@Autowired
	private EmpresaRepository empresaRepository;

	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoSpringApplication.class, args);
//		System.out.println("Alteramos o arquivo application.properties ");
//		System.out.println("de modo que não precisemos configurar agora a fonte de dados do MySQL ");
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
//			String senhaEncoded = SenhaUtils.gerarBCrypt("123456");
//			System.out.println("Senha encoded: " + senhaEncoded);
//			senhaEncoded = SenhaUtils.gerarBCrypt("123456");
//			System.out.println("Senha encoded novamente:" + senhaEncoded);
//			System.out.println("Senha válida: " + SenhaUtils.senhaValida("123456", senhaEncoded));

			Empresa empresa = new Empresa();
			empresa.setRazaoSocial("Kazale IT");
			empresa.setCnpj("74645215000104");
			this.empresaRepository.save(empresa);
			// salvando no banco de dados uma empresa em forma de objeto
			// tem que ter criado uma interface de repositorio para se realizar um save;

			List<Empresa> empresas = empresaRepository.findAll();
			// Metodo que lista todas as empresas que estão no repositorio/banco de dados

			empresas.forEach(System.out::println);

			// Recuperando e editando uma Empresa
			Empresa empresaDb = empresaRepository.findById(1L).orElse(null);
			System.out.println("Empresa por ID: " + empresaDb);
			empresaDb.setRazaoSocial("Kazale IT Web");
			// quando registro já existe, o save realiza a ação de update
			this.empresaRepository.save(empresaDb);
			
			Empresa empresaCnpj = empresaRepository.findByCnpj("74645215000104");
			System.out.println("Empresa por CNPJ: " + empresaCnpj);
			this.empresaRepository.delete(empresaCnpj);
			empresas = empresaRepository.findAll();
			System.out.println("Empresas: " + empresas.size());
		};
	}

}
