package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class FoodPicked extends AbstractEvent {

    private Long id;

    public FoodPicked() {
        super();
    }
}
