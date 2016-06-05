package am.ik.blog;

import am.ik.categolj3.api.EnableCategoLJ3ApiServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableCategoLJ3ApiServer
@EnableDiscoveryClient
public class ThisWeekInMakingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThisWeekInMakingApplication.class, args);
	}
}
