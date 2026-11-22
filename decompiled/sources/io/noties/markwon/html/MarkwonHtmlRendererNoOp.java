package io.noties.markwon.html;

import io.noties.markwon.MarkwonVisitor;

/* loaded from: classes6.dex */
class MarkwonHtmlRendererNoOp extends MarkwonHtmlRenderer {
    @Override // io.noties.markwon.html.MarkwonHtmlRenderer
    public TagHandler tagHandler(String str) {
        return null;
    }

    MarkwonHtmlRendererNoOp() {
    }

    @Override // io.noties.markwon.html.MarkwonHtmlRenderer
    public void render(MarkwonVisitor markwonVisitor, MarkwonHtmlParser markwonHtmlParser) {
        markwonHtmlParser.reset();
    }
}
