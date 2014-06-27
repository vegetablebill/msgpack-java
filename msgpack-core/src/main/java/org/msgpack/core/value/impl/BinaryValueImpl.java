package org.msgpack.core.value.impl;

import org.msgpack.core.value.Value;
import org.msgpack.core.value.ValueType;
import org.msgpack.core.value.BinaryValue;
import org.msgpack.core.value.ValueVisitor;

import java.nio.ByteBuffer;

/**
* Created on 5/30/14.
*/
public class BinaryValueImpl extends RawValueImpl implements BinaryValue {
    public BinaryValueImpl(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    @Override
    public ValueType getValueType() {
        return ValueType.BINARY;
    }
    @Override
    public void accept(ValueVisitor visitor) {
        visitor.visitBinary(this);
    }

    @Override
    public BinaryValue toValue() {
        return this;
    }



}
