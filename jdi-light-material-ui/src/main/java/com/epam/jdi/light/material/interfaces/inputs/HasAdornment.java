package com.epam.jdi.light.material.interfaces.inputs;

import com.epam.jdi.light.elements.interfaces.base.ICoreElement;
import com.epam.jdi.light.material.elements.inputs.Adornment;

import java.util.List;
import java.util.stream.Collectors;

public interface HasAdornment extends ICoreElement {

    /**
     * Gets adornment of the element by searching by the class "MuiInputAdornment-root".
     *
     * @return adornment as {@link Adornment}
     * @see Adornment
     */
    default Adornment adornment() {
        return new Adornment().setCore(Adornment.class, find(".MuiInputAdornment-root"));
    }

    /**
     * Gets the list of adornments of the element by searching by the class "MuiInputAdornment-root".
     * If there are no adornments, an empty list is returned.
     *
     * @return list of adornments as {@link List}
     * @see Adornment
     */
    default List<Adornment> adornments() {
        return finds(".MuiInputAdornment-root").stream()
                .map(element -> element.setCore(Adornment.class, element))
                .collect(Collectors.toList());
    }
}
