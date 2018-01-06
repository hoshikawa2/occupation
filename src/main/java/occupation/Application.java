package occupation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@SpringBootApplication
public class Application {

    public static Optional<String> port = null;
    
    public static void main(String[] args) {
    	SpringApplication application = new SpringApplication(Application.class);
    
        port = Optional.ofNullable(System.getenv("PORT"));
        
    	Map<String, Object> map = new HashMap<>();
		map.put("SERVER_PORT", port);
		application.setDefaultProperties(map);
        application.run(args);
    }
}