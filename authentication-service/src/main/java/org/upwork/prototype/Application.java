package org.upwork.prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Application Main Class
 *
 * @author prasadm
 * @since 14 June 2022
 */

@SpringBootApplication
public class Application extends SpringBootServletInitializer
{
    public static void main( String[] args )
    {
        SpringApplication.run( Application.class, args );
    }

    @Override
    protected SpringApplicationBuilder configure( SpringApplicationBuilder application )
    {
        return application.sources( Application.class );
    }

    @Bean
    public RestTemplate restTemplate( RestTemplateBuilder restTemplateBuilder )
    {
        return restTemplateBuilder.build();
    }

//    @Bean
//    CommandLineRunner run( UserService userService )
//    {
//        return args ->
//        {
//            userService.saveRole( new RoleDTO( null, "ADMIN" ) );
//            userService.saveRole( new RoleDTO( null, "USER" ) );
//
//            userService.saveUser( new UserDTO( null, "Prasad Madusanka", "prasadm", "prasadm1022@gmail.com", "123456789", new ArrayList<>() ) );
//            userService.saveUser( new UserDTO( null, "Test User", "test", "test@gmail.com", "123456789", new ArrayList<>() ) );
//
//            userService.addRoleToUser( "prasadm", "ADMIN" );
//            userService.addRoleToUser( "prasadm", "USER" );
//            userService.addRoleToUser( "test", "USER" );
//        };
//    }
}
