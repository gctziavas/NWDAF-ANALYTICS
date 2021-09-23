package io.swagger2.model;

import java.util.Arrays;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SupportedFeatures
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class SupportedFeatures   {
	
	private Boolean serviceExperience = null;
	private Boolean ueMobility = null;
	private Boolean ueCommunication  = null;
	private Boolean  qoSSustainability = null;
	private Boolean abnormalBehaviour = null;
	private Boolean userDataCongestion = null;
	private Boolean nfLoad = null;
	private Boolean networkPerformance = null;
	private Boolean nsiLoad  = null;
	
	

  public Boolean getServiceExperience() {
		return serviceExperience;
	}

	public void setServiceExperience(Boolean serviceExperience) {
		this.serviceExperience = serviceExperience;
	}

	public Boolean getUeMobility() {
		return ueMobility;
	}

	public void setUeMobility(Boolean ueMobility) {
		this.ueMobility = ueMobility;
	}

	public Boolean getUeCommunication() {
		return ueCommunication;
	}

	public void setUeCommunication(Boolean ueCommunication) {
		this.ueCommunication = ueCommunication;
	}

	public Boolean getQoSSustainability() {
		return qoSSustainability;
	}

	public void setQoSSustainability(Boolean qoSSustainability) {
		this.qoSSustainability = qoSSustainability;
	}

	public Boolean getAbnormalBehaviour() {
		return abnormalBehaviour;
	}

	public void setAbnormalBehaviour(Boolean abnormalBehaviour) {
		this.abnormalBehaviour = abnormalBehaviour;
	}

	public Boolean getUserDataCongestion() {
		return userDataCongestion;
	}

	public void setUserDataCongestion(Boolean userDataCongestion) {
		this.userDataCongestion = userDataCongestion;
	}

	public Boolean getNfLoad() {
		return nfLoad;
	}

	public void setNfLoad(Boolean nfLoad) {
		this.nfLoad = nfLoad;
	}

	public Boolean getNetworkPerformance() {
		return networkPerformance;
	}

	public void setNetworkPerformance(Boolean networkPerformance) {
		this.networkPerformance = networkPerformance;
	}

	public Boolean getNsiLoad() {
		return nsiLoad;
	}

	public void setNsiLoad(Boolean nsiLoad) {
		this.nsiLoad = nsiLoad;
	}

	public SupportedFeatures(String supportedFeatures) {
		int num = (Integer.parseInt(supportedFeatures, 16));
		String supportedFeaturesBin = Integer.toBinaryString(num);
		char[] charArray = supportedFeaturesBin.toCharArray();
		char[] eachSupportedFeature = new char[9];
		//Arrays.fill(eachSupportedFeature, '0');
		//System.out.println(charArray);
				
		for(int i = 0; i<9-charArray.length; i++) {
			eachSupportedFeature[i] = '0';
			//System.out.println(i+": "+ eachSupportedFeature[i]);
		}
		
		for(int i = 9-charArray.length; i<9; i++) {
			
			eachSupportedFeature[i] = charArray[i -(9- charArray.length)];
			//System.out.println("eachSupportedFeature["+i+"]"+ ": " + eachSupportedFeature[i]);
		}
		
		if(eachSupportedFeature[8] == '0') { setAbnormalBehaviour(false);} else { setAbnormalBehaviour(true); }
		if(eachSupportedFeature[7] == '0') { setNetworkPerformance(false); } else { setNetworkPerformance(true); }
		if(eachSupportedFeature[6] == '0') { setNfLoad(false); } else { setNfLoad(true); }
		if(eachSupportedFeature[5] == '0') { setNsiLoad(false); } else { setNsiLoad(true); }
		if(eachSupportedFeature[4] == '0') { setQoSSustainability(false); } else { setQoSSustainability(true); }
		if(eachSupportedFeature[3] == '0') { setServiceExperience(false); } else { setServiceExperience(true); }
		if(eachSupportedFeature[2] == '0') { setUeCommunication(false); } else { setUeCommunication(true); }
		if(eachSupportedFeature[1] == '0') { setUeMobility(false); } else { setUeMobility(true); }
		if(eachSupportedFeature[0] == '0') { setUserDataCongestion(false); } else { setUserDataCongestion(true); }
		
		//System.out.println(getAbnormalBehaviour());
		//System.out.println(getNetworkPerformance());
		//System.out.println(getNfLoad());
		//System.out.println(getNsiLoad());
				
	}
	
	
@Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedFeatures {\n");
    
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
