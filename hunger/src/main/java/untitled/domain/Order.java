package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.HungerApplication;
import untitled.domain.AddressChanged;
import untitled.domain.OrderCancelled;
import untitled.domain.OrderPlaced;

@Entity
@Table(name = "Order_table")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String foodId;

    private String options;

    private String address;

    private String customerId;

    private String status;

    @PostPersist
    public void onPostPersist() {
        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();

        OrderCancelled orderCancelled = new OrderCancelled(this);
        orderCancelled.publishAfterCommit();

        AddressChanged addressChanged = new AddressChanged(this);
        addressChanged.publishAfterCommit();
    }

    public static OrderRepository repository() {
        OrderRepository orderRepository = HungerApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }
}
