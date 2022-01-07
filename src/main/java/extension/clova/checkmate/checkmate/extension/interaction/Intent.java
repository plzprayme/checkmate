package extension.clova.checkmate.checkmate.extension.interaction;

import java.util.Map;

public class Intent {

    IntentType name;
    Map<String, Slot> slots;

    private static class Slot {
        IntentType name;
        String value;
    }
}
