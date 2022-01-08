package extension.clova.checkmate.checkmate.extension.protocol.request.vo.context;

import extension.clova.checkmate.checkmate.extension.protocol.request.vo.context.display.Display;

public record CMDevice (
        String deviceId,
        Display display
) {
}
