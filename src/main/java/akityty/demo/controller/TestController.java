package akityty.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/api/helloworld")
    public String findAll(){
        return "Hello World!";
    }
}
