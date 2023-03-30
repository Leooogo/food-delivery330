package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class CookingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Cooking>> {

    @Override
    public EntityModel<Cooking> process(EntityModel<Cooking> model) {
        return model;
    }
}
