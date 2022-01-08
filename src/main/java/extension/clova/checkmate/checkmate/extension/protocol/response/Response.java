package extension.clova.checkmate.checkmate.extension.protocol.response;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public record Response(
        CMResponse response,
        Map<String, String> sessionAttributes
) {
    private static final Map<String, String> EMPTY_MAP = Collections.EMPTY_MAP;

    private static final String version = "1.0.0";

    public Response(CMResponse cmResponse) {
        this(cmResponse, EMPTY_MAP);
    }
}
