package extension.clova.checkmate.checkmate.extension.dto.request.vo.context;

import extension.clova.checkmate.checkmate.extension.dto.request.vo.user.CMUser;

public class CMSystem {
    Application application;
    CMUser user;
    CMDevice device;

    private static class Application {
        String applicationId;
    }
}
