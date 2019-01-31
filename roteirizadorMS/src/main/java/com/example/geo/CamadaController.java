package com.example.geo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Cesar Schutz
 */
@RestController
@RequestMapping("/roteirizador")
public class CamadaController {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${zuul.url}")
	private String zuulUrl;
	
	@GetMapping("/helloError")
	public String camadaRoteirizadorError() {
		String url = zuulUrl + "/geoms/camadaError";
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		return "hello " + response.getBody();
	}

	@GetMapping("/hello")
	public String camadaRoteirizador() {
		String url = zuulUrl + "/geoms/camada";
		ResponseEntity<String> response = restTemplate.postForEntity(url, null, String.class);
		return "hello " + response.getBody();
	}
}
