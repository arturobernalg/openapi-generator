package org.openapitools.model;

import org.openapitools.model.Number;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NumberOnly  {
  
  @ApiModelProperty(value = "")
  @Valid
  private Number justNumber;
 /**
   * Get justNumber
   * @return justNumber
  **/
  @JsonProperty("JustNumber")
  public Number getJustNumber() {
    return justNumber;
  }

  public void setJustNumber(Number justNumber) {
    this.justNumber = justNumber;
  }

  public NumberOnly justNumber(Number justNumber) {
    this.justNumber = justNumber;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberOnly {\n");
    
    sb.append("    justNumber: ").append(toIndentedString(justNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

