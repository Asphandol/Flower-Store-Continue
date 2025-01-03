package ua.edu.ucu.apps.delivery;

import java.util.List;

import lombok.Getter;
import ua.edu.ucu.apps.order.Item;

@Getter
public class DHLDeliveryStrategy implements Delivery {
    private String description;
    public DHLDeliveryStrategy(){
        description = "DHLDelivery";
    }
    public String deliver(List<Item> items){
        StringBuilder str = new StringBuilder("Delivered ");
        str.append(items.size());
        str.append(" items;" + description);
        return str.toString();
    }
    
}
