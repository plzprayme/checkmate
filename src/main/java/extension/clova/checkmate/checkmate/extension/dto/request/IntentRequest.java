package extension.clova.checkmate.checkmate.extension.dto.request;


import extension.clova.checkmate.checkmate.extension.dto.request.vo.session.CMSession;
import extension.clova.checkmate.checkmate.extension.dto.request.vo.context.CMContext;

public class IntentRequest {

    String version = "0.1.0";
    CMSession session;
    CMContext context;
    Request request;

    private static class Request {
        String type;
    }
}
