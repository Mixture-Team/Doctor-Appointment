package mixture.hutech.backend.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public class ApiException {
    private final String message;
    private final HttpStatus httpStatus;
}
