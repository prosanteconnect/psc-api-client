/*
 * psc-api-maj-v2
 * API CRUD for Personnels et Structures de santé
 *
 * OpenAPI spec version: 3.0
 * Contact: superviseurs.psc@esante.gouv.fr
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package fr.ans.psc.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Expertise
 */
@Schema(description = "Expertise")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-22T12:08:03.211Z[GMT]")
public class Expertise {
  @SerializedName("expertiseId")
  private String expertiseId = null;

  @SerializedName("typeCode")
  private String typeCode = null;

  @SerializedName("code")
  private String code = null;

  public Expertise expertiseId(String expertiseId) {
    this.expertiseId = expertiseId;
    return this;
  }

   /**
   * Get expertiseId
   * @return expertiseId
  **/
  @Schema(description = "")
  public String getExpertiseId() {
    return expertiseId;
  }

  public void setExpertiseId(String expertiseId) {
    this.expertiseId = expertiseId;
  }

  public Expertise typeCode(String typeCode) {
    this.typeCode = typeCode;
    return this;
  }

   /**
   * Get typeCode
   * @return typeCode
  **/
  @Schema(description = "")
  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }

  public Expertise code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Expertise expertise = (Expertise) o;
    return Objects.equals(this.expertiseId, expertise.expertiseId) &&
        Objects.equals(this.typeCode, expertise.typeCode) &&
        Objects.equals(this.code, expertise.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expertiseId, typeCode, code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Expertise {\n");
    
    sb.append("    expertiseId: ").append(toIndentedString(expertiseId)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
