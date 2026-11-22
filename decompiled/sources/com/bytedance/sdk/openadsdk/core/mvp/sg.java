package com.bytedance.sdk.openadsdk.core.mvp;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* loaded from: classes14.dex */
public class sg {
    private final AdEvents bh;
    protected String gff;
    protected VastProperties hm;
    private final AdSession rb;

    /* renamed from: sg, reason: collision with root package name */
    private boolean f9519sg = false;
    protected boolean fxn = false;
    protected int kg = 0;

    void fxn(float f, boolean z) {
    }

    public void fxn(boolean z) {
    }

    public void fxn(boolean z, float f) {
    }

    void kg(int i) {
    }

    public sg(AdSession adSession, AdEvents adEvents, View view) {
        this.rb = adSession;
        this.bh = adEvents;
        this.gff = adSession.getAdSessionId();
        fxn(view);
    }

    void fxn(View view) {
        AdSession adSession;
        if (view == null || (adSession = this.rb) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    public void fxn(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.rb;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    boolean fxn() {
        return this.fxn;
    }

    public void fxn(int i) {
        int i2;
        if (this.rb == null || this.bh == null || !rb.gff()) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || (i2 = this.kg) == 0 || i2 == 4) {
                        return;
                    }
                    this.rb.finish();
                    this.fxn = false;
                } else {
                    if (this.f9519sg) {
                        return;
                    }
                    int i3 = this.kg;
                    if (i3 != 1 && i3 != 2) {
                        return;
                    }
                    this.bh.impressionOccurred();
                    this.f9519sg = true;
                }
            } else {
                if (this.kg != 0) {
                    return;
                }
                this.rb.start();
                if (this.hm == null) {
                    this.hm = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                }
                this.bh.loaded(this.hm);
                this.fxn = true;
                this.hm = null;
            }
        } else {
            if (this.kg != 0) {
                return;
            }
            this.rb.start();
            this.bh.loaded();
            this.fxn = true;
        }
        this.kg = i;
    }

    void kg() {
        fxn(1);
    }

    void gff() {
        fxn(4);
    }

    public void hm() {
        fxn(3);
    }

    public void fxn(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            fxn((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}
