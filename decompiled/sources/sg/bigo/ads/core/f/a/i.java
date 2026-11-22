package sg.bigo.ads.core.f.a;

import com.phancy.mini.api.file.FileSystemManager;
import org.w3c.dom.Node;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    final Node f20035a;

    public i(Node node) {
        this.f20035a = node;
    }

    public final String a() {
        return sg.bigo.ads.core.f.a.e(this.f20035a, "type");
    }

    public final String b() {
        return sg.bigo.ads.core.f.a.b(this.f20035a);
    }

    public final int c() {
        return sg.bigo.ads.core.f.a.d(this.f20035a, "fileSize").intValue();
    }

    public final int d() {
        return sg.bigo.ads.core.f.a.d(this.f20035a, IjkMediaMeta.IJKM_KEY_BITRATE).intValue();
    }

    public final String e() {
        return sg.bigo.ads.core.f.a.e(this.f20035a, FileSystemManager.DIGEST_MD5);
    }
}
