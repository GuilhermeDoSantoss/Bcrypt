package br.com.guilherme.bcrypt;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BcryptApplication { 
	public static void main(String[] args) {
		String senhaOriginal = "12345";
		String senhaCrypto;
		
		senhaCrypto = BCrypt.hashpw(senhaOriginal, BCrypt.gensalt());

		System.out.println(senhaCrypto);

		if (BCrypt.checkpw(senhaOriginal, senhaCrypto)){
			System.out.println("Acesso permitido");
		}
		else{
			System.out.println("Acesso negado");
		}

		BCryptPasswordEncoder encoder;
		encoder = new BCryptPasswordEncoder();

		senhaCrypto = encoder.encode(senhaOriginal);

		System.out.println(senhaCrypto);

		if (enconder.matches(senhaOriginal, senhaCrypto)){
			System.out.println("Acesso permitido");
		} else{
			System.out.println("Acesso negado");
		}

	}
}