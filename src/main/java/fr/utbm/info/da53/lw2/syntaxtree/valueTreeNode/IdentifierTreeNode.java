/**
 * @Author: Robert Hakobyan
 */

package fr.utbm.info.da53.lw2.syntaxtree.valueTreeNode;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterErrorType;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractValueTreeNode;
import fr.utbm.info.da53.lw2.type.Value;

public class IdentifierTreeNode extends AbstractValueTreeNode {

    private final String identifier;

    public IdentifierTreeNode(String identifier) {
        this.identifier = identifier;
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
        Value value = executionContext.getSymbolTableEntry(this.identifier).getValue();
        if (value == null) {
            fail(executionContext, InterpreterErrorType.UNSET_VALUE, "Undefined identifier: " + this.identifier);
        }
        return value;
    }

    @Override
    public String toString() {
        return this.identifier;
    }
}

