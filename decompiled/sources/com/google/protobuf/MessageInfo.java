package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes15.dex */
interface MessageInfo {
    MessageLite getDefaultInstance();

    ProtoSyntax getSyntax();

    boolean isMessageSetWireFormat();
}
