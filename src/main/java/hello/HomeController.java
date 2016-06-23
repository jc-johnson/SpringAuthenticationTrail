package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jjohnson on 6/23/2016.
 */

@RestController
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "Welcome to the home page!";
    }
}
