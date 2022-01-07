package extension.clova.checkmate.checkmate.extension.dto.response.card;

// Content Template 형태의 데이터이다. 클라이언트 화면에 표시할 콘텐츠를 이 필드를 통해 전달할 수 있다.
// Card에 데이터가 있으면 CIC는 클라이언트에 Clova.RenderTemplate 지시 메시지를 전달,
// Card가 빈 객체면 Clova.RenderText 지시 메시지 전달하여 response.outputSpeech.values 필드의 값을 표시하게 한다.

//public class Card {
//
//}
public record Card(
    // 여기에 뭔가 있으면 Clova 앱에서 사용할 때 UI를 띄울 수 있을듯.
) {
    private static final Card instance = new Card();

    public static Card get() {
        return instance;
    }
}
