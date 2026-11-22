package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes15.dex */
interface MessageInfoFactory {
    boolean isSupported(Class<?> clazz);

    MessageInfo messageInfoFor(Class<?> clazz);
}
