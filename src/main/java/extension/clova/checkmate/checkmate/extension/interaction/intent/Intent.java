package extension.clova.checkmate.checkmate.extension.interaction.intent;

import extension.clova.checkmate.checkmate.extension.interaction.slot.Slot;
import extension.clova.checkmate.checkmate.extension.interaction.slot.SlotType;

import java.util.Map;

public record Intent (
        IntentType name,
        Map<SlotType, Slot> slots
) { }
