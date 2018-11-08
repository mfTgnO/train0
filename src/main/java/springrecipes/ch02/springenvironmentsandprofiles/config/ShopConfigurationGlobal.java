/*
package springrecipes.ch02.springenvironmentsandprofiles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springrecipes.ch02.springenvironmentsandprofiles.Cashier;

@Configuration
@Profile("global")
public class ShopConfigurationGlobal {
    @Bean(initMethod = "openFile", destroyMethod = "closeFile")
    public Cashier cashier() {
        final String path = System.getProperty("java.io.tmpdir") + "cashier";
        Cashier c1 = new Cashier();
        c1.setFileName("checkout");
        c1.setPath(path);
        return c1;
    }
}
*/
