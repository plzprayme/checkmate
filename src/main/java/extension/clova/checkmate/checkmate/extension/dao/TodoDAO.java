package extension.clova.checkmate.checkmate.extension.dao;

import extension.clova.checkmate.checkmate.extension.dao.exception.DuplicateAddRequestException;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TodoDAO {
    // 하루마다 갱신
    // Map의 최 상위 Key를 날짜로 변경하자
    private static final Map<String, Boolean> source = new HashMap<>();

    public Boolean isDone(String key) {
        return source.get(key);
    }

    public void add(String key) {
        if (source.containsKey(key)) {
            throw new DuplicateAddRequestException();
        }
        source.put(key, false);
    }
}
