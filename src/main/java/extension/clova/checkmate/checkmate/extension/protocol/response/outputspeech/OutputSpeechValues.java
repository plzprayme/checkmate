package extension.clova.checkmate.checkmate.extension.protocol.response.outputspeech;

import extension.clova.checkmate.checkmate.extension.protocol.response.outputspeech.speech.Speech;
import extension.clova.checkmate.checkmate.extension.protocol.response.outputspeech.speech.SpeechType;

import java.util.List;

public record OutputSpeechValues(
        //    Brief brief // 없어도 됨
        SpeechType type, // SpeechList, SpeechSet, SimpleSpeech
        List<Speech> value
) implements OutputSpeech {

}
