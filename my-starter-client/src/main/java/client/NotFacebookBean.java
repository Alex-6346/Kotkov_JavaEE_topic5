package client;

import org.springframework.beans.factory.InitializingBean;



public class NotFacebookBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("I hate FACEBOOK");
    }

}
