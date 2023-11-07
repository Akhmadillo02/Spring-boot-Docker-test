package uz.najottalim.dockercllaswork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/date")
    public String date() {
        return "data";
    }


    @GetMapping("/date1")
    public String date1() {
        return "data1";
    }
}