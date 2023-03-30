package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class AddressChanged extends AbstractEvent {

    private Long id;

    public AddressChanged(Order aggregate) {
        super(aggregate);
    }

    public AddressChanged() {
        super();
    }
}
