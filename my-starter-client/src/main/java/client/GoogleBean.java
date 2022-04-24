package client;

import org.springframework.beans.factory.InitializingBean;


public class GoogleBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("I love GOOGLE");
    }

}
