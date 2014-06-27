package org.msgpack.core.value;

/**
* Created on 5/30/14.
*/
public interface BooleanValue extends Value {
    public boolean toBoolean();
    public BooleanValue toValue();
}
