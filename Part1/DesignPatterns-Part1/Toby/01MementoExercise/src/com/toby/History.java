package com.toby;

import java.util.ArrayList;
import java.util.List;

public class History {
  private List<DocumentState> states = new ArrayList<>();

  public void push(DocumentState state){
    states.add(state);
  }

  public DocumentState pop(){
    var index = states.size() - 1;
    var lastState = states.get(index);
    states.remove(lastState);
    return lastState;
  }

}
