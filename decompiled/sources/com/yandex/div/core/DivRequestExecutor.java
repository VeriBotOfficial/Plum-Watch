package com.yandex.div.core;

import android.net.Uri;
import com.yandex.div.core.images.LoadReference;
import io.nats.client.support.ApiConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DivRequestExecutor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \t2\u00020\u0001:\u0004\b\t\n\u000bJ\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/DivRequestExecutor;", "", "execute", "Lcom/yandex/div/core/images/LoadReference;", "request", "Lcom/yandex/div/core/DivRequestExecutor$Request;", "callback", "Lcom/yandex/div/core/DivRequestExecutor$Callback;", "Callback", "Companion", "Header", "Request", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DivRequestExecutor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final DivRequestExecutor STUB = new DivRequestExecutor$Companion$STUB$1();

    /* compiled from: DivRequestExecutor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/DivRequestExecutor$Callback;", "", "onFail", "", "onSuccess", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Callback {
        void onFail();

        void onSuccess();
    }

    LoadReference execute(Request request, Callback callback);

    /* compiled from: DivRequestExecutor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/DivRequestExecutor$Header;", "", "name", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getValue", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Header {
        private final String name;
        private final String value;

        public Header(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.name = name;
            this.value = value;
        }

        public final String getName() {
            return this.name;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: DivRequestExecutor.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/core/DivRequestExecutor$Request;", "", "url", "Landroid/net/Uri;", "method", "", ApiConstants.HEADERS, "", "Lcom/yandex/div/core/DivRequestExecutor$Header;", "body", "(Landroid/net/Uri;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/List;", "getMethod", "getUrl", "()Landroid/net/Uri;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Request {
        private final String body;
        private final List<Header> headers;
        private final String method;
        private final Uri url;

        public Request(Uri url, String method, List<Header> list, String body) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(body, "body");
            this.url = url;
            this.method = method;
            this.headers = list;
            this.body = body;
        }

        public final Uri getUrl() {
            return this.url;
        }

        public final String getMethod() {
            return this.method;
        }

        public final List<Header> getHeaders() {
            return this.headers;
        }

        public final String getBody() {
            return this.body;
        }
    }

    /* compiled from: DivRequestExecutor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/DivRequestExecutor$Companion;", "", "()V", "STUB", "Lcom/yandex/div/core/DivRequestExecutor;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
