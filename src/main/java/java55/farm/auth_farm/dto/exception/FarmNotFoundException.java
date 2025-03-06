package java55.farm.auth_farm.dto.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)

public class FarmNotFoundException extends RuntimeException {
}
