package extension.clova.checkmate.checkmate.extension;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class IntentController {

    Logger logger = LoggerFactory.getLogger(IntentController.class);

    @PostMapping
    public ResponseEntity<?> control(@RequestBody Map<String, Object> req) {
        logger.info("I'm On", req.toString());
        return ResponseEntity.ok(req);
    }

}
