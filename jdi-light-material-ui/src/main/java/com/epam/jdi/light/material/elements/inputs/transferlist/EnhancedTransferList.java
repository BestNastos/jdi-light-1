package com.epam.jdi.light.material.elements.inputs.transferlist;

import com.epam.jdi.light.common.JDIAction;

/**
 * To see an example of Simple Transfer List web element please visit
 * https://mui.com/components/transfer-list/#enhanced-transfer-list
 */

public class EnhancedTransferList extends TransferList {

  // TODO: The difference with SimpleTransferList is CardHeader existance, checkboxes are not required at all
  // Should be swapped to one class with Header Customization only

  @JDIAction("Moves all {name}'s elements left")
  @Override
  public void moveAllElementsLeft() {
    this.find(allItemsRightCheckbox).click();
    this.find(moveLeftButton).click();
  }

  @JDIAction("Moves all {name}'s elements right")
  @Override
  public void moveAllElementsRight() {
    this.find(allItemsLeftCheckbox).click();
    this.find(moveRightButton).click();
  }

}