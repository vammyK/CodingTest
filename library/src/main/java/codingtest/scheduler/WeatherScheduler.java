package codingtest.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WeatherScheduler {
	
	
	@Scheduled(fixedDelay=1_000)
	void pollWeather(){
		System.out.println("Scheduler Working");
	}

}
