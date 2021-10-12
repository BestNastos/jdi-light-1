package com.epam.jdi.light.vuetify.asserts;

import com.epam.jdi.light.asserts.generic.UISelectAssert;
import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.vuetify.elements.complex.Pagination;
import org.hamcrest.Matchers;

import static com.epam.jdi.light.asserts.core.SoftAssert.jdiAssert;

public class PaginationAssert extends UISelectAssert<PaginationAssert, Pagination> {

    @JDIAction("Assert that '{name}' is disabled")
    public PaginationAssert started() {
        jdiAssert(element().isStart(), Matchers.is(true), "Selected page in list is not first");
        return this;
    }

    @JDIAction("Assert that '{name}' is disabled")
    public PaginationAssert ended() {
        jdiAssert(element().isEnd(), Matchers.is(true), "Selected page in list is not last");
        return this;
    }

    @JDIAction("Assert that '{name}' has {0} hidden buttons")
    public PaginationAssert hiddenButtons(int size) {
        jdiAssert(element().hiddenButtons(), Matchers.equalTo(size), "There are " + size + " hidden button on pagination element");
        return this;
    }

}