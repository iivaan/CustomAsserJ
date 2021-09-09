package com.paxovision.assertions;

import org.assertj.core.api.AbstractStringAssert;

public class SkynetStringAssert<T> extends AbstractStringAssert<SkynetStringAssert<T>> {
    private final T parent;

    public SkynetStringAssert(T parent, String actual) {
        super(actual, SkynetStringAssert.class);
        this.parent = parent;
    }


    public T and(){
        return parent;
    }
}
