package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes17.dex */
final class Subscription {

    /* renamed from: a, reason: collision with root package name */
    final Object f11452a;
    final SubscriberMethod b;

    Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f11452a = obj;
        this.b = subscriberMethod;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Subscription) {
            Subscription subscription = (Subscription) obj;
            if (this.f11452a == subscription.f11452a && this.b.equals(subscription.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f11452a.hashCode() + this.b.d.hashCode();
    }
}
