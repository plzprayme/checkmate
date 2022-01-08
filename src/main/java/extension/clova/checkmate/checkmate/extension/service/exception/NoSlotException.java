package extension.clova.checkmate.checkmate.extension.service.exception;

public class NoSlotException extends IllegalArgumentException {
    private static final String m = "SLOT이 없습니다!";

    public NoSlotException() {
        super(m);
    }
}
