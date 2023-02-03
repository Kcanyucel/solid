package operator;

import operator.entity.Operator;
import operator.entity.Role;
import operator.implementation.OperatorServiceImpl;

public class OperatorApplication {

    public static final OperatorServiceImpl operatorService = new OperatorServiceImpl();

    public static void main(String[] args) {

        operatorService.addOperator(new Operator(0, "Kerim", "123", Role.SUPER_ADMIN));
        operatorService.addOperator(new Operator(1, "Berkay", "456", Role.ADMIN));
        operatorService.deleteOperator(new Operator(3, "Berkay", "456", Role.ADMIN));

        for (Operator operator : operatorService.getAllOperator()) {
            System.out.println(operator.toString());
        }

    }

}
