/**
 * @Author: Robert Hakobyan
 */

package fr.utbm.info.da53.lw2.syntaxtree.comparaisonTreeNode;

import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractComparisonOperatorTreeNode;

public class LowerEqualTreeNode extends AbstractComparisonOperatorTreeNode {

    public LowerEqualTreeNode() {
    }

    /**
     * Compare.
     *
     * @param comparisonResult is the numerical representation of the comparison of the two operands.
     * @return the comparison result.
     */
    @Override
    protected boolean translate(int comparisonResult) {
        return comparisonResult <= 0;
    }

    @Override
    public String getOperatorString() {
        return "<=";
    }
}
