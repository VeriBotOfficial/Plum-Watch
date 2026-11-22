package com.anythink.core.common.n.b;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public interface q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f4196a = new q() { // from class: com.anythink.core.common.n.b.q$$ExternalSyntheticLambda0
        @Override // com.anythink.core.common.n.b.q
        public final List lookup(String str) {
            List a2;
            a2 = q.a(str);
            return a2;
        }
    };

    List<InetAddress> lookup(String str);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ List a(String str) {
        if (str == null) {
            throw new UnknownHostException("hostname == null");
        }
        try {
            return Arrays.asList(InetAddress.getAllByName(str));
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(String.valueOf(str)));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }
}
