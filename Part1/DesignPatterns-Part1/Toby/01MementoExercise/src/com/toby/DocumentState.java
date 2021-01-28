package com.toby;

public class DocumentState {
  private String content;
  private String fontName;
  private int fontSize;

  public DocumentState(String content, String fontName, int fontSize) {
    this.content = content;
    this.fontName = fontName;
    this.fontSize = fontSize;
  }

  public String getFontName() {
    return fontName;
  }

  public int getFontSize() {
    return fontSize;
  }

  public String getContent() {
    return content;
  }

  @Override
  public String toString() {
    return "DocumentState{" +
        "content='" + content + '\'' +
        ", fontName='" + fontName + '\'' +
        ", fontSize=" + fontSize +
        '}';
  }
}
