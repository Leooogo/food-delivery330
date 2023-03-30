package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FoodPicked extends AbstractEvent {

    private Long id;

    public FoodPicked(Delivery aggregate) {
        super(aggregate);
    }

    public FoodPicked() {
        super();
    }
}
