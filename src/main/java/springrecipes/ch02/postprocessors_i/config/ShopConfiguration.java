/*
package springrecipes.ch02.postprocessors_i.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springrecipes.ch02.postprocessors_i.Battery;
import springrecipes.ch02.postprocessors_i.Cashier;
import springrecipes.ch02.postprocessors_i.Disc;
import springrecipes.ch02.postprocessors_i.Product;

@Configuration
public class ShopConfiguration {
    @Bean
    public Product aaa() {
        Battery p1 = new Battery();
        p1.setName("AAA");
        p1.setPrice(2.5);
        p1.setRechargeable(true);
        return p1;
    }

    @Bean
    public Product cdrw() {
        Disc p2 = new Disc("CD-RW", 1.5);
        p2.setCapacity(700);
        return p2;
    }

    @Bean
    public Product dvdrw() {
        Disc p2 = new Disc("DVD-RW", 3.0);
        p2.setCapacity(700);
        return p2;
    }

    @Bean(initMethod = "openFile", destroyMethod = "closeFile")
    public Cashier cashier() {
        Cashier c1 = new Cashier();
        c1.setFileName("checkout");
        c1.setPath("c:/Windows/Temp/cashier");
        return c1;
    }
}
*/
