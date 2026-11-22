package com.otaliastudios.cameraview.filter;

/* loaded from: classes17.dex */
public final class NoFilter extends BaseFilter {
    @Override // com.otaliastudios.cameraview.filter.Filter
    public String getFragmentShader() {
        return createDefaultFragmentShader();
    }
}
