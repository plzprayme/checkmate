package extension.clova.checkmate.checkmate.extension.controller;

import extension.clova.checkmate.checkmate.extension.protocol.request.IntentRequest;
import extension.clova.checkmate.checkmate.extension.protocol.response.CMResponse;
import extension.clova.checkmate.checkmate.extension.protocol.response.Response;
import extension.clova.checkmate.checkmate.extension.protocol.response.card.Card;
import extension.clova.checkmate.checkmate.extension.protocol.response.outputspeech.OutputSpeechValues;
import extension.clova.checkmate.checkmate.extension.protocol.response.outputspeech.speech.SpeechType;
import extension.clova.checkmate.checkmate.extension.protocol.response.reprompt.Reprompt;
import extension.clova.checkmate.checkmate.extension.interaction.request.RequestType;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;


@RequiredArgsConstructor
@RestController
public class RequestController {
    // OutputSpeech:
    // 이미 존재하는 할 일이에요! 오늘 아직 안하셨네요 or 오늘은 완료 했어요!
    // 추가 했어요.

    // Reprompt:
    // 또 추가할까요?

    private final IntentController intentController;

    Logger logger = LoggerFactory.getLogger(RequestController.class);

    @PostMapping(path = "/")
    public ResponseEntity<?> control(@RequestBody IntentRequest req) {

        RequestType intentType = req.request().type();
        Response res = switch (intentType) {
            case IntentRequest -> intentController.control(req);

            case LaunchRequest -> assemble();

            case EventRequest -> assemble();

            case SessionEndedRequest -> assemble();
        };
        return ResponseEntity.ok(res);
    }

    public static Response assemble() {
        CMResponse response = getCMResponse();
        return new Response(response, new HashMap<>());
    }

    private static CMResponse getCMResponse() {
        OutputSpeechValues outputSpeech = new OutputSpeechValues(SpeechType.SimpleSpeech, List.of());
        return new CMResponse(Card.get(), List.of(), outputSpeech, new Reprompt(null), false);
    }
}
