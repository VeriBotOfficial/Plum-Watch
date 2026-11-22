package livekit.org.webrtc;

import livekit.org.webrtc.GlGenericDrawer;

/* loaded from: classes8.dex */
public class GlRectDrawer extends GlGenericDrawer {
    private static final String FRAGMENT_SHADER = "void main() {\n  gl_FragColor = sample(tc);\n}\n";

    @Override // livekit.org.webrtc.GlGenericDrawer, livekit.org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawOes(int oesTextureId, float[] texMatrix, int frameWidth, int frameHeight, int viewportX, int viewportY, int viewportWidth, int viewportHeight) {
        super.drawOes(oesTextureId, texMatrix, frameWidth, frameHeight, viewportX, viewportY, viewportWidth, viewportHeight);
    }

    @Override // livekit.org.webrtc.GlGenericDrawer, livekit.org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawRgb(int textureId, float[] texMatrix, int frameWidth, int frameHeight, int viewportX, int viewportY, int viewportWidth, int viewportHeight) {
        super.drawRgb(textureId, texMatrix, frameWidth, frameHeight, viewportX, viewportY, viewportWidth, viewportHeight);
    }

    @Override // livekit.org.webrtc.GlGenericDrawer, livekit.org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawYuv(int[] yuvTextures, float[] texMatrix, int frameWidth, int frameHeight, int viewportX, int viewportY, int viewportWidth, int viewportHeight) {
        super.drawYuv(yuvTextures, texMatrix, frameWidth, frameHeight, viewportX, viewportY, viewportWidth, viewportHeight);
    }

    @Override // livekit.org.webrtc.GlGenericDrawer, livekit.org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    private static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        @Override // livekit.org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader shader) {
        }

        @Override // livekit.org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader shader, float[] texMatrix, int frameWidth, int frameHeight, int viewportWidth, int viewportHeight) {
        }

        private ShaderCallbacks() {
        }
    }

    public GlRectDrawer() {
        super(FRAGMENT_SHADER, new ShaderCallbacks());
    }
}
