import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan (basePackages = {"Topic", "Hello"})
public class SpringBootHelloWorldApplication {

    public static void main(String[] args){
        SpringApplication.run(SpringBootHelloWorldApplication.class, args);
    }
}
