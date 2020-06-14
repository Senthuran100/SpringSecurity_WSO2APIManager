package com.example.demo;

import com.example.demo.Dao.CarDao;
import com.example.demo.Model.CarItem;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;


@SpringBootApplication
@EnableOAuth2Sso
public class AuthorizationAuthenticationApplication implements CommandLineRunner{

	@Autowired
	private CarDao carDao;

	public static void main(String[] args) {
		SpringApplication.run(AuthorizationAuthenticationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		CarItem carItem1 = new CarItem();
		carItem1.setCarname("Audi A3");
		carItem1.setDescription("The Audi A3 is a sedan, convertible, or plug-in hybrid hatchback that are among the most affordable cars available from the automaker.");
		carItem1.setPrice(36500.00);
		carDao.save(carItem1);

		CarItem carItem2 = new CarItem();
		carItem2.setCarname("Toyota Venza");
		carItem2.setDescription("Toyota Venza is a two-row hybrid crossover SUV that’s smaller than the three-row Highlander, and largely based on the RAV4.");
		carItem2.setPrice(30000.00);
		carDao.save(carItem2);

		CarItem carItem3 = new CarItem();
		carItem3.setCarname("Ford Fiesta");
		carItem3.setDescription("The Ford Fiesta is a small hatchback or sedan that struggled to find a crowd with low gas prices and rising competition. In 2018, Ford said the 2019 model year would be the last for the scrappy, tiny hatchback.");
		carItem3.setPrice(15000.00);
		carDao.save(carItem3);


	}
}
