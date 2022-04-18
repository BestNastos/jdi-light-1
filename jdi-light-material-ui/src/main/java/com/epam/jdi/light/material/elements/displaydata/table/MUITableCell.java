package com.epam.jdi.light.material.elements.displaydata.table;

import com.epam.jdi.light.asserts.generic.HasAssert;
import com.epam.jdi.light.asserts.generic.UIAssert;
import com.epam.jdi.light.elements.base.UIBaseElement;

public abstract class MUITableCell<A extends UIAssert<?, ?>> extends UIBaseElement<A> implements HasAssert<A> {

    private final int rowIndex;
    private final int columnIndex;

    protected MUITableCell(int rowIndex, int columnIndex) {
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
    }

    @Override
    public boolean isExist() {
        if (rowIndex < 0 || columnIndex <= 0) {
            return false;
        } else {
            //super.isExist() works incorrect because of core().isExist()
            try {
                return base().getWebElement().isDisplayed();
            } catch (Exception e) {
                return false;
            }
        }
    }

    public int rowIndex() {
        return rowIndex;
    }

    public int columnIndex() {
        return columnIndex;
    }

}
