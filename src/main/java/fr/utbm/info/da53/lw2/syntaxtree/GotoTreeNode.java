package fr.utbm.info.da53.lw2.syntaxtree;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterException;

public class GotoTreeNode extends AbstractStatementTreeNode{

    public GotoTreeNode(AbstractValueTreeNode line){
        setChildren(line);
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
        return "GOTO " + getChildAt(0).toString();
    }
}
