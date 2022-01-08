package extension.clova.checkmate.checkmate.extension.protocol.response.outputspeech;

import extension.clova.checkmate.checkmate.extension.protocol.response.outputspeech.speech.Speech;
import extension.clova.checkmate.checkmate.extension.protocol.response.outputspeech.speech.SpeechType;

public record OutputSpeechValue(
        //    Brief brief // 없어도 됨
        SpeechType type, // SpeechList, SpeechSet, SimpleSpeech
        Speech value
) implements OutputSpeech {

    public static OutputSpeech newSimpleType(Speech value) {
        return new OutputSpeechValue(SpeechType.SimpleSpeech, value);
    }
}
