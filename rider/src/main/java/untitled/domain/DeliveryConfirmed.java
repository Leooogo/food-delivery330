package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class DeliveryConfirmed extends AbstractEvent {

    private Long id;

    public DeliveryConfirmed() {
        super();
    }
}
