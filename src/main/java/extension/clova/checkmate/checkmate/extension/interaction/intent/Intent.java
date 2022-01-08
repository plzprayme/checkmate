package extension.clova.checkmate.checkmate.extension.interaction.intent;

import com.fasterxml.jackson.annotation.JsonProperty;
import extension.clova.checkmate.checkmate.extension.interaction.slot.Slot;
import extension.clova.checkmate.checkmate.extension.interaction.slot.SlotType;

import java.util.Map;

public record Intent (
        @JsonProperty("name") IntentType type,
        Map<SlotType, Slot> slots
) { }
