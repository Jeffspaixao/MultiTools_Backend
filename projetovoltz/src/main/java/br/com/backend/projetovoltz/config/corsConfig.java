package br.com.backend.projetovoltz.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class corsConfig implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("http://localhost:3000/", "http://169.57.150.59:3017/").allowedMethods("GET", "POST", "PUT",
				"DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");

	}
	

}