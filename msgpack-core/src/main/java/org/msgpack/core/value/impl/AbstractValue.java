package org.msgpack.core.value.impl;

import org.msgpack.core.value.Value;
import org.msgpack.core.value.ValueType;

/**
* Base implementation of MessagePackValue
*/
public abstract class AbstractValue extends AbstractValueRef implements Value {

    @Override
    public boolean isRef() { return false; }

}
