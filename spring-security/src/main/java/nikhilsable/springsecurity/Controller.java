package nikhilsable.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String hello(){
        return "Hello world";
    }
    @GetMapping("/hey")
    public String hey(){
        return "Hey there";
    }
    @GetMapping("hi")
    public String hii(){
        return "Hi";
    }
}
