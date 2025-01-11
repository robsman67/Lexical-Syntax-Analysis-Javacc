package fr.utbm.info.da53.lw2.syntaxtree.binaryOperatorTreeNode;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractBinaryOperatorTreeNode;
import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractValueTreeNode;
import fr.utbm.info.da53.lw2.type.Value;

public class BooleanXorTreeNode extends AbstractBinaryOperatorTreeNode {

    public BooleanXorTreeNode(AbstractValueTreeNode left, AbstractValueTreeNode right) {
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
        return null;
    }

    @Override
    public String getOperatorString() {
        return "xor";
    }
}
