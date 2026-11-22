package org.jsoup.parser;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alipay.sdk.m.n.c;
import com.anythink.expressad.foundation.d.j;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.ar.arplay.core.engine.ARPScriptEnvironment;
import com.baidu.ar.h4;
import com.heytap.mcssdk.constant.b;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.phancy.mini.core.api.Event;
import com.tencent.open.SocialConstants;
import com.umeng.analytics.pro.ak;
import io.nats.client.support.ApiConstants;
import io.nats.client.support.NatsJetStreamConstants;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.i18n.ErrorBundle;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.xmind.core.INotes;
import org.xmind.core.internal.dom.DOMConstants;
import org.xmind.core.style.IStyle;

/* loaded from: classes7.dex */
public class Tag implements Cloneable {
    private static final String[] blockTags;
    private static final String[] emptyTags;
    private static final String[] formListedTags;
    private static final String[] formSubmitTags;
    private static final String[] formatAsInlineTags;
    private static final String[] inlineTags;
    private static final String[] preserveWhitespaceTags;
    private static final Map<String, Tag> tags = new HashMap();
    private String normalName;
    private String tagName;
    private boolean isBlock = true;
    private boolean formatAsBlock = true;
    private boolean empty = false;
    private boolean selfClosing = false;
    private boolean preserveWhitespace = false;
    private boolean formList = false;
    private boolean formSubmit = false;

    static {
        String[] strArr = {INotes.HTML, "head", "body", "frameset", "script", "noscript", "style", "meta", ApiConstants.LINK, "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", h4.e, "h5", "h6", "ul", Const.SP_KEY_ONCE_LOCATION, "pre", "div", "blockquote", "hr", Const.JSON_KEY_ADDRESS, "figure", "figcaption", c.c, "fieldset", "ins", "del", CmcdConfiguration.KEY_DEADLINE, com.qumeng.overseas.advlib.core.c.f13266a, "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", ErrorBundle.DETAIL_ENTRY, "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"};
        blockTags = strArr;
        inlineTags = new String[]{"object", "base", "font", "tt", "i", "b", ak.aG, "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", j.cV, TtmlNode.ATTR_TTS_RUBY, "rt", "rp", "a", SocialConstants.PARAM_IMG_URL, "br", "wbr", IStyle.MAP, "q", NatsJetStreamConstants.ROLLUP_HDR_SUBJECT, "sup", "bdo", "iframe", Event.FROM_EMBED, "span", "input", "select", "textarea", "label", "button", "optgroup", "option", DOMConstants.TAG_LEGEND, "datalist", "keygen", "output", "progress", "meter", "area", RemoteMessageConst.MessageBody.PARAM, "source", ARPScriptEnvironment.KEY_DATA_PIP_TRACK, "summary", b.y, "device", "area", "basefont", "bgsound", "menuitem", RemoteMessageConst.MessageBody.PARAM, "source", ARPScriptEnvironment.KEY_DATA_PIP_TRACK, "data", "bdi", "s", "strike", "nobr"};
        emptyTags = new String[]{"meta", ApiConstants.LINK, "base", "frame", SocialConstants.PARAM_IMG_URL, "br", "wbr", Event.FROM_EMBED, "hr", "input", "keygen", "col", b.y, "device", "area", "basefont", "bgsound", "menuitem", RemoteMessageConst.MessageBody.PARAM, "source", ARPScriptEnvironment.KEY_DATA_PIP_TRACK};
        formatAsInlineTags = new String[]{"title", "a", "p", "h1", "h2", "h3", h4.e, "h5", "h6", "pre", Const.JSON_KEY_ADDRESS, "li", "th", "td", "script", "style", "ins", "del", "s"};
        preserveWhitespaceTags = new String[]{"pre", "plaintext", "title", "textarea"};
        formListedTags = new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
        formSubmitTags = new String[]{"input", "keygen", "object", "select", "textarea"};
        for (String str : strArr) {
            register(new Tag(str));
        }
        for (String str2 : inlineTags) {
            Tag tag = new Tag(str2);
            tag.isBlock = false;
            tag.formatAsBlock = false;
            register(tag);
        }
        for (String str3 : emptyTags) {
            Tag tag2 = tags.get(str3);
            Validate.notNull(tag2);
            tag2.empty = true;
        }
        for (String str4 : formatAsInlineTags) {
            Tag tag3 = tags.get(str4);
            Validate.notNull(tag3);
            tag3.formatAsBlock = false;
        }
        for (String str5 : preserveWhitespaceTags) {
            Tag tag4 = tags.get(str5);
            Validate.notNull(tag4);
            tag4.preserveWhitespace = true;
        }
        for (String str6 : formListedTags) {
            Tag tag5 = tags.get(str6);
            Validate.notNull(tag5);
            tag5.formList = true;
        }
        for (String str7 : formSubmitTags) {
            Tag tag6 = tags.get(str7);
            Validate.notNull(tag6);
            tag6.formSubmit = true;
        }
    }

