package extension.clova.checkmate.checkmate.extension.protocol.request.vo.context;

import extension.clova.checkmate.checkmate.extension.protocol.request.vo.user.CMUser;

public record CMSystem (
        Application application,
        CMUser user,
        CMDevice device
) {
    public record Application(String applicationId) { }
}
