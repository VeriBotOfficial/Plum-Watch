package io.noties.markwon.html;

import io.noties.markwon.html.HtmlTag;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
abstract class HtmlTagImpl implements HtmlTag {
    final Map<String, String> attributes;
    int end = -1;
    final String name;
    final int start;

    abstract void closeAt(int i);

    protected HtmlTagImpl(String str, int i, Map<String, String> map) {
        this.name = str;
        this.start = i;
        this.attributes = map;
    }

    @Override // io.noties.markwon.html.HtmlTag
    public String name() {
        return this.name;
    }

    @Override // io.noties.markwon.html.HtmlTag
    public int start() {
        return this.start;
    }

    @Override // io.noties.markwon.html.HtmlTag
    public int end() {
        return this.end;
    }

    @Override // io.noties.markwon.html.HtmlTag
    public boolean isEmpty() {
        return this.start == this.end;
    }

    @Override // io.noties.markwon.html.HtmlTag
    public Map<String, String> attributes() {
        return this.attributes;
    }

    @Override // io.noties.markwon.html.HtmlTag
    public boolean isClosed() {
        return this.end > -1;
    }

    static class InlineImpl extends HtmlTagImpl implements HtmlTag.Inline {
        @Override // io.noties.markwon.html.HtmlTag
        public HtmlTag.Inline getAsInline() {
            return this;
        }

        @Override // io.noties.markwon.html.HtmlTag
        public boolean isBlock() {
            return false;
        }

        @Override // io.noties.markwon.html.HtmlTag
        public boolean isInline() {
            return true;
        }

        InlineImpl(String str, int i, Map<String, String> map) {
            super(str, i, map);
        }

        @Override // io.noties.markwon.html.HtmlTagImpl
        void closeAt(int i) {
            if (isClosed()) {
                return;
            }
            this.end = i;
        }

        public String toString() {
            return "InlineImpl{name='" + this.name + "', start=" + this.start + ", end=" + this.end + ", attributes=" + this.attributes + AbstractJsonLexerKt.END_OBJ;
        }

        @Override // io.noties.markwon.html.HtmlTag
        public HtmlTag.Block getAsBlock() {
            throw new ClassCastException("Cannot cast Inline instance to Block");
        }
    }

    static class BlockImpl extends HtmlTagImpl implements HtmlTag.Block {
        List<BlockImpl> children;
        final BlockImpl parent;

        @Override // io.noties.markwon.html.HtmlTag
        public HtmlTag.Block getAsBlock() {
            return this;
        }

        @Override // io.noties.markwon.html.HtmlTag
        public boolean isBlock() {
            return true;
        }

        @Override // io.noties.markwon.html.HtmlTag
        public boolean isInline() {
            return false;
        }

        static BlockImpl root() {
            return new BlockImpl("", 0, Collections.emptyMap(), null);
        }

        static BlockImpl create(String str, int i, Map<String, String> map, BlockImpl blockImpl) {
            return new BlockImpl(str, i, map, blockImpl);
        }

        BlockImpl(String str, int i, Map<String, String> map, BlockImpl blockImpl) {
            super(str, i, map);
            this.parent = blockImpl;
        }

        @Override // io.noties.markwon.html.HtmlTagImpl
        void closeAt(int i) {
            if (isClosed()) {
                return;
            }
            this.end = i;
            List<BlockImpl> list = this.children;
            if (list != null) {
                Iterator<BlockImpl> it = list.iterator();
                while (it.hasNext()) {
                    it.next().closeAt(i);
                }
            }
        }

        @Override // io.noties.markwon.html.HtmlTag.Block
        public boolean isRoot() {
            return this.parent == null;
        }

        @Override // io.noties.markwon.html.HtmlTag.Block
        public HtmlTag.Block parent() {
            return this.parent;
        }

        @Override // io.noties.markwon.html.HtmlTag.Block
        public List<HtmlTag.Block> children() {
            List<BlockImpl> list = this.children;
            if (list == null) {
                return Collections.emptyList();
            }
            return Collections.unmodifiableList(list);
        }

        @Override // io.noties.markwon.html.HtmlTagImpl, io.noties.markwon.html.HtmlTag
        public Map<String, String> attributes() {
            return this.attributes;
        }

        @Override // io.noties.markwon.html.HtmlTag
        public HtmlTag.Inline getAsInline() {
            throw new ClassCastException("Cannot cast Block instance to Inline");
        }

        public String toString() {
            StringBuilder append = new StringBuilder("BlockImpl{name='").append(this.name).append("', start=").append(this.start).append(", end=").append(this.end).append(", attributes=").append(this.attributes).append(", parent=");
            BlockImpl blockImpl = this.parent;
            return append.append(blockImpl != null ? blockImpl.name : null).append(", children=").append(this.children).append(AbstractJsonLexerKt.END_OBJ).toString();
        }
    }
}
