package extension.clova.checkmate.checkmate.extension.controller;

import extension.clova.checkmate.checkmate.extension.protocol.request.IntentRequest;
import extension.clova.checkmate.checkmate.extension.protocol.response.Response;
import extension.clova.checkmate.checkmate.extension.interaction.intent.IntentType;
import extension.clova.checkmate.checkmate.extension.service.add.AddService;
import org.springframework.stereotype.Component;

@Component
public record IntentController(AddService addService) {

    public Response control(IntentRequest req) {
        IntentType type = req.request().intent().type();
        return switch (type) {
            case AddIntent -> addService.add(req);
            case RemoveIntent -> addService.remove();
            case CheckIntent -> addService.check();
        };
    }
}
