package extension.clova.checkmate.checkmate.extension.dao.exception;

public class DuplicateAddRequestException extends IllegalArgumentException {
    private static final String m = "[할일 추가 실패] 이미 존재하는 할일입니다.";

    public DuplicateAddRequestException() {
        super(m);
    }
}
