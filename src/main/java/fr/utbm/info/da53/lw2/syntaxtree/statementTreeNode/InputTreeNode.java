/**
 * @Author: Robert Hakobyan
 */

package fr.utbm.info.da53.lw2.syntaxtree.statementTreeNode;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractStatementTreeNode;
import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractValueTreeNode;

public class InputTreeNode extends AbstractStatementTreeNode {

    public InputTreeNode(AbstractValueTreeNode variable) {
        setChildren(variable);
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
        return null;
    }


    @Override
    public String toString() {
        return "input " + getChildAt(0);
    }

}
