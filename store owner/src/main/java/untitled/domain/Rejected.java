package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class Rejected extends AbstractEvent {

    private Long id;
    private Long orderId;

    public Rejected(Cooking aggregate) {
        super(aggregate);
    }

    public Rejected() {
        super();
    }
}
