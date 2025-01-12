/**
 * @Author: Robert Hakobyan
 */

package fr.utbm.info.da53.lw2.syntaxtree.statementTreeNode;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractStatementTreeNode;
import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractValueTreeNode;

public class LetTreeNode extends AbstractStatementTreeNode {

   private final String variableName;


    public LetTreeNode (String variableName, AbstractValueTreeNode value) {
        this.variableName = variableName;
        setChildren(value);
    }

    /**
     * Run the statement.
     *
     * @param context is the current execution context.
     * @return the context to use after the execution of the function.
     * @throws InterpreterException when something bar occur during the execution of the statement.
     */
    @Override
    public ExecutionContext run(ExecutionContext context) throws InterpreterException {
        if (variableName != null) {}
        return null;
    }

    @Override
    public String toString() {
        return "LET " + getChildAt(0) + " = " + getChildAt(1);
    }
}
