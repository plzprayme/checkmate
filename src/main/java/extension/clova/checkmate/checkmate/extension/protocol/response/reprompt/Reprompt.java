package extension.clova.checkmate.checkmate.extension.protocol.response.reprompt;

import extension.clova.checkmate.checkmate.extension.protocol.response.outputspeech.OutputSpeechValues;

// response.shouldEndSession이 false일 때만 유효하다.
// OutputSpeech 내부에는 주로 SimpleSpeech를 보낼 것을 권장한다.
// reprompt를 사용하면 입력 대기 시간을 1회 연장할 수 있다.
public record Reprompt(
    OutputSpeechValues outputSpeech
) {
}
