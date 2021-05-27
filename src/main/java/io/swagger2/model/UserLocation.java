package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasEutraLocation;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasN3gaLocation;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasNrLocation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserLocation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class UserLocation   {
  @JsonProperty("eutraLocation")
  private TS29571CommonDataYamlcomponentsschemasEutraLocation eutraLocation = null;

  @JsonProperty("nrLocation")
  private TS29571CommonDataYamlcomponentsschemasNrLocation nrLocation = null;

  @JsonProperty("n3gaLocation")
  private TS29571CommonDataYamlcomponentsschemasN3gaLocation n3gaLocation = null;

  public UserLocation eutraLocation(TS29571CommonDataYamlcomponentsschemasEutraLocation eutraLocation) {
    this.eutraLocation = eutraLocation;
    return this;
  }

  /**
   * Get eutraLocation
   * @return eutraLocation
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TS29571CommonDataYamlcomponentsschemasEutraLocation getEutraLocation() {
    return eutraLocation;
  }

  public void setEutraLocation(TS29571CommonDataYamlcomponentsschemasEutraLocation eutraLocation) {
    this.eutraLocation = eutraLocation;
  }

  public UserLocation nrLocation(TS29571CommonDataYamlcomponentsschemasNrLocation nrLocation) {
    this.nrLocation = nrLocation;
    return this;
  }

  /**
   * Get nrLocation
   * @return nrLocation
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TS29571CommonDataYamlcomponentsschemasNrLocation getNrLocation() {
    return nrLocation;
  }

  public void setNrLocation(TS29571CommonDataYamlcomponentsschemasNrLocation nrLocation) {
    this.nrLocation = nrLocation;
  }

  public UserLocation n3gaLocation(TS29571CommonDataYamlcomponentsschemasN3gaLocation n3gaLocation) {
    this.n3gaLocation = n3gaLocation;
    return this;
  }

  /**
   * Get n3gaLocation
   * @return n3gaLocation
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TS29571CommonDataYamlcomponentsschemasN3gaLocation getN3gaLocation() {
    return n3gaLocation;
  }

  public void setN3gaLocation(TS29571CommonDataYamlcomponentsschemasN3gaLocation n3gaLocation) {
    this.n3gaLocation = n3gaLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLocation userLocation = (UserLocation) o;
    return Objects.equals(this.eutraLocation, userLocation.eutraLocation) &&
        Objects.equals(this.nrLocation, userLocation.nrLocation) &&
        Objects.equals(this.n3gaLocation, userLocation.n3gaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eutraLocation, nrLocation, n3gaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLocation {\n");
    
    sb.append("    eutraLocation: ").append(toIndentedString(eutraLocation)).append("\n");
    sb.append("    nrLocation: ").append(toIndentedString(nrLocation)).append("\n");
    sb.append("    n3gaLocation: ").append(toIndentedString(n3gaLocation)).append("\n");
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
