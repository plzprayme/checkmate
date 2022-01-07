package extension.clova.checkmate.checkmate.extension.dto.response;

import java.util.Map;

public record Response(
        CMResponse response,
        Map<String, String> sessionAttributes
) {
    private static final String version = "1.0.0";
}
