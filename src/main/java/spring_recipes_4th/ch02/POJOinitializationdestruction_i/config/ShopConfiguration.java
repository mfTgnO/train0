/*
package spring_recipes_4th.ch02.POJOinitializationdestruction_i.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring_recipes_4th.ch02.POJOinitializationdestruction_i.Battery;
import spring_recipes_4th.ch02.POJOinitializationdestruction_i.Cashier;
import spring_recipes_4th.ch02.POJOinitializationdestruction_i.Disc;
import spring_recipes_4th.ch02.POJOinitializationdestruction_i.Product;

@Configuration
@ComponentScan("spring_recipes_4th.ch02.POJOinitializationdestruction_i")
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
        String path = System.getProperty("java.io.tmpdir") + "/cashier";
        Cashier cashier = new Cashier();
        cashier.setFileName("checkout");
        cashier.setPath(path);
        return cashier;
    }
}
*/
