package io.swagger2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LocationArea 
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-10T17:05:17.092123+03:00[Europe/Athens]")

public class LocationArea   {
		  @JsonProperty("geographicAreas")
		  @Valid
		  private List<GeographicArea> geographicAreas = null;

		  @JsonProperty("civicAddresses")
		  @Valid
		  private List<CivicAddress> civicAddresses = null;

		  @JsonProperty("nwAreaInfo")
		  private NetworkAreaInfo nwAreaInfo = null;

		  public LocationArea geographicAreas(List<GeographicArea> geographicAreas) {
		    this.geographicAreas = geographicAreas;
		    return this;
		  }

		  public LocationArea addGeographicAreasItem(GeographicArea geographicAreasItem) {
		    if (this.geographicAreas == null) {
		      this.geographicAreas = new ArrayList<>();
		    }
		    this.geographicAreas.add(geographicAreasItem);
		    return this;
		  }

		  /**
		   * Identifies a list of geographic area of the user where the UE is located.
		   * @return geographicAreas
		  **/
		  @ApiModelProperty(value = "Identifies a list of geographic area of the user where the UE is located.")
		      @Valid
		    public List<GeographicArea> getGeographicAreas() {
		    return geographicAreas;
		  }

		  public void setGeographicAreas(List<GeographicArea> geographicAreas) {
		    this.geographicAreas = geographicAreas;
		  }

		  public LocationArea civicAddresses(List<CivicAddress> civicAddresses) {
		    this.civicAddresses = civicAddresses;
		    return this;
		  }

		  public LocationArea addCivicAddressesItem(CivicAddress civicAddressesItem) {
		    if (this.civicAddresses == null) {
		      this.civicAddresses = new ArrayList<>();
		    }
		    this.civicAddresses.add(civicAddressesItem);
		    return this;
		  }

		  /**
		   * Identifies a list of civic addresses of the user where the UE is located.
		   * @return civicAddresses
		  **/
		  @ApiModelProperty(value = "Identifies a list of civic addresses of the user where the UE is located.")
		      @Valid
		    public List<CivicAddress> getCivicAddresses() {
		    return civicAddresses;
		  }

		  public void setCivicAddresses(List<CivicAddress> civicAddresses) {
		    this.civicAddresses = civicAddresses;
		  }

		  public LocationArea nwAreaInfo(NetworkAreaInfo nwAreaInfo) {
		    this.nwAreaInfo = nwAreaInfo;
		    return this;
		  }

		  /**
		   * Get nwAreaInfo
		   * @return nwAreaInfo
		  **/
		  @ApiModelProperty(value = "")
		  
		    @Valid
		    public NetworkAreaInfo getNwAreaInfo() {
		    return nwAreaInfo;
		  }

		  public void setNwAreaInfo(NetworkAreaInfo nwAreaInfo) {
		    this.nwAreaInfo = nwAreaInfo;
		  }


		  @Override
		  public boolean equals(java.lang.Object o) {
		    if (this == o) {
		      return true;
		    }
		    if (o == null || getClass() != o.getClass()) {
		      return false;
		    }
		    LocationArea locationArea = (LocationArea) o;
		    return Objects.equals(this.geographicAreas, locationArea.geographicAreas) &&
		        Objects.equals(this.civicAddresses, locationArea.civicAddresses) &&
		        Objects.equals(this.nwAreaInfo, locationArea.nwAreaInfo);
		  }

		  @Override
		  public int hashCode() {
		    return Objects.hash(geographicAreas, civicAddresses, nwAreaInfo);
		  }

		  @Override
		  public String toString() {
		    StringBuilder sb = new StringBuilder();
		    sb.append("class LocationArea {\n");
		    
		    sb.append("    geographicAreas: ").append(toIndentedString(geographicAreas)).append("\n");
		    sb.append("    civicAddresses: ").append(toIndentedString(civicAddresses)).append("\n");
		    sb.append("    nwAreaInfo: ").append(toIndentedString(nwAreaInfo)).append("\n");
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