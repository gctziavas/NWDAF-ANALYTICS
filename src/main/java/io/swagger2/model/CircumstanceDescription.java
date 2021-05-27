package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.NetworkAreaInfo;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CircumstanceDescription
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class CircumstanceDescription   {
  @JsonProperty("freq")
  private Float freq = null;

  @JsonProperty("tm")
  private OffsetDateTime tm = null;

  @JsonProperty("locArea")
  private NetworkAreaInfo locArea = null;

  @JsonProperty("vol")
  private Long vol = null;

  public CircumstanceDescription freq(Float freq) {
    this.freq = freq;
    return this;
  }

  /**
   * Get freq
   * @return freq
  **/
  @ApiModelProperty(value = "")
  
    public Float getFreq() {
    return freq;
  }

  public void setFreq(Float freq) {
    this.freq = freq;
  }

  public CircumstanceDescription tm(OffsetDateTime tm) {
    this.tm = tm;
    return this;
  }

  /**
   * Get tm
   * @return tm
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getTm() {
    return tm;
  }

  public void setTm(OffsetDateTime tm) {
    this.tm = tm;
  }

  public CircumstanceDescription locArea(NetworkAreaInfo locArea) {
    this.locArea = locArea;
    return this;
  }

  /**
   * Get locArea
   * @return locArea
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NetworkAreaInfo getLocArea() {
    return locArea;
  }

  public void setLocArea(NetworkAreaInfo locArea) {
    this.locArea = locArea;
  }

  public CircumstanceDescription vol(Long vol) {
    this.vol = vol;
    return this;
  }

  /**
   * Get vol
   * @return vol
  **/
  @ApiModelProperty(value = "")
  
    public Long getVol() {
    return vol;
  }

  public void setVol(Long vol) {
    this.vol = vol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CircumstanceDescription circumstanceDescription = (CircumstanceDescription) o;
    return Objects.equals(this.freq, circumstanceDescription.freq) &&
        Objects.equals(this.tm, circumstanceDescription.tm) &&
        Objects.equals(this.locArea, circumstanceDescription.locArea) &&
        Objects.equals(this.vol, circumstanceDescription.vol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freq, tm, locArea, vol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CircumstanceDescription {\n");
    
    sb.append("    freq: ").append(toIndentedString(freq)).append("\n");
    sb.append("    tm: ").append(toIndentedString(tm)).append("\n");
    sb.append("    locArea: ").append(toIndentedString(locArea)).append("\n");
    sb.append("    vol: ").append(toIndentedString(vol)).append("\n");
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
