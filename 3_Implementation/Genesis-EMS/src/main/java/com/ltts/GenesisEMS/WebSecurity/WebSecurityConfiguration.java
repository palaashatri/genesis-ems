package com.ltts.GenesisEMS.WebSecurity;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.ltts.GenesisEMS.model.Employees;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
    private DataSource dataSource;
	
	
     
    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource)
            .usersByUsernameQuery("select username,CONCAT('{noop}',password),enabled from employees where username=?")
            .authoritiesByUsernameQuery("select username, role,enabled from employees where username=?")
        ;
    }
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
        .antMatchers("/admin")
        .hasAuthority("ADMIN")
            .anyRequest().authenticated()
            .and()
            .formLogin().permitAll()
            .and()
            .logout().permitAll();     
    }
}

	/*
	@Autowired
	private UserDetailsService userDetailsService;
	@Bean
	AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		return provider;
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		UserBuilder users= User.withDefaultPasswordEncoder();
				//auth.inMemoryAuthentication()
				//.withUser(users.username("aditya").password("1234").roles("ADMIN"));
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests()
        .antMatchers("/").hasRole("ADMIN")
        //.permitAll(
        .antMatchers("/home")
        .hasAuthority("USER")
        .antMatchers("/admin")
        //.hasAnyAuthority("ADMIN","USER","Associate Engineer","User")
        .hasRole("ADMIN")
        
        .anyRequest()
        .authenticated()
        .and()
        .httpBasic();
		    
		    
	}*/


