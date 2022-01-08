package extension.clova.checkmate.checkmate.extension.service.add;

import extension.clova.checkmate.checkmate.extension.dao.TodoDAO;
import extension.clova.checkmate.checkmate.extension.interaction.slot.Slot;
import extension.clova.checkmate.checkmate.extension.interaction.slot.SlotType;
import extension.clova.checkmate.checkmate.extension.protocol.request.IntentRequest;
import extension.clova.checkmate.checkmate.extension.protocol.response.CMResponse;
import extension.clova.checkmate.checkmate.extension.protocol.response.Response;
import extension.clova.checkmate.checkmate.extension.protocol.response.outputspeech.OutputSpeech;
import extension.clova.checkmate.checkmate.extension.protocol.response.outputspeech.OutputSpeechValue;
import extension.clova.checkmate.checkmate.extension.protocol.response.outputspeech.speech.PlainTextSpeech;
import extension.clova.checkmate.checkmate.extension.protocol.response.outputspeech.speech.Speech;
import extension.clova.checkmate.checkmate.extension.service.exception.NoSlotException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class AddService {

    private final TodoDAO dao;

    public Response add(IntentRequest req) {
        Map<SlotType, Slot> slots = req.request().intent().slots();

        // TODO가 하나만 있어야 한다.
        // ACTION도 하나만 있어야 한다.

        // TODO와 ACTION이 둘 다 없을 떄

        // TODO가 없을 때
        if (slots.isEmpty()) {
            throw new NoSlotException();
        }

        // ACTION만 있을 때

        // TODO만 있을 때
        if (containsOnlyTODOSlot(slots)) {

            String todo = slots.values().stream()
                    .map(Slot::value)
                    .collect(Collectors.joining());

            dao.add(todo);
            PlainTextSpeech text = new PlainTextSpeech(String.format("%s를 추가했어요", todo)); // 을/를 정하기
            OutputSpeech outputSpeech = OutputSpeechValue.newSimpleType(text);
            CMResponse innerResponse = new CMResponse(outputSpeech);
            return new Response(innerResponse);
        }

        // TODO와 ACTION 둘 다 있을 떄

        return new Response(null);
    }

    private boolean containsOnlyTODOSlot(Map<SlotType, Slot> slots) {
        return slots.containsKey(SlotType.TODO) && !slots.containsKey(SlotType.ACTION);
    }

    public Response remove() {
        return new Response(null, null);
    }

    public Response check() {
        return new Response(null, null);
    }

}
