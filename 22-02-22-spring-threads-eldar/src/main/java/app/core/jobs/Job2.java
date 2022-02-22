package app.core.jobs;

import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Job2 {

//	@Scheduled(fixedRate = 3, timeUnit = TimeUnit.SECONDS)
	@Scheduled(timeUnit = TimeUnit.SECONDS, initialDelay = 5, fixedRate = 2)
//	@Scheduled(cron = "* * * * *")
	public void job() {
		System.out.println("---------- deleting expired coupons 2");
	}
}
