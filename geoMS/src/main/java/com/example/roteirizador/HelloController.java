package com.example.roteirizador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cesar Schutz
 */
@RestController
@RequestMapping
public class HelloController {

	@GetMapping("/camadaError")
    public String helloError() {
    	String x = null;
    	x = x.toString();
        return "camada xxxx!";
    }

    @PostMapping("/camada")
    public String hello() {
        return "camada xxxx!";
    }
}
