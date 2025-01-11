package fr.utbm.info.da53.lw2.syntaxtree.valueTreeNode;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractValueTreeNode;
import fr.utbm.info.da53.lw2.type.Value;

public class BooleanTreeNode extends AbstractValueTreeNode {


    private final Value booleanValue;


    public BooleanTreeNode(Boolean bool) {
        this.booleanValue = new Value(Boolean.valueOf(bool));
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
        return this.booleanValue;
    }

    @Override
    public String toString() {
        return this.booleanValue.toString();
    }
}
