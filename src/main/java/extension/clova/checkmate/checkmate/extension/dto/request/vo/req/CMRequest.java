package extension.clova.checkmate.checkmate.extension.dto.request.vo.req;

import extension.clova.checkmate.checkmate.extension.interaction.Intent;

public record CMRequest(
        String type,
        Intent intent
) {
}
