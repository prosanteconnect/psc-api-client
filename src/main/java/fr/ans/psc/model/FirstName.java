package fr.ans.psc.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class FirstName {

  private static final int FIRST_NAME_COUNT = 3;
  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("order")
  private Integer order;

  public FirstName() {
  }

  public FirstName(String firstName, Integer order) {
    this.firstName = firstName;
    this.order = order;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public static List<FirstName> stringToList(String string) {
    String[] firstNameStrings = string.split("'");
    List<FirstName> firstNames = new ArrayList<>();
    for (int i = 0; i < firstNameStrings.length; i++) {
      firstNames.add(new FirstName(firstNameStrings[i], i));
    }
    return firstNames;
  }

  public static String listToString(List<FirstName> firstNames) {
    StringBuilder stringBuilder = new StringBuilder();

    for ( int i = 0; i < FIRST_NAME_COUNT - firstNames.size(); i++ ) {
      if(firstNames.get(i) != null) stringBuilder.append(firstNames.get(i).getFirstName());
      stringBuilder.append("'");
    }
    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
    return stringBuilder.toString();
  }

  @Override
  public String toString() {
    return this.firstName;
  }
}
