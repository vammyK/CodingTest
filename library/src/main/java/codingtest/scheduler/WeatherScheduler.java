package codingtest.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import codingtest.dto.Forecasts;

@Component
public class WeatherScheduler {
	private static final Logger log = LoggerFactory.getLogger(WeatherScheduler.class);

	@Scheduled(fixedDelay = 1_000)
	void pollWeather() {

		RestTemplate restTemplate = new RestTemplate();
		Forecasts forecast = restTemplate.getForObject("http://www.ilmateenistus.ee/ilma_andmed/xml/forecast.php?lang=eng",
				Forecasts.class);
		log.info(forecast.toString());

		log.info("Scheduler Working");
	}

}
