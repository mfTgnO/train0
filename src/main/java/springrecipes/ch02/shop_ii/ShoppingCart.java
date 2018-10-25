package springrecipes.ch02.shop_ii;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/*
 * This is because Spring’s default bean scope is singleton, which means Spring creates exactly one
 * shopping cart instance per IoC container.
 * In your shop application, you expect each customer to get a different shopping cart instance when the
 * getBean() method is called. To ensure this behavior, the scope of the shoppingCart bean needs to be set to
 * prototype. Then Spring creates a new bean instance for each getBean() method call.
 * */
@Component
//@Scope("singleton")
@Scope("prototype")
public class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void addItem(Product item) {
        items.add(item);
    }

    public List<Product> getItems() {
        return items;
    }
}
