package client;

import library.LoginAutoConfig;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(LoginAutoConfig.class)
public class ClientAutoConfig {

    @Bean
    @ConditionalOnMissingBean(name="facebook")
    NotFacebookBean notFacebookBean(){return new NotFacebookBean();}


    @Bean
    @ConditionalOnBean(name="facebook")
    //@DependsOn("facebook")
    FacebookBean facebookBean(){return new FacebookBean();}



    @Bean
    @ConditionalOnBean(name="google")
    //@DependsOn("google")
    GoogleBean googleBean(){return new GoogleBean();}

}
