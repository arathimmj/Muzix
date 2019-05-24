package com.stackroute.MuzixRestfulService;

import com.stackroute.MuzixRestfulService.domain.Track;
import com.stackroute.MuzixRestfulService.repository.TrackRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MuzixRestfulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuzixRestfulServiceApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner demoData(TrackRepository trackRepo) {

		Track track = new Track(5,"Photograph","Ed Sheeran");
		Track track1 = new Track(7,"Shape of You","Ed Sheeran");

		return args -> {
			trackRepo.save(track);
			trackRepo.save(track1);
		};
	}*/

}
