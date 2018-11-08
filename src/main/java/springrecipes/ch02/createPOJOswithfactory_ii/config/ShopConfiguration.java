/*
package springrecipes.ch02.createPOJOswithfactory_ii.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springrecipes.ch02.createPOJOswithfactory_ii.Battery;
import springrecipes.ch02.createPOJOswithfactory_ii.Disc;
import springrecipes.ch02.createPOJOswithfactory_ii.Product;
import springrecipes.ch02.createPOJOswithfactory_ii.ProductCreator;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan("springrecipes.ch02.createPOJOswithfactory_ii")
public class ShopConfiguration {
    @Bean
    public ProductCreator productCreatorFactory() {
        ProductCreator factory = new ProductCreator();
        Map<String, Product> products = new HashMap<>();
        products.put("aaa", new Battery("AAA", 2.5));
        products.put("cdrw", new Disc("CD-RW", 1.5));
        products.put("dvdrw", new Disc("DVD-RW", 3.0));
        factory.setProducts(products);
        return factory;
    }

    @Bean
    public Product aaa() {
        return productCreatorFactory().createProduct("aaa");
    }

    @Bean
    public Product cdrw() {
        return productCreatorFactory().createProduct("cdrw");
    }

    @Bean
    public Product dvdrw() {
        return productCreatorFactory().createProduct("dvdrw");
    }
}*/
