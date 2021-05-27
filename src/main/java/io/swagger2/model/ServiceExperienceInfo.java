package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.NetworkAreaInfo;
import io.swagger2.model.Snssai;
import io.swagger2.model.SvcExperience;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceExperienceInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class ServiceExperienceInfo   {
  @JsonProperty("svcExprc")
  private SvcExperience svcExprc = null;

  @JsonProperty("svcExprcVariance")
  private Float svcExprcVariance = null;

  @JsonProperty("supis")
  @Valid
  private List<String> supis = null;

  @JsonProperty("snssai")
  private Snssai snssai = null;

  @JsonProperty("appId")
  private String appId = null;

  @JsonProperty("confidence")
  private Integer confidence = null;

  @JsonProperty("dnn")
  private String dnn = null;

  @JsonProperty("networkArea")
  private NetworkAreaInfo networkArea = null;

  @JsonProperty("nsiId")
  private String nsiId = null;

  @JsonProperty("ratio")
  private Integer ratio = null;

  public ServiceExperienceInfo svcExprc(SvcExperience svcExprc) {
    this.svcExprc = svcExprc;
    return this;
  }

  /**
   * Get svcExprc
   * @return svcExprc
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public SvcExperience getSvcExprc() {
    return svcExprc;
  }

  public void setSvcExprc(SvcExperience svcExprc) {
    this.svcExprc = svcExprc;
  }

  public ServiceExperienceInfo svcExprcVariance(Float svcExprcVariance) {
    this.svcExprcVariance = svcExprcVariance;
    return this;
  }

  /**
   * Get svcExprcVariance
   * @return svcExprcVariance
  **/
  @ApiModelProperty(value = "")
  
    public Float getSvcExprcVariance() {
    return svcExprcVariance;
  }

  public void setSvcExprcVariance(Float svcExprcVariance) {
    this.svcExprcVariance = svcExprcVariance;
  }

  public ServiceExperienceInfo supis(List<String> supis) {
    this.supis = supis;
    return this;
  }

  public ServiceExperienceInfo addSupisItem(String supisItem) {
    if (this.supis == null) {
      this.supis = new ArrayList<>();
    }
    this.supis.add(supisItem);
    return this;
  }

  /**
   * Get supis
   * @return supis
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1)   public List<String> getSupis() {
    return supis;
  }

  public void setSupis(List<String> supis) {
    this.supis = supis;
  }

  public ServiceExperienceInfo snssai(Snssai snssai) {
    this.snssai = snssai;
    return this;
  }

  /**
   * Get snssai
   * @return snssai
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Snssai getSnssai() {
    return snssai;
  }

  public void setSnssai(Snssai snssai) {
    this.snssai = snssai;
  }

  public ServiceExperienceInfo appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * Get appId
   * @return appId
  **/
  @ApiModelProperty(value = "")
  
    public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public ServiceExperienceInfo confidence(Integer confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Get confidence
   * @return confidence
  **/
  @ApiModelProperty(value = "")
  
    public Integer getConfidence() {
    return confidence;
  }

  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }

  public ServiceExperienceInfo dnn(String dnn) {
    this.dnn = dnn;
    return this;
  }

  /**
   * Get dnn
   * @return dnn
  **/
  @ApiModelProperty(value = "")
  
    public String getDnn() {
    return dnn;
  }

  public void setDnn(String dnn) {
    this.dnn = dnn;
  }

  public ServiceExperienceInfo networkArea(NetworkAreaInfo networkArea) {
    this.networkArea = networkArea;
    return this;
  }

  /**
   * Get networkArea
   * @return networkArea
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NetworkAreaInfo getNetworkArea() {
    return networkArea;
  }

  public void setNetworkArea(NetworkAreaInfo networkArea) {
    this.networkArea = networkArea;
  }

  public ServiceExperienceInfo nsiId(String nsiId) {
    this.nsiId = nsiId;
    return this;
  }

  /**
   * Get nsiId
   * @return nsiId
  **/
  @ApiModelProperty(value = "")
  
    public String getNsiId() {
    return nsiId;
  }

  public void setNsiId(String nsiId) {
    this.nsiId = nsiId;
  }

  public ServiceExperienceInfo ratio(Integer ratio) {
    this.ratio = ratio;
    return this;
  }

  /**
   * Get ratio
   * @return ratio
  **/
  @ApiModelProperty(value = "")
  
    public Integer getRatio() {
    return ratio;
  }

  public void setRatio(Integer ratio) {
    this.ratio = ratio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceExperienceInfo serviceExperienceInfo = (ServiceExperienceInfo) o;
    return Objects.equals(this.svcExprc, serviceExperienceInfo.svcExprc) &&
        Objects.equals(this.svcExprcVariance, serviceExperienceInfo.svcExprcVariance) &&
        Objects.equals(this.supis, serviceExperienceInfo.supis) &&
        Objects.equals(this.snssai, serviceExperienceInfo.snssai) &&
        Objects.equals(this.appId, serviceExperienceInfo.appId) &&
        Objects.equals(this.confidence, serviceExperienceInfo.confidence) &&
        Objects.equals(this.dnn, serviceExperienceInfo.dnn) &&
        Objects.equals(this.networkArea, serviceExperienceInfo.networkArea) &&
        Objects.equals(this.nsiId, serviceExperienceInfo.nsiId) &&
        Objects.equals(this.ratio, serviceExperienceInfo.ratio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(svcExprc, svcExprcVariance, supis, snssai, appId, confidence, dnn, networkArea, nsiId, ratio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceExperienceInfo {\n");
    
    sb.append("    svcExprc: ").append(toIndentedString(svcExprc)).append("\n");
    sb.append("    svcExprcVariance: ").append(toIndentedString(svcExprcVariance)).append("\n");
    sb.append("    supis: ").append(toIndentedString(supis)).append("\n");
    sb.append("    snssai: ").append(toIndentedString(snssai)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    dnn: ").append(toIndentedString(dnn)).append("\n");
    sb.append("    networkArea: ").append(toIndentedString(networkArea)).append("\n");
    sb.append("    nsiId: ").append(toIndentedString(nsiId)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
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
