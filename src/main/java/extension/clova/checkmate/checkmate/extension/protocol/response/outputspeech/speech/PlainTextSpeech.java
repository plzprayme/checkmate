package extension.clova.checkmate.checkmate.extension.protocol.response.outputspeech.speech;

import lombok.Getter;

public record PlainTextSpeech(
        String lang,
        String type,
        String value
) implements Speech {

    public PlainTextSpeech(String value) {
        this("ko", "PlainText", value);
    }
}