package expressionsolver.functions;

import jadd.ADD;

import java.util.Stack;

import org.nfunk.jep.ParseException;
import org.nfunk.jep.function.PostfixMathCommand;

public class LogicalNot extends PostfixMathCommand {

    public LogicalNot() {
        numberOfParameters = 1;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public void run(Stack inStack) throws ParseException {
        checkStack(inStack);// check the stack

        Object param1 = inStack.pop();

        if (param1 instanceof ADD) {
            inStack.push(((ADD) param1).complement()); // push the param1 complement on the inStack
            return;
        }
        throw new ParseException("Invalid parameter type");
    }
}
