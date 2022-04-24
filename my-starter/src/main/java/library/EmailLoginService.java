package library;

import org.springframework.beans.factory.InitializingBean;

public class EmailLoginService implements LoginService, InitializingBean {
    @Override
    public void printInfo() {
        System.out.println("Logged using EMAIL - @ConditionalOnProperty");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        printInfo();
    }
}
