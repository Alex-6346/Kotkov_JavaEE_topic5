package library;

import org.springframework.beans.factory.InitializingBean;


public class FacebookLoginService implements LoginService, InitializingBean {
    @Override
    public void printInfo() {
        System.out.println("Logged using FACEBOOK account - @ConditionalOnProperty");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        printInfo();
    }
}
