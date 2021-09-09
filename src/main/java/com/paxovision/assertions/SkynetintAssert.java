package com.paxovision.assertions;

import org.assertj.core.api.AbstractIntegerAssert;

public class SkynetintAssert<T> extends AbstractIntegerAssert<SkynetintAssert<T>> {
    private final T parent;

    public SkynetintAssert(T parent, int actual) {
        super(actual, SkynetintAssert.class);
        this.parent = parent;
    }


    public T and(){
        return parent;
    }
}
