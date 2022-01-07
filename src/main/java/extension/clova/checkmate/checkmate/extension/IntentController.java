package extension.clova.checkmate.checkmate.extension;

import extension.clova.checkmate.checkmate.extension.dto.request.IntentRequest;
import extension.clova.checkmate.checkmate.extension.dto.response.CMResponse;
import extension.clova.checkmate.checkmate.extension.dto.response.Response;
import extension.clova.checkmate.checkmate.extension.dto.response.card.Card;
import extension.clova.checkmate.checkmate.extension.dto.response.outputspeech.OutputSpeech;
import extension.clova.checkmate.checkmate.extension.dto.response.outputspeech.speech.SpeechType;
import extension.clova.checkmate.checkmate.extension.dto.response.reprompt.Reprompt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;


@RestController
public class IntentController {

    Logger logger = LoggerFactory.getLogger(IntentController.class);

    @PostMapping(path = "/")
    public ResponseEntity<?> control(@RequestBody IntentRequest req) {
        logger.info(String.format("%s", req.toString()));
        Response res = assemble();
        return ResponseEntity.ok(res);
    }

    private Response assemble() {
        CMResponse response = getCMResponse();
        return new Response(response, new HashMap<>());
    }

    private CMResponse getCMResponse() {
        OutputSpeech outputSpeech = new OutputSpeech(SpeechType.SimpleSpeech, List.of());
        return new CMResponse(Card.get(), List.of(), outputSpeech, new Reprompt(outputSpeech), false);
    }

}
