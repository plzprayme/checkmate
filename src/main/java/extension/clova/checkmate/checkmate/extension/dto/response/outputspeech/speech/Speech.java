package extension.clova.checkmate.checkmate.extension.dto.response.outputspeech.speech;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Speech {
    private String lang;
    private String type;
    private String value;
}
