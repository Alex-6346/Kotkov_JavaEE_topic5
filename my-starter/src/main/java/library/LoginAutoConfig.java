package library;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoginAutoConfig {

    @Bean("facebook")
    @ConditionalOnProperty(value = "login.property", havingValue = "facebook")
    LoginService facebook() {
        return new FacebookLoginService();
    }

    @Bean("email")
    @ConditionalOnProperty(value = "login.property", havingValue = "email", matchIfMissing = true)
    LoginService email() {
        return new EmailLoginService();
    }

    @Bean("google")
    @ConditionalOnProperty(value = "login.property", havingValue = "google")
    LoginService google() {
        return new GoogleLoginService();
    }




}
