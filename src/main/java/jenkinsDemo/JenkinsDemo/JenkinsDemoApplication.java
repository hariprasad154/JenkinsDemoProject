package jenkinsDemo.JenkinsDemo;


;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JenkinsDemoApplication {

	public static Logger logger= LoggerFactory.getLogger(JenkinsDemoApplication.class);
	@PostConstruct
	public void init(){
		logger.info("Application Startedd");
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
