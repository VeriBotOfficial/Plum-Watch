package io.noties.markwon.html.tag;

import io.nats.client.support.NatsJetStreamConstants;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.RenderProps;
import io.noties.markwon.html.HtmlTag;
import io.noties.markwon.html.span.SubScriptSpan;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes6.dex */
public class SubScriptHandler extends SimpleTagHandler {
    @Override // io.noties.markwon.html.tag.SimpleTagHandler
    public Object getSpans(MarkwonConfiguration markwonConfiguration, RenderProps renderProps, HtmlTag htmlTag) {
        return new SubScriptSpan();
    }

    @Override // io.noties.markwon.html.tag.SimpleTagHandler, io.noties.markwon.html.TagHandler
    public Collection<String> supportedTags() {
        return Collections.singleton(NatsJetStreamConstants.ROLLUP_HDR_SUBJECT);
    }
}
