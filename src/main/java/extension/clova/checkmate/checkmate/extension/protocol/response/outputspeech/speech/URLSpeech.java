package extension.clova.checkmate.checkmate.extension.protocol.response.outputspeech.speech;

public record URLSpeech(
        String lang,
        String type,
        String value
) implements Speech {
}
