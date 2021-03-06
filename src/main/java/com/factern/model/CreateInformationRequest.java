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
import com.factern.model.CreateChildRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateInformationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-17T11:13:54.836-04:00")
public class CreateInformationRequest {
  @SerializedName("includeSummary")
  private Boolean includeSummary = null;

  @SerializedName("parentId")
  private String parentId = null;

  @SerializedName("fieldId")
  private String fieldId = null;

  @SerializedName("data")
  private String data = null;

  @SerializedName("storageId")
  private String storageId = null;

  public CreateInformationRequest includeSummary(Boolean includeSummary) {
    this.includeSummary = includeSummary;
    return this;
  }

   /**
   * Get includeSummary
   * @return includeSummary
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeSummary() {
    return includeSummary;
  }

  public void setIncludeSummary(Boolean includeSummary) {
    this.includeSummary = includeSummary;
  }

  public CreateInformationRequest parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(value = "")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public CreateInformationRequest fieldId(String fieldId) {
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

  public CreateInformationRequest data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public CreateInformationRequest storageId(String storageId) {
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
    CreateInformationRequest createInformationRequest = (CreateInformationRequest) o;
    return Objects.equals(this.includeSummary, createInformationRequest.includeSummary) &&
        Objects.equals(this.parentId, createInformationRequest.parentId) &&
        Objects.equals(this.fieldId, createInformationRequest.fieldId) &&
        Objects.equals(this.data, createInformationRequest.data) &&
        Objects.equals(this.storageId, createInformationRequest.storageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeSummary, parentId, fieldId, data, storageId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInformationRequest {\n");
    
    sb.append("    includeSummary: ").append(toIndentedString(includeSummary)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

