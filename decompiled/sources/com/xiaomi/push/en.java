package com.xiaomi.push;

import java.net.UnknownHostException;

/* loaded from: classes4.dex */
final class en {

    static class a {

        /* renamed from: a, reason: collision with root package name */
        ej f14563a;

        /* renamed from: a, reason: collision with other field name */
        String f466a;

        a() {
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static void m12113a(Exception exc) {
        exc.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Throwable] */
    static a a(Exception exc) {
        m12113a(exc);
        boolean z = exc instanceof fj;
        Exception exc2 = exc;
        if (z) {
            fj fjVar = (fj) exc;
            exc2 = exc;
            if (fjVar.a() != null) {
                exc2 = fjVar.a();
            }
        }
        a aVar = new a();
        String message = exc2.getMessage();
        if (exc2.getCause() != null) {
            message = exc2.getCause().getMessage();
        }
        String str = exc2.getClass().getSimpleName() + ":" + message;
        int a2 = fd.a(exc2);
        if (a2 != 0) {
            aVar.f14563a = ej.a(ej.GSLB_REQUEST_SUCCESS.a() + a2);
        }
        if (aVar.f14563a == null) {
            aVar.f14563a = ej.GSLB_TCP_ERR_OTHER;
        }
        if (aVar.f14563a == ej.GSLB_TCP_ERR_OTHER) {
            aVar.f466a = str;
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Throwable] */
    static a b(Exception exc) {
        Throwable cause;
        m12113a(exc);
        boolean z = exc instanceof fj;
        Exception exc2 = exc;
        if (z) {
            fj fjVar = (fj) exc;
            exc2 = exc;
            if (fjVar.a() != null) {
                exc2 = fjVar.a();
            }
        }
        a aVar = new a();
        String message = exc2.getMessage();
        if (exc2.getCause() != null) {
            message = exc2.getCause().getMessage();
        }
        int a2 = fd.a(exc2);
        String str = exc2.getClass().getSimpleName() + ":" + message;
        if (a2 != 0) {
            aVar.f14563a = ej.a(ej.CONN_SUCCESS.a() + a2);
            if (aVar.f14563a == ej.CONN_BOSH_ERR && (cause = exc2.getCause()) != null && (cause instanceof UnknownHostException)) {
                aVar.f14563a = ej.CONN_BOSH_UNKNOWNHOST;
            }
        } else {
            aVar.f14563a = ej.CONN_XMPP_ERR;
        }
        if (aVar.f14563a != ej.CONN_TCP_ERR_OTHER && aVar.f14563a != ej.CONN_XMPP_ERR && aVar.f14563a != ej.CONN_BOSH_ERR) {
            return aVar;
        }
        aVar.f466a = str;
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Throwable] */
    static a c(Exception exc) {
        m12113a(exc);
        boolean z = exc instanceof fj;
        Exception exc2 = exc;
        if (z) {
            fj fjVar = (fj) exc;
            exc2 = exc;
            if (fjVar.a() != null) {
                exc2 = fjVar.a();
            }
        }
        a aVar = new a();
        String message = exc2.getMessage();
        if (exc2.getCause() != null) {
            message = exc2.getCause().getMessage();
        }
        int a2 = fd.a(exc2);
        String str = exc2.getClass().getSimpleName() + ":" + message;
        if (a2 == 105) {
            aVar.f14563a = ej.BIND_TCP_READ_TIMEOUT;
        } else if (a2 == 199) {
            aVar.f14563a = ej.BIND_TCP_ERR;
        } else if (a2 == 499) {
            aVar.f14563a = ej.BIND_BOSH_ERR;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                aVar.f14563a = ej.BIND_BOSH_ITEM_NOT_FOUND;
            }
        } else if (a2 == 109) {
            aVar.f14563a = ej.BIND_TCP_CONNRESET;
        } else if (a2 == 110) {
            aVar.f14563a = ej.BIND_TCP_BROKEN_PIPE;
        } else {
            aVar.f14563a = ej.BIND_XMPP_ERR;
        }
        if (aVar.f14563a != ej.BIND_TCP_ERR && aVar.f14563a != ej.BIND_XMPP_ERR && aVar.f14563a != ej.BIND_BOSH_ERR) {
            return aVar;
        }
        aVar.f466a = str;
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Throwable] */
    static a d(Exception exc) {
        m12113a(exc);
        boolean z = exc instanceof fj;
        Exception exc2 = exc;
        if (z) {
            fj fjVar = (fj) exc;
            exc2 = exc;
            if (fjVar.a() != null) {
                exc2 = fjVar.a();
            }
        }
        a aVar = new a();
        String message = exc2.getMessage();
        int a2 = fd.a(exc2);
        String str = exc2.getClass().getSimpleName() + ":" + message;
        if (a2 == 105) {
            aVar.f14563a = ej.CHANNEL_TCP_READTIMEOUT;
        } else if (a2 == 199) {
            aVar.f14563a = ej.CHANNEL_TCP_ERR;
        } else if (a2 == 499) {
            aVar.f14563a = ej.CHANNEL_BOSH_EXCEPTION;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                aVar.f14563a = ej.CHANNEL_BOSH_ITEMNOTFIND;
            }
        } else if (a2 == 109) {
            aVar.f14563a = ej.CHANNEL_TCP_CONNRESET;
        } else if (a2 == 110) {
            aVar.f14563a = ej.CHANNEL_TCP_BROKEN_PIPE;
        } else {
            aVar.f14563a = ej.CHANNEL_XMPPEXCEPTION;
        }
        if (aVar.f14563a != ej.CHANNEL_TCP_ERR && aVar.f14563a != ej.CHANNEL_XMPPEXCEPTION && aVar.f14563a != ej.CHANNEL_BOSH_EXCEPTION) {
            return aVar;
        }
        aVar.f466a = str;
        return aVar;
    }
}
