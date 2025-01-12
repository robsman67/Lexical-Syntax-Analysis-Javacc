/**
 * @Author: Robert Hakobyan
 */

package fr.utbm.info.da53.lw2.syntaxtree.binaryOperatorTreeNode;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterErrorType;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractUnaryOperatorTreeNode;
import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractValueTreeNode;
import fr.utbm.info.da53.lw2.type.Value;
import fr.utbm.info.da53.lw2.type.VariableType;

public class BooleanNotTreeNode extends AbstractUnaryOperatorTreeNode {

    public BooleanNotTreeNode(AbstractValueTreeNode operand) {
        super(operand);
    }

    /**
     * Compute the result.
     *
     * @param executionContext is the context of execution.
     * @param operandValue     is the value of the operand, always set.
     * @return the value, never <code>null</code>.
     * @throws InterpreterException
     */
    @Override
    protected Value compute(ExecutionContext executionContext, Value operandValue) throws InterpreterException {
        if(operandValue.getType()!= VariableType.BOOLEAN ){
            fail(executionContext, InterpreterErrorType.EXPECTING_BOOLEAN);
        }
        boolean one = operandValue.getValue(Boolean.class);
        return new Value(!one);
    }

    @Override
    public String getOperatorString() {
        return "!";
    }

}
