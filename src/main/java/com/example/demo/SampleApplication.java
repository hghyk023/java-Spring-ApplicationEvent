package com.example.demo;

import com.example.demo.publisher.SamplePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.stream.IntStream;

@SpringBootApplication
public class SampleApplication implements CommandLineRunner {

	@Autowired
	private SamplePublisher samplePublisher;

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SampleApplication.class);
		ApplicationContext context = application.run();
		SpringApplication.exit(context);
	}

	/**
	 * Callback used to run the bean.
	 *
	 * @param args incoming main method arguments
	 * @throws Exception on error
	 */
	@Override
	public void run(String... args) throws Exception {
		IntStream.range(0, 10).forEach(it -> samplePublisher.sendMessage(String.valueOf(it)));
	}
}
