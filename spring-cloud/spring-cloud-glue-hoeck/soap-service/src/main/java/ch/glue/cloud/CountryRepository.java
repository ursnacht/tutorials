package ch.glue.cloud;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import ch.glue.cloud.springsoap.Country;
import ch.glue.cloud.springsoap.Currency;

@Component
public class CountryRepository {

	private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		// initialize countries map
		Country spain = new Country();
		spain.setName("Spain");
		spain.setPopulation(46704314);
		spain.setCapital("Madrid");
		spain.setCurrency(Currency.EUR);
		countries.put("Spain", spain);
	}

	public Country findCountry(String name) {
		return countries.get(name);
	}
}