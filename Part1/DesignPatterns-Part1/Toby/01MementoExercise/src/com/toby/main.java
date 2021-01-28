package com.toby;

public class main {
  public static void main(String[] args) {
    var document = new Document("hello world", "normal", 42);
    var history = new History();

    // init
    System.out.println(document); // hello world, n, 42
    history.push(document.getState());

    document.setContent("this is memento design pattern");
    history.push(document.getState());
    System.out.println(document); // memento, n, 42

    document.setFontName("MS Bold");
    System.out.println(document); // memento, ms bold, 42

    var tmp = history.pop();
    System.out.println(tmp);
    document.restore(tmp);
    System.out.println(document); //memnto, n, 42

  }
}
