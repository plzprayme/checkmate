package extension.clova.checkmate.checkmate.extension.dto.request.vo.context;

import extension.clova.checkmate.checkmate.extension.dto.request.vo.user.CMUser;

public record CMSystem (
        Application application,
        CMUser user,
        CMDevice device
) {
    public record Application(String applicationId) { }
}
