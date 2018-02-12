package com.sparrow.markdown.mark;

/**
 * Created by harry on 2018/2/12.
 */
public class MarkEntity {
    private MarkEntity(MARK mark, Integer start, Integer end) {
        this.mark = mark;
        if (start != null) {
            this.start = start;
        }
        this.end = end;
    }

    public static MarkEntity createCurrentMark(MARK mark, int end) {
        return new MarkEntity(mark, null, end);
    }

    public static MarkEntity createNextMark(MARK mark, int start, int end) {
        return new MarkEntity(mark, start, end);
    }

    private MARK mark;
    private int start;
    private int end;
    private String content;
    private String title;
    private String url;

    public MARK getMark() {
        return mark;
    }

    public void setMark(MARK mark) {
        this.mark = mark;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
