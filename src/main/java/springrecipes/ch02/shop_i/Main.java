/*
package springrecipes.ch02.shop_i;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

*/
/*
 * Next, you can write the following Main class to test your products by retrieving them from the Spring
 * IoC container:
 *//*

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ShopConfiguration.class);
        Product aaa = context.getBean("aaa", Product.class);
        Product cdrw = context.getBean("cdrw", Product.class);
        System.out.println(aaa);
        System.out.println(cdrw);
    }
}
*/
