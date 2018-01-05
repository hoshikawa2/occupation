package occupation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@SpringBootApplication
public class Application {

    //public static String protocol = "";
    //public static Optional<String> host = null;
    public static Optional<String> port = null;
    
    public static void main(String[] args) {
    	SpringApplication application = new SpringApplication(Application.class);
    
        //protocol = "http://";
        //host = Optional.ofNullable(System.getenv("HOSTNAME"));
        port = Optional.ofNullable(System.getenv("PORT"));
        
    	Map<String, Object> map = new HashMap<>();
		map.put("SERVER_PORT", port);
		application.setDefaultProperties(map);
        application.run(args);
    }
}