package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.StoreOwnerApplication;
import untitled.domain.Accepted;
import untitled.domain.CookFinished;
import untitled.domain.CookStarted;
import untitled.domain.Rejected;

@Entity
@Table(name = "Cooking_table")
@Data
public class Cooking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String status;

    private Long orderId;

    private String address;

    @PostPersist
    public void onPostPersist() {
        Accepted accepted = new Accepted(this);
        accepted.publishAfterCommit();

        CookStarted cookStarted = new CookStarted(this);
        cookStarted.publishAfterCommit();

        Rejected rejected = new Rejected(this);
        rejected.publishAfterCommit();

        CookFinished cookFinished = new CookFinished(this);
        cookFinished.publishAfterCommit();
    }

    public static CookingRepository repository() {
        CookingRepository cookingRepository = StoreOwnerApplication.applicationContext.getBean(
            CookingRepository.class
        );
        return cookingRepository;
    }

    public static void loadOrderInfo(OrderPlaced orderPlaced) {
        /** Example 1:  new item 
        Cooking cooking = new Cooking();
        repository().save(cooking);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(cooking->{
            
            cooking // do something
            repository().save(cooking);


         });
        */

    }
}
