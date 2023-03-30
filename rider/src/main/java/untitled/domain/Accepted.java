package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class Accepted extends AbstractEvent {

    private Long id;
    private String status;
    private Long orderId;
}
