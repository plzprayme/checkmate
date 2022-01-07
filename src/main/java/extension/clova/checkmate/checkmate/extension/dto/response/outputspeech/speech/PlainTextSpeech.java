package extension.clova.checkmate.checkmate.extension.dto.response.outputspeech.speech;

import lombok.Getter;

@Getter
public class PlainTextSpeech extends Speech {
    // token이 있을 수도 있고 없을 수도 있다. checkmate의 경우 필요 없을 것 같다.
    public PlainTextSpeech(String lang, String type, String value) {
        super(lang, type, value);
    }
}
