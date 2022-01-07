package extension.clova.checkmate.checkmate.extension.interaction;

import java.util.Map;

public record Intent (
        IntentType name,
        Map<String, Slot> slots
) { }
