package extension.clova.checkmate.checkmate.extension.protocol.response.directive;

// Extension이 CEK로 전달하는 메시지이다.
// Directive의 필드들은 주로 오디오 컨텐츠 제공을 위해 사용된다.
// AudioPlayer.Play, AudioPlayer.StreamDeliver
// PlaybackController.Pause, PlaybackController.Resume
// PlaybackController.Stop, TemplateRuntime.RenderPlayerInfo
// 가능하다.

// 예제 7 참고
public record CMDirective(
    // checkmate에서는 안써도 될듯
) {
}
