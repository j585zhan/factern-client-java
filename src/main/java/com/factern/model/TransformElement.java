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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TransformElement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-25T15:20:44.090-04:00")
public class TransformElement {
  /**
   * Gets or Sets operation
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    SHIFT("shift"),
    
    DEFAULT("default"),
    
    REMOVE("remove"),
    
    SORT("sort"),
    
    CARDINALITY("cardinality");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperationEnum fromValue(String text) {
      for (OperationEnum b : OperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OperationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("operation")
  private OperationEnum operation = null;

  @SerializedName("spec")
  private Object spec = null;

  public TransformElement operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @ApiModelProperty(value = "")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public TransformElement spec(Object spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @ApiModelProperty(value = "")
  public Object getSpec() {
    return spec;
  }

  public void setSpec(Object spec) {
    this.spec = spec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransformElement transformElement = (TransformElement) o;
    return Objects.equals(this.operation, transformElement.operation) &&
        Objects.equals(this.spec, transformElement.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, spec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransformElement {\n");
    
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
