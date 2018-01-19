package io.rscale.training.attendeeviewer;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.RestController;

@EnableOAuth2Sso
@Profile("cloud")
@Configuration
@RestController
public class Auth2Config extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
	      .antMatcher("/**")
	      .authorizeRequests()
	        .antMatchers("/login**", "/webjars/**")
	        .permitAll()
	      .anyRequest()
	        .authenticated();
	}
	
	
}
