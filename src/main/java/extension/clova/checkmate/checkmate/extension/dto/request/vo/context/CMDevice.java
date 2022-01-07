package extension.clova.checkmate.checkmate.extension.dto.request.vo.context;

import extension.clova.checkmate.checkmate.extension.dto.request.vo.context.display.Display;

public record CMDevice (
        String deviceId,
        Display display
) {
}
