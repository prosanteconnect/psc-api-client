package fr.ans.psc.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

  /**
   * Transforms a string of first names separated by an apostrophe (')
   * into a list of FirstName objects, in the same order as they appear in the string.
   * @param string a string of first names separated by an apostrophe (') and containing exactly FIRST_NAME_COUNT-1 apostrophes (')
   * @return list of FirstName objects
   */
  public static List<FirstName> stringToList(String string) {
    String[] firstNameStrings = string.split("'");
    List<FirstName> firstNames = new ArrayList<>();
    for (int i = 0; i < firstNameStrings.length; i++) {
      firstNames.add(new FirstName(firstNameStrings[i], i));
    }
    return firstNames;
  }

  /**
   * Transforms a list of FirstName objects into a string of first names separated by an apostrophe ('),
   * and containing exactly FIRST_NAME_COUNT-1 apostrophes (') even if the list contains less than FIRST_NAME_COUNT names.
   * @param firstNames list of FirstName objects
   * @return a string of first names separated by an apostrophe (') and containing exactly FIRST_NAME_COUNT-1 apostrophes (')
   */
  public static String listToString(List<FirstName> firstNames) {
    StringBuilder stringBuilder = new StringBuilder();

    for ( int i = 0; i < FIRST_NAME_COUNT; i++ ) {
      if(i < firstNames.size()) stringBuilder.append(firstNames.get(i).getFirstName());
      stringBuilder.append("'");
    }
    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
    return stringBuilder.toString();
  }

  @Override
  public String toString() {
    return this.firstName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirstName firstName = (FirstName) o;
    return Objects.equals(this.getFirstName(), firstName.getFirstName()) &&
            Objects.equals(this.getOrder(), firstName.getOrder());
  }

  @Override
    public int hashCode() {
        return Objects.hash(this.getFirstName(), this.getOrder());
    }
}
