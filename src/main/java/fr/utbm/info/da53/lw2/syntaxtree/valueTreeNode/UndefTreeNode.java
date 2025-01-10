package fr.utbm.info.da53.lw2.syntaxtree.valueTreeNode;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractValueTreeNode;
import fr.utbm.info.da53.lw2.type.Value;

public class UndefTreeNode extends AbstractValueTreeNode {

    public UndefTreeNode() {
    }

    /**
     * Evaluate and replies the value.
     *
     * @param executionContext is the current execution context.
     * @return the value, never <code>null</code>.
     * @throws InterpreterException when something bad occurs during the evaluation.
     */
    @Override
    public Value evaluate(ExecutionContext executionContext) throws InterpreterException {
        return Value.UNDEF;
    }

    @Override
    public String toString() {
        return Value.UNDEF.toString();
    }
}
