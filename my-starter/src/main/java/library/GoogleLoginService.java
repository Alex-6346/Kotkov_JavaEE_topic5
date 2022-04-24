package library;

import org.springframework.beans.factory.InitializingBean;

public class GoogleLoginService implements LoginService, InitializingBean {
    @Override
    public void printInfo() {
        System.out.println("Logged using GOOGLE account - @ConditionalOnProperty");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        printInfo();
    }
}
