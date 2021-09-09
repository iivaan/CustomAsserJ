package com.paxovision.assertions;

import org.assertj.core.api.AbstractIntegerAssert;
import org.assertj.core.api.AbstractStringAssert;

public class SkynetIntegerAssert<T> extends AbstractIntegerAssert<SkynetIntegerAssert<T>> {
    private final T parent;

    public SkynetIntegerAssert(T parent, int actual) {
        super(actual, SkynetIntegerAssert.class);
        this.parent = parent;
    }


    public T and(){
        return parent;
    }
}
