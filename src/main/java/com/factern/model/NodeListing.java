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
import com.factern.model.StandardNode;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * NodeListing
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-25T15:20:44.090-04:00")
public class NodeListing {
  @SerializedName("nodes")
  private List<StandardNode> nodes = null;

  @SerializedName("nextToken")
  private String nextToken = null;

  @SerializedName("totalResults")
  private BigDecimal totalResults = null;

  public NodeListing nodes(List<StandardNode> nodes) {
    this.nodes = nodes;
    return this;
  }

  public NodeListing addNodesItem(StandardNode nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<StandardNode>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @ApiModelProperty(value = "")
  public List<StandardNode> getNodes() {
    return nodes;
  }

  public void setNodes(List<StandardNode> nodes) {
    this.nodes = nodes;
  }

  public NodeListing nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @ApiModelProperty(value = "")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public NodeListing totalResults(BigDecimal totalResults) {
    this.totalResults = totalResults;
    return this;
  }

   /**
   * Get totalResults
   * @return totalResults
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(BigDecimal totalResults) {
    this.totalResults = totalResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeListing nodeListing = (NodeListing) o;
    return Objects.equals(this.nodes, nodeListing.nodes) &&
        Objects.equals(this.nextToken, nodeListing.nextToken) &&
        Objects.equals(this.totalResults, nodeListing.totalResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodes, nextToken, totalResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeListing {\n");
    
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
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

