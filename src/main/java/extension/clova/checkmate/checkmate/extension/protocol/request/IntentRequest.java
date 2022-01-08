package extension.clova.checkmate.checkmate.extension.protocol.request;


import extension.clova.checkmate.checkmate.extension.protocol.request.vo.context.CMContext;
import extension.clova.checkmate.checkmate.extension.protocol.request.vo.req.CMRequest;
import extension.clova.checkmate.checkmate.extension.protocol.request.vo.session.CMSession;

public record IntentRequest(
        CMSession session,
        CMContext context,
        CMRequest request
) {
    private static final String version = "0.1.0";
}