package extension.clova.checkmate.checkmate.extension.protocol.response;

import extension.clova.checkmate.checkmate.extension.protocol.response.card.Card;
import extension.clova.checkmate.checkmate.extension.protocol.response.directive.CMDirective;
import extension.clova.checkmate.checkmate.extension.protocol.response.outputspeech.OutputSpeech;
import extension.clova.checkmate.checkmate.extension.protocol.response.reprompt.Reprompt;

import java.util.List;

public record CMResponse(
        Card card,
        List<CMDirective> directives,
        OutputSpeech outputSpeech,
        Reprompt reprompt,
        Boolean shouldEndSession
) {

    private static final List<CMDirective> EMPTY_LIST = List.of();
    private static final Card EMPTY_CARD = new Card();

    public CMResponse(OutputSpeech outputSpeech, Reprompt reprompt) {
        this(EMPTY_CARD, EMPTY_LIST, outputSpeech, reprompt, false);
    }

    public CMResponse(OutputSpeech outputSpeech) {
        this(outputSpeech, null);
    }
}
