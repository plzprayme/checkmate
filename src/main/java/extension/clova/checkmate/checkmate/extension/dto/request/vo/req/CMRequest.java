package extension.clova.checkmate.checkmate.extension.dto.request.vo.req;

import extension.clova.checkmate.checkmate.extension.interaction.intent.Intent;
import extension.clova.checkmate.checkmate.extension.interaction.request.RequestType;

public record CMRequest(
        RequestType type,
        Intent intent
) {
}
