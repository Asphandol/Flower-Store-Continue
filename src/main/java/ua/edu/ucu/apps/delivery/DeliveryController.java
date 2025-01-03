package ua.edu.ucu.apps.delivery;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.flower.Flower;




@RestController
public class DeliveryController {
    Delivery deliveryType;
    public DeliveryController(){
        deliveryType = new PostDeliveryStrategy();
    }

    @GetMapping("/delivery")
    public String deliveryInfo(){
        return deliveryType.deliver(List.of(new Flower(), new Flower(), new Flower()));
    }
    
}