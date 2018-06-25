/*
 * Factern API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.factern.model;

import java.util.Objects;
import com.factern.model.BaseRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ReplaceFieldRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-25T15:20:44.090-04:00")
public class ReplaceFieldRequest {
  @SerializedName("includeSummary")
  private Boolean includeSummary = null;

  @SerializedName("storageInterfaceId")
  private String storageInterfaceId = null;

  @SerializedName("data")
  private String data = null;

  @SerializedName("nodeId")
  private String nodeId = null;

  public ReplaceFieldRequest includeSummary(Boolean includeSummary) {
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

  public ReplaceFieldRequest storageInterfaceId(String storageInterfaceId) {
    this.storageInterfaceId = storageInterfaceId;
    return this;
  }

   /**
   * Get storageInterfaceId
   * @return storageInterfaceId
  **/
  @ApiModelProperty(value = "")
  public String getStorageInterfaceId() {
    return storageInterfaceId;
  }

  public void setStorageInterfaceId(String storageInterfaceId) {
    this.storageInterfaceId = storageInterfaceId;
  }

  public ReplaceFieldRequest data(String data) {
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

  public ReplaceFieldRequest nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceFieldRequest replaceFieldRequest = (ReplaceFieldRequest) o;
    return Objects.equals(this.includeSummary, replaceFieldRequest.includeSummary) &&
        Objects.equals(this.storageInterfaceId, replaceFieldRequest.storageInterfaceId) &&
        Objects.equals(this.data, replaceFieldRequest.data) &&
        Objects.equals(this.nodeId, replaceFieldRequest.nodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeSummary, storageInterfaceId, data, nodeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceFieldRequest {\n");
    
    sb.append("    includeSummary: ").append(toIndentedString(includeSummary)).append("\n");
    sb.append("    storageInterfaceId: ").append(toIndentedString(storageInterfaceId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
