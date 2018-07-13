/*
 * Factern API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * Contact: mailto:support@factern.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.factern.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InformationNode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-13T13:43:21.819-04:00")
public class InformationNode {
  @SerializedName("fieldId")
  private String fieldId = null;

  @SerializedName("storageId")
  private String storageId = null;

  public InformationNode fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

   /**
   * Get fieldId
   * @return fieldId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  public InformationNode storageId(String storageId) {
    this.storageId = storageId;
    return this;
  }

   /**
   * Get storageId
   * @return storageId
  **/
  @ApiModelProperty(value = "")
  public String getStorageId() {
    return storageId;
  }

  public void setStorageId(String storageId) {
    this.storageId = storageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InformationNode informationNode = (InformationNode) o;
    return Objects.equals(this.fieldId, informationNode.fieldId) &&
        Objects.equals(this.storageId, informationNode.storageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, storageId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformationNode {\n");
    
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    storageId: ").append(toIndentedString(storageId)).append("\n");
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

