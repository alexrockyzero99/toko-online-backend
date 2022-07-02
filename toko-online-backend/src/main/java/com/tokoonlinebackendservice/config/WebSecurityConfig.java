package com.tokoonlinebackendservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.tokoonlinebackendservice.security.JWTAuthorizationFilter;

@EnableWebSecurity
@Configuration
class WebSecurityConfig extends WebSecurityConfigurerAdapter  {

	@Value("${jwt.header}")
    private String jwtHeader;
	
	@Value("${jwt.secret}")
    private String jwtSecret;
	
	@Value("${jwt.prefix}")
    private String jwtPrefix;
    
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		http.cors().and()
		http.csrf().disable().cors().and()
			.addFilterAfter(new JWTAuthorizationFilter(jwtHeader,jwtSecret,jwtPrefix), 
					UsernamePasswordAuthenticationFilter.class).authorizeRequests()
			.antMatchers(HttpMethod.GET, "/api/sharia/main/v1/getListResponsibility").permitAll()
			.antMatchers(HttpMethod.POST,"/api/sharia/main/v1/login").permitAll()
			.antMatchers(HttpMethod.POST,"/api/sharia/main/v1/refreshToken").permitAll()
			.antMatchers(HttpMethod.GET,"/api/sharia/main/v1/getContentImageVideoById/{contentImageVideoId}").permitAll()
			.antMatchers(HttpMethod.GET,"/api/sharia/main/v1/getContentImageAudioById/{contentImageAudioId}").permitAll()
			.antMatchers(HttpMethod.GET, "/video/data").permitAll()
			.antMatchers(HttpMethod.GET,"/api/sharia/main/v1/getPagination").permitAll()
			.anyRequest().authenticated();
		
		
	/*	http.csrf().disable().cors().and().logout().disable().exceptionHandling().authenticationEntryPoint(restAuthenticationEntryPoint).and()
        .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class).authorizeRequests()
        .antMatchers(HttpMethod.GET, "/actuator/**").permitAll()
        .antMatchers(HttpMethod.POST, "/init-forgot-pass").permitAll()
        .antMatchers(HttpMethod.PUT, "/reset-pass").permitAll()
        .antMatchers(HttpMethod.PUT, "/forgot-pass").permitAll()
//        .antMatchers(HttpMethod.POST, "/**").permitAll()
//		.antMatchers(HttpMethod.GET, "/generate-error", "/hello-world").permitAll()
        .anyRequest().authenticated();*/
		
	/*	http.csrf().disable()
		.addFilterAfter(new JWTAuthorizationFilter(jwtHeader,jwtSecret,jwtPrefix,tokenBlacklistService), UsernamePasswordAuthenticationFilter.class)
		.authorizeRequests()
		.antMatchers(HttpMethod.POST,"/login","/refreshToken")
		.permitAll()
		.antMatchers(HttpMethod.GET,"/getUserType")
		.permitAll()
		.anyRequest().authenticated(); */
		
	}
	
	@Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/h2/**","/v2/api-docs", "/configuration/**", "/swagger-resources/**",  "/swagger-ui.html", "/webjars/**", "/api-docs/**");
    }
	
	@Bean
    public WebMvcConfigurer configurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/*").allowedOrigins("*");
            }
        };
    }
	
	
}