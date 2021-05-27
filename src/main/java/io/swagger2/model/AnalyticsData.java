package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.AbnormalBehaviour;
import io.swagger2.model.NetworkPerfInfo;
import io.swagger2.model.NfLoadLevelInformation;
import io.swagger2.model.NsiLoadLevelInfo;
import io.swagger2.model.QosSustainabilityInfo;
import io.swagger2.model.ServiceExperienceInfo;
import io.swagger2.model.SliceLoadLevelInformation;
import io.swagger2.model.UeCommunication;
import io.swagger2.model.UeMobility;
import io.swagger2.model.UserDataCongestionInfo;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AnalyticsData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class AnalyticsData   {
  @JsonProperty("start")
  private OffsetDateTime start = null;

  @JsonProperty("expiry")
  private OffsetDateTime expiry = null;

  @JsonProperty("timeStampGen")
  private OffsetDateTime timeStampGen = null;

  @JsonProperty("sliceLoadLevelInfos")
  @Valid
  private List<SliceLoadLevelInformation> sliceLoadLevelInfos = null;

  @JsonProperty("nsiLoadLevelInfos")
  @Valid
  private List<NsiLoadLevelInfo> nsiLoadLevelInfos = null;

  @JsonProperty("nfLoadLevelInfos")
  @Valid
  private List<NfLoadLevelInformation> nfLoadLevelInfos = null;

  @JsonProperty("nwPerfs")
  @Valid
  private List<NetworkPerfInfo> nwPerfs = null;

  @JsonProperty("svcExps")
  @Valid
  private List<ServiceExperienceInfo> svcExps = null;

  @JsonProperty("qosSustainInfos")
  @Valid
  private List<QosSustainabilityInfo> qosSustainInfos = null;

  @JsonProperty("ueMobs")
  @Valid
  private List<UeMobility> ueMobs = null;

  @JsonProperty("ueComms")
  @Valid
  private List<UeCommunication> ueComms = null;

  @JsonProperty("userDataCongInfos")
  @Valid
  private List<UserDataCongestionInfo> userDataCongInfos = null;

  @JsonProperty("abnorBehavrs")
  @Valid
  private List<AbnormalBehaviour> abnorBehavrs = null;

  @JsonProperty("suppFeat")
  private String suppFeat = null;

  public AnalyticsData start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public AnalyticsData expiry(OffsetDateTime expiry) {
    this.expiry = expiry;
    return this;
  }

  /**
   * Get expiry
   * @return expiry
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getExpiry() {
    return expiry;
  }

  public void setExpiry(OffsetDateTime expiry) {
    this.expiry = expiry;
  }

  public AnalyticsData timeStampGen(OffsetDateTime timeStampGen) {
    this.timeStampGen = timeStampGen;
    return this;
  }

  /**
   * Get timeStampGen
   * @return timeStampGen
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getTimeStampGen() {
    return timeStampGen;
  }

  public void setTimeStampGen(OffsetDateTime timeStampGen) {
    this.timeStampGen = timeStampGen;
  }

  public AnalyticsData sliceLoadLevelInfos(List<SliceLoadLevelInformation> sliceLoadLevelInfos) {
    this.sliceLoadLevelInfos = sliceLoadLevelInfos;
    return this;
  }

  public AnalyticsData addSliceLoadLevelInfosItem(SliceLoadLevelInformation sliceLoadLevelInfosItem) {
    if (this.sliceLoadLevelInfos == null) {
      this.sliceLoadLevelInfos = new ArrayList<>();
    }
    this.sliceLoadLevelInfos.add(sliceLoadLevelInfosItem);
    return this;
  }

  /**
   * The slices and their load level information.
   * @return sliceLoadLevelInfos
  **/
  @ApiModelProperty(value = "The slices and their load level information.")
      @Valid
  @Size(min=1)   public List<SliceLoadLevelInformation> getSliceLoadLevelInfos() {
    return sliceLoadLevelInfos;
  }

  public void setSliceLoadLevelInfos(List<SliceLoadLevelInformation> sliceLoadLevelInfos) {
    this.sliceLoadLevelInfos = sliceLoadLevelInfos;
  }

  public AnalyticsData nsiLoadLevelInfos(List<NsiLoadLevelInfo> nsiLoadLevelInfos) {
    this.nsiLoadLevelInfos = nsiLoadLevelInfos;
    return this;
  }

  public AnalyticsData addNsiLoadLevelInfosItem(NsiLoadLevelInfo nsiLoadLevelInfosItem) {
    if (this.nsiLoadLevelInfos == null) {
      this.nsiLoadLevelInfos = new ArrayList<>();
    }
    this.nsiLoadLevelInfos.add(nsiLoadLevelInfosItem);
    return this;
  }

  /**
   * Get nsiLoadLevelInfos
   * @return nsiLoadLevelInfos
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<NsiLoadLevelInfo> getNsiLoadLevelInfos() {
    return nsiLoadLevelInfos;
  }

  public void setNsiLoadLevelInfos(List<NsiLoadLevelInfo> nsiLoadLevelInfos) {
    this.nsiLoadLevelInfos = nsiLoadLevelInfos;
  }

  public AnalyticsData nfLoadLevelInfos(List<NfLoadLevelInformation> nfLoadLevelInfos) {
    this.nfLoadLevelInfos = nfLoadLevelInfos;
    return this;
  }

  public AnalyticsData addNfLoadLevelInfosItem(NfLoadLevelInformation nfLoadLevelInfosItem) {
    if (this.nfLoadLevelInfos == null) {
      this.nfLoadLevelInfos = new ArrayList<>();
    }
    this.nfLoadLevelInfos.add(nfLoadLevelInfosItem);
    return this;
  }

  /**
   * Get nfLoadLevelInfos
   * @return nfLoadLevelInfos
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<NfLoadLevelInformation> getNfLoadLevelInfos() {
    return nfLoadLevelInfos;
  }

  public void setNfLoadLevelInfos(List<NfLoadLevelInformation> nfLoadLevelInfos) {
    this.nfLoadLevelInfos = nfLoadLevelInfos;
  }

  public AnalyticsData nwPerfs(List<NetworkPerfInfo> nwPerfs) {
    this.nwPerfs = nwPerfs;
    return this;
  }

  public AnalyticsData addNwPerfsItem(NetworkPerfInfo nwPerfsItem) {
    if (this.nwPerfs == null) {
      this.nwPerfs = new ArrayList<>();
    }
    this.nwPerfs.add(nwPerfsItem);
    return this;
  }

  /**
   * Get nwPerfs
   * @return nwPerfs
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<NetworkPerfInfo> getNwPerfs() {
    return nwPerfs;
  }

  public void setNwPerfs(List<NetworkPerfInfo> nwPerfs) {
    this.nwPerfs = nwPerfs;
  }

  public AnalyticsData svcExps(List<ServiceExperienceInfo> svcExps) {
    this.svcExps = svcExps;
    return this;
  }

  public AnalyticsData addSvcExpsItem(ServiceExperienceInfo svcExpsItem) {
    if (this.svcExps == null) {
      this.svcExps = new ArrayList<>();
    }
    this.svcExps.add(svcExpsItem);
    return this;
  }

  /**
   * Get svcExps
   * @return svcExps
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<ServiceExperienceInfo> getSvcExps() {
    return svcExps;
  }

  public void setSvcExps(List<ServiceExperienceInfo> svcExps) {
    this.svcExps = svcExps;
  }

  public AnalyticsData qosSustainInfos(List<QosSustainabilityInfo> qosSustainInfos) {
    this.qosSustainInfos = qosSustainInfos;
    return this;
  }

  public AnalyticsData addQosSustainInfosItem(QosSustainabilityInfo qosSustainInfosItem) {
    if (this.qosSustainInfos == null) {
      this.qosSustainInfos = new ArrayList<>();
    }
    this.qosSustainInfos.add(qosSustainInfosItem);
    return this;
  }

  /**
   * Get qosSustainInfos
   * @return qosSustainInfos
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<QosSustainabilityInfo> getQosSustainInfos() {
    return qosSustainInfos;
  }

  public void setQosSustainInfos(List<QosSustainabilityInfo> qosSustainInfos) {
    this.qosSustainInfos = qosSustainInfos;
  }

  public AnalyticsData ueMobs(List<UeMobility> ueMobs) {
    this.ueMobs = ueMobs;
    return this;
  }

  public AnalyticsData addUeMobsItem(UeMobility ueMobsItem) {
    if (this.ueMobs == null) {
      this.ueMobs = new ArrayList<>();
    }
    this.ueMobs.add(ueMobsItem);
    return this;
  }

  /**
   * Get ueMobs
   * @return ueMobs
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<UeMobility> getUeMobs() {
    return ueMobs;
  }

  public void setUeMobs(List<UeMobility> ueMobs) {
    this.ueMobs = ueMobs;
  }

  public AnalyticsData ueComms(List<UeCommunication> ueComms) {
    this.ueComms = ueComms;
    return this;
  }

  public AnalyticsData addUeCommsItem(UeCommunication ueCommsItem) {
    if (this.ueComms == null) {
      this.ueComms = new ArrayList<>();
    }
    this.ueComms.add(ueCommsItem);
    return this;
  }

  /**
   * Get ueComms
   * @return ueComms
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<UeCommunication> getUeComms() {
    return ueComms;
  }

  public void setUeComms(List<UeCommunication> ueComms) {
    this.ueComms = ueComms;
  }

  public AnalyticsData userDataCongInfos(List<UserDataCongestionInfo> userDataCongInfos) {
    this.userDataCongInfos = userDataCongInfos;
    return this;
  }

  public AnalyticsData addUserDataCongInfosItem(UserDataCongestionInfo userDataCongInfosItem) {
    if (this.userDataCongInfos == null) {
      this.userDataCongInfos = new ArrayList<>();
    }
    this.userDataCongInfos.add(userDataCongInfosItem);
    return this;
  }

  /**
   * Get userDataCongInfos
   * @return userDataCongInfos
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<UserDataCongestionInfo> getUserDataCongInfos() {
    return userDataCongInfos;
  }

  public void setUserDataCongInfos(List<UserDataCongestionInfo> userDataCongInfos) {
    this.userDataCongInfos = userDataCongInfos;
  }

  public AnalyticsData abnorBehavrs(List<AbnormalBehaviour> abnorBehavrs) {
    this.abnorBehavrs = abnorBehavrs;
    return this;
  }

  public AnalyticsData addAbnorBehavrsItem(AbnormalBehaviour abnorBehavrsItem) {
    if (this.abnorBehavrs == null) {
      this.abnorBehavrs = new ArrayList<>();
    }
    this.abnorBehavrs.add(abnorBehavrsItem);
    return this;
  }

  /**
   * Get abnorBehavrs
   * @return abnorBehavrs
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<AbnormalBehaviour> getAbnorBehavrs() {
    return abnorBehavrs;
  }

  public void setAbnorBehavrs(List<AbnormalBehaviour> abnorBehavrs) {
    this.abnorBehavrs = abnorBehavrs;
  }

  public AnalyticsData suppFeat(String suppFeat) {
    this.suppFeat = suppFeat;
    return this;
  }

  /**
   * Get suppFeat
   * @return suppFeat
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^[A-Fa-f0-9]*$")   public String getSuppFeat() {
    return suppFeat;
  }

  public void setSuppFeat(String suppFeat) {
    this.suppFeat = suppFeat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsData analyticsData = (AnalyticsData) o;
    return Objects.equals(this.start, analyticsData.start) &&
        Objects.equals(this.expiry, analyticsData.expiry) &&
        Objects.equals(this.timeStampGen, analyticsData.timeStampGen) &&
        Objects.equals(this.sliceLoadLevelInfos, analyticsData.sliceLoadLevelInfos) &&
        Objects.equals(this.nsiLoadLevelInfos, analyticsData.nsiLoadLevelInfos) &&
        Objects.equals(this.nfLoadLevelInfos, analyticsData.nfLoadLevelInfos) &&
        Objects.equals(this.nwPerfs, analyticsData.nwPerfs) &&
        Objects.equals(this.svcExps, analyticsData.svcExps) &&
        Objects.equals(this.qosSustainInfos, analyticsData.qosSustainInfos) &&
        Objects.equals(this.ueMobs, analyticsData.ueMobs) &&
        Objects.equals(this.ueComms, analyticsData.ueComms) &&
        Objects.equals(this.userDataCongInfos, analyticsData.userDataCongInfos) &&
        Objects.equals(this.abnorBehavrs, analyticsData.abnorBehavrs) &&
        Objects.equals(this.suppFeat, analyticsData.suppFeat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, expiry, timeStampGen, sliceLoadLevelInfos, nsiLoadLevelInfos, nfLoadLevelInfos, nwPerfs, svcExps, qosSustainInfos, ueMobs, ueComms, userDataCongInfos, abnorBehavrs, suppFeat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsData {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    timeStampGen: ").append(toIndentedString(timeStampGen)).append("\n");
    sb.append("    sliceLoadLevelInfos: ").append(toIndentedString(sliceLoadLevelInfos)).append("\n");
    sb.append("    nsiLoadLevelInfos: ").append(toIndentedString(nsiLoadLevelInfos)).append("\n");
    sb.append("    nfLoadLevelInfos: ").append(toIndentedString(nfLoadLevelInfos)).append("\n");
    sb.append("    nwPerfs: ").append(toIndentedString(nwPerfs)).append("\n");
    sb.append("    svcExps: ").append(toIndentedString(svcExps)).append("\n");
    sb.append("    qosSustainInfos: ").append(toIndentedString(qosSustainInfos)).append("\n");
    sb.append("    ueMobs: ").append(toIndentedString(ueMobs)).append("\n");
    sb.append("    ueComms: ").append(toIndentedString(ueComms)).append("\n");
    sb.append("    userDataCongInfos: ").append(toIndentedString(userDataCongInfos)).append("\n");
    sb.append("    abnorBehavrs: ").append(toIndentedString(abnorBehavrs)).append("\n");
    sb.append("    suppFeat: ").append(toIndentedString(suppFeat)).append("\n");
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
