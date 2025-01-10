package fr.utbm.info.da53.lw2.syntaxtree.valueTreeNode;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractValueTreeNode;
import fr.utbm.info.da53.lw2.type.Value;

public class NumberTreeNode extends AbstractValueTreeNode {

    //private final Value number;

    //TODO constructor

    /**
     * Evaluate and replies the value.
     *
     * @param executionContext is the current execution context.
     * @return the value, never <code>null</code>.
     * @throws InterpreterException when something bad occurs during the evaluation.
     */
    @Override
    public Value evaluate(ExecutionContext executionContext) throws InterpreterException {
        return null;
    }

//    @Override
//    public String toString() {
//        return this.number.toString();
//    }

}
