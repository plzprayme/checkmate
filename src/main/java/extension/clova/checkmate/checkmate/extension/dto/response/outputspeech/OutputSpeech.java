package extension.clova.checkmate.checkmate.extension.dto.response.outputspeech;

import extension.clova.checkmate.checkmate.extension.dto.response.outputspeech.speech.Speech;
import extension.clova.checkmate.checkmate.extension.dto.response.outputspeech.speech.SpeechType;

import java.util.List;

public record OutputSpeech(
        //    Brief brief // 없어도 됨
        SpeechType type, // SpeechList, SpeechSet, SimpleSpeech
        List<Speech> value
) {
}
