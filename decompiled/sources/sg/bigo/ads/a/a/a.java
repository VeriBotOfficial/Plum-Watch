package sg.bigo.ads.a.a;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import sg.bigo.ads.a.a.b;

/* loaded from: classes7.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public CustomTabsClient f18868a;
    public CustomTabsServiceConnection b;
    public InterfaceC1014a c;
    public CustomTabsCallback d;
    private CustomTabsSession e;

    /* renamed from: sg.bigo.ads.a.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC1014a {
        void c();

        void d();
    }

    public interface b {
        void a(Context context, b.a aVar);

        void a(b.a aVar);
    }

    public final CustomTabsSession a() {
        CustomTabsSession newSession;
        CustomTabsClient customTabsClient = this.f18868a;
        if (customTabsClient != null) {
            newSession = this.e == null ? customTabsClient.newSession(new CustomTabsCallback() { // from class: sg.bigo.ads.a.a.a.1
                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void extraCallback(String str, Bundle bundle) {
                    super.extraCallback(str, bundle);
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onMessageChannelReady(Bundle bundle) {
                    super.onMessageChannelReady(bundle);
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onNavigationEvent(int i, Bundle bundle) {
                    super.onNavigationEvent(i, bundle);
                    if (a.this.d != null) {
                        a.this.d.onNavigationEvent(i, bundle);
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onPostMessage(String str, Bundle bundle) {
                    super.onPostMessage(str, bundle);
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
                    super.onRelationshipValidationResult(i, uri, z, bundle);
                }
            }) : null;
            return this.e;
        }
        this.e = newSession;
        return this.e;
    }

    @Override // sg.bigo.ads.a.a.d
    public final void a(CustomTabsClient customTabsClient) {
        this.f18868a = customTabsClient;
        customTabsClient.warmup(0L);
        InterfaceC1014a interfaceC1014a = this.c;
        if (interfaceC1014a != null) {
            interfaceC1014a.c();
        }
    }

    @Override // sg.bigo.ads.a.a.d
    public final void b() {
        this.f18868a = null;
        this.e = null;
        InterfaceC1014a interfaceC1014a = this.c;
        if (interfaceC1014a != null) {
            interfaceC1014a.d();
        }
    }
}
