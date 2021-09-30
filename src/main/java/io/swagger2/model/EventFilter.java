package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.BwRequirement;
import io.swagger2.model.ExceptionId;
import io.swagger2.model.ExpectedAnalyticsType;
import io.swagger2.model.ExpectedUeBehaviourData;
import io.swagger2.model.NFType;
import io.swagger2.model.NetworkAreaInfo;
import io.swagger2.model.NetworkPerfType;
import io.swagger2.model.NsiIdInfo;
import io.swagger2.model.QosRequirement;
import io.swagger2.model.Snssai;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EventFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class EventFilter   {
  @JsonProperty("anySlice")
  private Boolean anySlice = null;

  @JsonProperty("snssais")
  @Valid
  private List<Snssai> snssais = null;

  @JsonProperty("appIds")
  @Valid
  private List<String> appIds = null;

  @JsonProperty("dnns")
  @Valid
  private List<String> dnns = null;

  @JsonProperty("dnais")
  @Valid
  private List<String> dnais = null;

  @JsonProperty("networkArea")
  private NetworkAreaInfo networkArea = null;

  @JsonProperty("nfInstanceIds")
  @Valid
  private List<UUID> nfInstanceIds = null;

  @JsonProperty("nfSetIds")
  @Valid
  private List<String> nfSetIds = null;

  @JsonProperty("nfTypes")
  @Valid
  private List<NFType> nfTypes = null;

  @JsonProperty("nsiIdInfos")
  @Valid
  private List<NsiIdInfo> nsiIdInfos = null;

  @JsonProperty("qosRequ")
  private QosRequirement qosRequ = null;

  @JsonProperty("nwPerfTypes")
  @Valid
  private List<NetworkPerfType> nwPerfTypes = null;

  @JsonProperty("bwRequs")
  @Valid
  private List<BwRequirement> bwRequs = null;

  @JsonProperty("excepIds")
  @Valid
  private List<ExceptionId> excepIds = null;

  @JsonProperty("exptAnaType")
  private ExpectedAnalyticsType exptAnaType = null;

  @JsonProperty("exptUeBehav")
  private ExpectedUeBehaviourData exptUeBehav = null;

  public EventFilter anySlice(Boolean anySlice) {
    this.anySlice = anySlice;
    return this;
  }

  /**
   * Get anySlice
   * @return anySlice
  **/
  @ApiModelProperty(value = "")
  
    public Boolean getAnySlice() {
    return anySlice;
  }

  public void setAnySlice(Boolean anySlice) {
    this.anySlice = anySlice;
  }

  public EventFilter snssais(List<Snssai> snssais) {
    this.snssais = snssais;
    return this;
  }

  public EventFilter addSnssaisItem(Snssai snssaisItem) {
    if (this.snssais == null) {
      this.snssais = new ArrayList<>();
    }
    this.snssais.add(snssaisItem);
    return this;
  }

  /**
   * Identification(s) of network slice to which the subscription belongs.
   * @return snssais
  **/
  @ApiModelProperty(value = "Identification(s) of network slice to which the subscription belongs.")
      @Valid
  @Size(min=1)   public List<Snssai> getSnssais() {
    return snssais;
  }

  public void setSnssais(ArrayList<Snssai> snssais) {
    this.snssais = snssais;
  }

  public EventFilter appIds(List<String> appIds) {
    this.appIds = appIds;
    return this;
  }

  public EventFilter addAppIdsItem(String appIdsItem) {
    if (this.appIds == null) {
      this.appIds = new ArrayList<>();
    }
    this.appIds.add(appIdsItem);
    return this;
  }

  /**
   * Get appIds
   * @return appIds
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1)   public List<String> getAppIds() {
    return appIds;
  }

  public void setAppIds(List<String> appIds) {
    this.appIds = appIds;
  }

  public EventFilter dnns(List<String> dnns) {
    this.dnns = dnns;
    return this;
  }

  public EventFilter addDnnsItem(String dnnsItem) {
    if (this.dnns == null) {
      this.dnns = new ArrayList<>();
    }
    this.dnns.add(dnnsItem);
    return this;
  }

  /**
   * Get dnns
   * @return dnns
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1)   public List<String> getDnns() {
    return dnns;
  }

  public void setDnns(List<String> dnns) {
    this.dnns = dnns;
  }

  public EventFilter dnais(List<String> dnais) {
    this.dnais = dnais;
    return this;
  }

  public EventFilter addDnaisItem(String dnaisItem) {
    if (this.dnais == null) {
      this.dnais = new ArrayList<>();
    }
    this.dnais.add(dnaisItem);
    return this;
  }

  /**
   * Get dnais
   * @return dnais
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1)   public List<String> getDnais() {
    return dnais;
  }

  public void setDnais(List<String> dnais) {
    this.dnais = dnais;
  }

  public EventFilter networkArea(NetworkAreaInfo networkArea) {
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

  public EventFilter nfInstanceIds(List<UUID> nfInstanceIds) {
    this.nfInstanceIds = nfInstanceIds;
    return this;
  }

  public EventFilter addNfInstanceIdsItem(UUID nfInstanceIdsItem) {
    if (this.nfInstanceIds == null) {
      this.nfInstanceIds = new ArrayList<>();
    }
    this.nfInstanceIds.add(nfInstanceIdsItem);
    return this;
  }

  /**
   * Get nfInstanceIds
   * @return nfInstanceIds
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<UUID> getNfInstanceIds() {
    return nfInstanceIds;
  }

  public void setNfInstanceIds(List<UUID> nfInstanceIds) {
    this.nfInstanceIds = nfInstanceIds;
  }

  public EventFilter nfSetIds(List<String> nfSetIds) {
    this.nfSetIds = nfSetIds;
    return this;
  }

  public EventFilter addNfSetIdsItem(String nfSetIdsItem) {
    if (this.nfSetIds == null) {
      this.nfSetIds = new ArrayList<>();
    }
    this.nfSetIds.add(nfSetIdsItem);
    return this;
  }

  /**
   * Get nfSetIds
   * @return nfSetIds
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1)   public List<String> getNfSetIds() {
    return nfSetIds;
  }

  public void setNfSetIds(List<String> nfSetIds) {
    this.nfSetIds = nfSetIds;
  }

  public EventFilter nfTypes(List<NFType> nfTypes) {
    this.nfTypes = nfTypes;
    return this;
  }

  public EventFilter addNfTypesItem(NFType nfTypesItem) {
    if (this.nfTypes == null) {
      this.nfTypes = new ArrayList<>();
    }
    this.nfTypes.add(nfTypesItem);
    return this;
  }

  /**
   * Get nfTypes
   * @return nfTypes
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<NFType> getNfTypes() {
    return nfTypes;
  }

  public void setNfTypes(List<NFType> nfTypes) {
    this.nfTypes = nfTypes;
  }

  public EventFilter nsiIdInfos(List<NsiIdInfo> nsiIdInfos) {
    this.nsiIdInfos = nsiIdInfos;
    return this;
  }

  public EventFilter addNsiIdInfosItem(NsiIdInfo nsiIdInfosItem) {
    if (this.nsiIdInfos == null) {
      this.nsiIdInfos = new ArrayList<>();
    }
    this.nsiIdInfos.add(nsiIdInfosItem);
    return this;
  }

  /**
   * Get nsiIdInfos
   * @return nsiIdInfos
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<NsiIdInfo> getNsiIdInfos() {
    return nsiIdInfos;
  }

  public void setNsiIdInfos(List<NsiIdInfo> nsiIdInfos) {
    this.nsiIdInfos = nsiIdInfos;
  }

  public EventFilter qosRequ(QosRequirement qosRequ) {
    this.qosRequ = qosRequ;
    return this;
  }

  /**
   * Get qosRequ
   * @return qosRequ
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public QosRequirement getQosRequ() {
    return qosRequ;
  }

  public void setQosRequ(QosRequirement qosRequ) {
    this.qosRequ = qosRequ;
  }

  public EventFilter nwPerfTypes(List<NetworkPerfType> nwPerfTypes) {
    this.nwPerfTypes = nwPerfTypes;
    return this;
  }

  public EventFilter addNwPerfTypesItem(NetworkPerfType nwPerfTypesItem) {
    if (this.nwPerfTypes == null) {
      this.nwPerfTypes = new ArrayList<>();
    }
    this.nwPerfTypes.add(nwPerfTypesItem);
    return this;
  }

  /**
   * Get nwPerfTypes
   * @return nwPerfTypes
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<NetworkPerfType> getNwPerfTypes() {
    return nwPerfTypes;
  }

  public void setNwPerfTypes(List<NetworkPerfType> nwPerfTypes) {
    this.nwPerfTypes = nwPerfTypes;
  }

  public EventFilter bwRequs(List<BwRequirement> bwRequs) {
    this.bwRequs = bwRequs;
    return this;
  }

  public EventFilter addBwRequsItem(BwRequirement bwRequsItem) {
    if (this.bwRequs == null) {
      this.bwRequs = new ArrayList<>();
    }
    this.bwRequs.add(bwRequsItem);
    return this;
  }

  /**
   * Get bwRequs
   * @return bwRequs
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<BwRequirement> getBwRequs() {
    return bwRequs;
  }

  public void setBwRequs(List<BwRequirement> bwRequs) {
    this.bwRequs = bwRequs;
  }

  public EventFilter excepIds(List<ExceptionId> excepIds) {
    this.excepIds = excepIds;
    return this;
  }

  public EventFilter addExcepIdsItem(ExceptionId excepIdsItem) {
    if (this.excepIds == null) {
      this.excepIds = new ArrayList<>();
    }
    this.excepIds.add(excepIdsItem);
    return this;
  }

  /**
   * Get excepIds
   * @return excepIds
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<ExceptionId> getExcepIds() {
    return excepIds;
  }

  public void setExcepIds(List<ExceptionId> excepIds) {
    this.excepIds = excepIds;
  }

  public EventFilter exptAnaType(ExpectedAnalyticsType exptAnaType) {
    this.exptAnaType = exptAnaType;
    return this;
  }

  /**
   * Get exptAnaType
   * @return exptAnaType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ExpectedAnalyticsType getExptAnaType() {
    return exptAnaType;
  }

  public void setExptAnaType(ExpectedAnalyticsType exptAnaType) {
    this.exptAnaType = exptAnaType;
  }

  public EventFilter exptUeBehav(ExpectedUeBehaviourData exptUeBehav) {
    this.exptUeBehav = exptUeBehav;
    return this;
  }

  /**
   * Get exptUeBehav
   * @return exptUeBehav
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ExpectedUeBehaviourData getExptUeBehav() {
    return exptUeBehav;
  }

  public void setExptUeBehav(ExpectedUeBehaviourData exptUeBehav) {
    this.exptUeBehav = exptUeBehav;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventFilter eventFilter = (EventFilter) o;
    return Objects.equals(this.anySlice, eventFilter.anySlice) &&
        Objects.equals(this.snssais, eventFilter.snssais) &&
        Objects.equals(this.appIds, eventFilter.appIds) &&
        Objects.equals(this.dnns, eventFilter.dnns) &&
        Objects.equals(this.dnais, eventFilter.dnais) &&
        Objects.equals(this.networkArea, eventFilter.networkArea) &&
        Objects.equals(this.nfInstanceIds, eventFilter.nfInstanceIds) &&
        Objects.equals(this.nfSetIds, eventFilter.nfSetIds) &&
        Objects.equals(this.nfTypes, eventFilter.nfTypes) &&
        Objects.equals(this.nsiIdInfos, eventFilter.nsiIdInfos) &&
        Objects.equals(this.qosRequ, eventFilter.qosRequ) &&
        Objects.equals(this.nwPerfTypes, eventFilter.nwPerfTypes) &&
        Objects.equals(this.bwRequs, eventFilter.bwRequs) &&
        Objects.equals(this.excepIds, eventFilter.excepIds) &&
        Objects.equals(this.exptAnaType, eventFilter.exptAnaType) &&
        Objects.equals(this.exptUeBehav, eventFilter.exptUeBehav);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anySlice, snssais, appIds, dnns, dnais, networkArea, nfInstanceIds, nfSetIds, nfTypes, nsiIdInfos, qosRequ, nwPerfTypes, bwRequs, excepIds, exptAnaType, exptUeBehav);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventFilter {\n");
    
    sb.append("    anySlice: ").append(toIndentedString(anySlice)).append("\n");
    sb.append("    snssais: ").append(toIndentedString(snssais)).append("\n");
    sb.append("    appIds: ").append(toIndentedString(appIds)).append("\n");
    sb.append("    dnns: ").append(toIndentedString(dnns)).append("\n");
    sb.append("    dnais: ").append(toIndentedString(dnais)).append("\n");
    sb.append("    networkArea: ").append(toIndentedString(networkArea)).append("\n");
    sb.append("    nfInstanceIds: ").append(toIndentedString(nfInstanceIds)).append("\n");
    sb.append("    nfSetIds: ").append(toIndentedString(nfSetIds)).append("\n");
    sb.append("    nfTypes: ").append(toIndentedString(nfTypes)).append("\n");
    sb.append("    nsiIdInfos: ").append(toIndentedString(nsiIdInfos)).append("\n");
    sb.append("    qosRequ: ").append(toIndentedString(qosRequ)).append("\n");
    sb.append("    nwPerfTypes: ").append(toIndentedString(nwPerfTypes)).append("\n");
    sb.append("    bwRequs: ").append(toIndentedString(bwRequs)).append("\n");
    sb.append("    excepIds: ").append(toIndentedString(excepIds)).append("\n");
    sb.append("    exptAnaType: ").append(toIndentedString(exptAnaType)).append("\n");
    sb.append("    exptUeBehav: ").append(toIndentedString(exptUeBehav)).append("\n");
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
