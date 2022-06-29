package fr.ans.psc.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FirstName {

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
