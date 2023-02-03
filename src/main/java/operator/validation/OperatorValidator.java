package operator.validation;

import operator.entity.Operator;

public class OperatorValidator {

    private final Validator validator = new Validator();

    public void hasOperatorValidate(Operator operator) {
        validator.validateNotNull(operator.getId(), "id is existing!");
        validator.validateNotNull(operator.getUsername(), "username is existing!");
    }

    public void hasNotOperatorValidate(Operator operator) {
        validator.validateNull(operator.getId(), "id is not found!");
        validator.validateNull(operator.getUsername(), "username not found!");
    }
}
