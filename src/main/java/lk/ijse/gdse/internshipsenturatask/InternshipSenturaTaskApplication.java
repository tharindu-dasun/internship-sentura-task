package lk.ijse.gdse.internshipsenturatask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternshipSenturaTaskApplication {

    private static final String API_KEY = "your_api_key";
    private static final String BASE_URL = "https://your-weavy-domain.com/api";

    public static void main(String[] args) {

        SpringApplication.run(InternshipSenturaTaskApplication.class, args);
    }

}
