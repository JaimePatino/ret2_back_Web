package Ret2_Web;

import Ret2_Web.interfaces.InterfaceHairproducts;
import Ret2_Web.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Ret2WebApplication implements CommandLineRunner {
   @Autowired
    private InterfaceHairproducts interfaceHairproducts;
    @Autowired
    private InterfaceUser interfaceUser;
	public static void main(String[] args) {
		SpringApplication.run(Ret2WebApplication.class, args);
	}
        @Override
    public void run(String... args) throws Exception {
        interfaceHairproducts.deleteAll();
        interfaceUser.deleteAll();
    }
}
