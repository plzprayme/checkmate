package extension.clova.checkmate.checkmate.extension.dto.request.vo.session;

import com.fasterxml.jackson.annotation.JsonProperty;
import extension.clova.checkmate.checkmate.extension.dto.request.vo.user.CMUser;

import java.util.Map;

public record CMSession (
        @JsonProperty("new") Boolean isNew,
        String sessionId,
        Map<String, String> sessionAttributes,
        CMUser user
) {

}