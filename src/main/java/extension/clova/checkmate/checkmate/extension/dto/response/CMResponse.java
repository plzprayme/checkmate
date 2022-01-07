package extension.clova.checkmate.checkmate.extension.dto.response;

import extension.clova.checkmate.checkmate.extension.dto.response.card.Card;
import extension.clova.checkmate.checkmate.extension.dto.response.directive.CMDirective;
import extension.clova.checkmate.checkmate.extension.dto.response.outputspeech.OutputSpeech;
import extension.clova.checkmate.checkmate.extension.dto.response.reprompt.Reprompt;

import java.util.List;

public record CMResponse(
        Card card,
        List<CMDirective> directives,
        OutputSpeech outputSpeech,
        Reprompt reprompt,
        Boolean shouldEndSession
) {
}
