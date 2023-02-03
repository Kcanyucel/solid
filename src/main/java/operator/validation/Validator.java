package operator.validation;

import java.util.Objects;

public class Validator {

    public void validateNotNull(Object value, String errorMessage) {
        if (Objects.isNull(value)) {
            throw new NullPointerException(errorMessage);
        }

    }

    public void validateNull(Object value,String errorMessage) {
        if (!Objects.isNull(value)) {
            throw new RuntimeException(errorMessage);
        }
    }


}
