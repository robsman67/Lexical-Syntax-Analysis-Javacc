/**
 * @Author: Robert Hakobyan
 */

package fr.utbm.info.da53.lw2.syntaxtree.binaryOperatorTreeNode;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterErrorType;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractBinaryOperatorTreeNode;
import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractValueTreeNode;
import fr.utbm.info.da53.lw2.type.Value;
import fr.utbm.info.da53.lw2.type.VariableType;

public class BooleanAndTreeNode extends AbstractBinaryOperatorTreeNode {

    public BooleanAndTreeNode(AbstractValueTreeNode left, AbstractValueTreeNode right) {
        super(left, right);
    }

    /**
     * Compute the result.
     *
     * @param executionContext is the context of execution.
     * @param left             is the left operand, always set.
     * @param right            is the right operand, always set.
     * @return the value, never <code>null</code>.
     * @throws InterpreterException
     */
    @Override
    protected Value compute(ExecutionContext executionContext, Value left, Value right) throws InterpreterException {
        if(left.getType()!= VariableType.BOOLEAN || right.getType()!= VariableType.BOOLEAN){
            fail(executionContext, InterpreterErrorType.EXPECTING_BOOLEAN);
        }
        boolean one = left.getValue(Boolean.class);
        boolean two = right.getValue(Boolean.class);
        return new Value(one && two);
    }

    @Override
    public String getOperatorString() {
        return "&&";
    }
}
