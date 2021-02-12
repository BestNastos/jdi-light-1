package com.epam.jdi.light.material.elements.utils.enums;

public enum Position {
  TOP("top"),
  BOTTOM("bottom"),
  LEFT("left"),
  RIGHT("right");

  public String getPosition() {
    return position;
  }

  String position;

  Position(String position) {
    this.position = position;
  }
}
