/*
package spring_recipes_4th.ch02.propertiesfiledata_i.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import spring_recipes_4th.ch02.propertiesfiledata_i.Battery;
import spring_recipes_4th.ch02.propertiesfiledata_i.Disc;
import spring_recipes_4th.ch02.propertiesfiledata_i.Product;

@Configuration
@PropertySource("classpath:discounts.properties")
@ComponentScan("spring_recipes_4th.ch02.propertiesfiledata_i")
public class ShopConfiguration {
    */
/*
     * The syntax is @Value("${key:default_value}"). A search is done for the key value in all the loaded
     * application properties. If a matching key=value is found in the properties file, the corresponding value
     * is assigned to the bean property. If no matching key=value is found in the loaded application properties,
     * default_value (i.e., after ${key:) is assigned to the bean property.
     * *//*


    @Value("${specialcustomer.discount:0}")
    private double specialCustomerDiscountField;

    @Value("${summer.discount:0}")
    private double specialSummerDiscountField;

    @Value("${endofyear.discount:0}")
    private double specialEndofyearDiscountField;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public Product aaa() {
        Battery p1 = new Battery();
        p1.setName("AAA");
        p1.setPrice(2.5);
        p1.setRechargeable(true);
        p1.setDiscount(specialCustomerDiscountField);
        return p1;
    }

    @Bean
    public Product cdrw() {
        Disc p2 = new Disc("CD-RW", 1.5, specialSummerDiscountField);
        p2.setCapacity(700);
        return p2;
    }

    @Bean
    public Product dvdrw() {
        Disc p2 = new Disc("DVD-RW", 3.0, specialEndofyearDiscountField);
        p2.setCapacity(700);
        return p2;
    }
}*/
