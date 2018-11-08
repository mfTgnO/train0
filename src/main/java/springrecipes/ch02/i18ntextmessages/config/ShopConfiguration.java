/*
package springrecipes.ch02.i18ntextmessages.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

*/
/*
* The bean instance must have the name messageSource for the application context to detect it.
Inside the bean definition you declare a String list via the setBasenames method to locate bundles
for the ResourceBundleMessageSource. In this case, you just specify the default convention to look up
files located in the Java classpath that start with messages. In addition, the setCacheSeconds methods
sets the caching to 1 second to avoid reading stale messages. Note that a refresh attempt first checks the
last-modified timestamp of the properties file before actually reloading it, so if files don’t change, the
setCacheSeconds interval can be set rather low, as refresh attempts aren’t actually reloaded.
For this MessageSource definition, if you look up a text message for the United States locale, whose
preferred language is English, the resource bundle messages_en_US.properties is considered first. If there’s
no such resource bundle or the message can’t be found, then a messages_en.properties file that matches
the language is considered. If a resource bundle still can’t be found, the default messages.properties for
all locales is chosen. For more information on resource bundle loading, you can refer to the Javadoc of the
java.util.ResourceBundle class.
* *//*

@Configuration
public class ShopConfiguration {
    @Bean
    public ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasenames("classpath:messages");
        messageSource.setCacheSeconds(1);
        return messageSource;
    }
}
*/
