package operator.implementation;

import operator.entity.Operator;
import operator.validation.OperatorValidator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OperatorServiceImpl {

    private final OperatorValidator operatorValidator = new OperatorValidator();
    private final List<Operator> operatorList = new ArrayList<>();

    public void addOperator(Operator operator) {
        operatorValidator.hasOperatorValidate(operator);
        operatorList.add(operator);
    }

    public void deleteOperator(Operator operator) {
        operatorValidator.hasNotOperatorValidate(operator);
        operatorList.remove(operator);
    }

    public List<Operator> getOperator(Operator operator) {
        return Collections.singletonList(operatorList.get(operator.getId()));
    }

    public List<Operator> getAllOperator() {
        return operatorList;
    }
}
