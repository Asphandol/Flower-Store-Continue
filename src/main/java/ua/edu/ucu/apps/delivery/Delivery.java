package ua.edu.ucu.apps.delivery;
import java.util.List;

import ua.edu.ucu.apps.order.Item;

public interface Delivery {
    public String deliver(List<Item> items);
}