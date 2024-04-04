package kdh.shopping_app.control;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public class helloControl {

    @GetMapping("hello")
    public String hello(){


        return "hello";
    }
}
