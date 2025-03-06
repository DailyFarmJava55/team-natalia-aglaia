package java55.farm.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authorization.AuthorizationDecision;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.expression.WebExpressionAuthorizationManager;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {
    final CustomWebSecurity webSecurity;

    //https://www.baeldung.com/spring-security-login


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.httpBasic(Customizer.withDefaults());
        http.csrf(csrf -> csrf.disable());
        http.authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/api/auth/farm/register", "/api/auth/farm/get/**")
                    .permitAll()
                .requestMatchers(HttpMethod.PUT, "/api/auth/farm/{login}")
                    .access(new WebExpressionAuthorizationManager("#login == authentication.name"))
                .requestMatchers(HttpMethod.PUT,"/api/auth/farm/edit/id/{id}")
                    .access((authentication, context) -> new AuthorizationDecision(
                        webSecurity.checkFarmLoginById(context.getVariables().get("id"), authentication.get().getName())))

//                .anyRequest().authenticated()
        );

        return http.build();


    }


}