    private Tag(String str) {
        this.tagName = str;
        this.normalName = Normalizer.lowerCase(str);
    }

    public String getName() {
        return this.tagName;
    }

    public String normalName() {
        return this.normalName;
    }

    public static Tag valueOf(String str, ParseSettings parseSettings) {
        Validate.notNull(str);
        Map<String, Tag> map = tags;
        Tag tag = map.get(str);
        if (tag != null) {
            return tag;
        }
        String normalizeTag = parseSettings.normalizeTag(str);
        Validate.notEmpty(normalizeTag);
        String lowerCase = Normalizer.lowerCase(normalizeTag);
        Tag tag2 = map.get(lowerCase);
        if (tag2 == null) {
            Tag tag3 = new Tag(normalizeTag);
            tag3.isBlock = false;
            return tag3;
        }
        if (!parseSettings.preserveTagCase() || normalizeTag.equals(lowerCase)) {
            return tag2;
        }
        Tag clone = tag2.clone();
        clone.tagName = normalizeTag;
        return clone;
    }

    public static Tag valueOf(String str) {
        return valueOf(str, ParseSettings.preserveCase);
    }

    public boolean isBlock() {
        return this.isBlock;
    }

    public boolean formatAsBlock() {
        return this.formatAsBlock;
    }

    public boolean isInline() {
        return !this.isBlock;
    }

    public boolean isEmpty() {
        return this.empty;
    }

    public boolean isSelfClosing() {
        return this.empty || this.selfClosing;
    }

    public boolean isKnownTag() {
        return tags.containsKey(this.tagName);
    }

    public static boolean isKnownTag(String str) {
        return tags.containsKey(str);
    }

    public boolean preserveWhitespace() {
        return this.preserveWhitespace;
    }

    public boolean isFormListed() {
        return this.formList;
    }

    public boolean isFormSubmittable() {
        return this.formSubmit;
    }

    Tag setSelfClosing() {
        this.selfClosing = true;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        return this.tagName.equals(tag.tagName) && this.empty == tag.empty && this.formatAsBlock == tag.formatAsBlock && this.isBlock == tag.isBlock && this.preserveWhitespace == tag.preserveWhitespace && this.selfClosing == tag.selfClosing && this.formList == tag.formList && this.formSubmit == tag.formSubmit;
    }

    public int hashCode() {
        return (((((((((((((this.tagName.hashCode() * 31) + (this.isBlock ? 1 : 0)) * 31) + (this.formatAsBlock ? 1 : 0)) * 31) + (this.empty ? 1 : 0)) * 31) + (this.selfClosing ? 1 : 0)) * 31) + (this.preserveWhitespace ? 1 : 0)) * 31) + (this.formList ? 1 : 0)) * 31) + (this.formSubmit ? 1 : 0);
    }

    public String toString() {
        return this.tagName;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Tag clone() {
        try {
            return (Tag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void register(Tag tag) {
        tags.put(tag.tagName, tag);
    }
}
