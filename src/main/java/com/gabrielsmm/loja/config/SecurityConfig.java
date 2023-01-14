package com.gabrielsmm.loja.config;

// https://stackoverflow.com/questions/74680244/h2-database-console-not-opening-with-spring-security
import static org.springframework.boot.autoconfigure.security.servlet.PathRequest.toH2Console;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

//	private static final String[] PUBLIC_MATCHERS = {
//			"/h2-console/**"
//	};
	
	private static final String[] PUBLIC_MATCHERS_GET = {
			"/produtos/**",
			"/categorias/**"
	};
	
	@Bean
	SecurityFilterChain springWebFilterChain(HttpSecurity http) throws Exception {
		return http.cors().and().csrf().disable()
				.headers().frameOptions().sameOrigin().and()
				.sessionManagement(c -> c.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.authorizeHttpRequests((req) -> req
				.requestMatchers(toH2Console()).permitAll()		
				.requestMatchers(HttpMethod.GET, PUBLIC_MATCHERS_GET).permitAll()
				.anyRequest().authenticated())
				.build();
	}
	
	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration configuration = new CorsConfiguration().applyPermitDefaultValues();
//		configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
//		configuration.setAllowedMethods(Arrays.asList("POST", "GET", "PUT", "PATCH", "DELETE", "OPTIONS"));
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;
	}
	
}
