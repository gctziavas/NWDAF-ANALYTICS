package io.swagger2.model;

import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SupportedFeatures
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class SupportedFeatures   {
	
	private String serviceExperience = null;
	private String ueMobility = null;
	private String ueCommunication  = null;
	private String  qoSSustainability = null;
	private String abnormalBehaviour = null;
	private String userDataCongestion = null;
	private String nfLoad = null;
	private String networkPerformance = null;
	private String nsiLoad  = null;
	
	

  public String getServiceExperience() {
		return serviceExperience;
	}

	public void setServiceExperience(String serviceExperience) {
		this.serviceExperience = serviceExperience;
	}

	public String getUeMobility() {
		return ueMobility;
	}

	public void setUeMobility(String ueMobility) {
		this.ueMobility = ueMobility;
	}

	public String getUeCommunication() {
		return ueCommunication;
	}

	public void setUeCommunication(String ueCommunication) {
		this.ueCommunication = ueCommunication;
	}

	public String getQoSSustainability() {
		return qoSSustainability;
	}

	public void setQoSSustainability(String qoSSustainability) {
		this.qoSSustainability = qoSSustainability;
	}

	public String getAbnormalBehaviour() {
		return abnormalBehaviour;
	}

	public void setAbnormalBehaviour(String abnormalBehaviour) {
		this.abnormalBehaviour = abnormalBehaviour;
	}

	public String getUserDataCongestion() {
		return userDataCongestion;
	}

	public void setUserDataCongestion(String userDataCongestion) {
		this.userDataCongestion = userDataCongestion;
	}

	public String getNfLoad() {
		return nfLoad;
	}

	public void setNfLoad(String nfLoad) {
		this.nfLoad = nfLoad;
	}

	public String getNetworkPerformance() {
		return networkPerformance;
	}

	public void setNetworkPerformance(String networkPerformance) {
		this.networkPerformance = networkPerformance;
	}

	public String getNsiLoad() {
		return nsiLoad;
	}

	public void setNsiLoad(String nsiLoad) {
		this.nsiLoad = nsiLoad;
	}

	public SupportedFeatures(String supportedFeatures) {
		String pattern = "^[A-Fa-f0-9]{3}$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(supportedFeatures);
		if (m.matches()) {
			int num = (Integer.parseInt(supportedFeatures, 16));
			String supportedFeaturesBin = Integer.toBinaryString(num);
			char[] charArray = supportedFeaturesBin.toCharArray();
			char[] eachSupportedFeature = new char[9];
			//Arrays.fill(eachSupportedFeature, '0');
			//System.out.println(charArray);
			for (int i = 0; i < 9 - charArray.length; i++) {
				eachSupportedFeature[i] = '0';
				//System.out.println(i+": "+ eachSupportedFeature[i]);
			}
			for (int i = 9 - charArray.length; i < 9; i++) {

				eachSupportedFeature[i] = charArray[i - (9 - charArray.length)];
				//System.out.println("eachSupportedFeature["+i+"]"+ ": " + eachSupportedFeature[i]);
			}
			if (eachSupportedFeature[8] == '0') {
				setAbnormalBehaviour("NOT SUPPORTED");
			} else {
				setAbnormalBehaviour("SUPPORTED");
			}
			if (eachSupportedFeature[7] == '0') {
				setNetworkPerformance("NOT SUPPORTED");
			} else {
				setNetworkPerformance("SUPPORTED");
			}
			if (eachSupportedFeature[6] == '0') {
				setNfLoad("NOT SUPPORTED");
			} else {
				setNfLoad("SUPPORTED");
			}
			if (eachSupportedFeature[5] == '0') {
				setNsiLoad("NOT SUPPORTED");
			} else {
				setNsiLoad("SUPPORTED");
			}
			if (eachSupportedFeature[4] == '0') {
				setQoSSustainability("NOT SUPPORTED");
			} else {
				setQoSSustainability("SUPPORTED");
			}
			if (eachSupportedFeature[3] == '0') {
				setServiceExperience("NOT SUPPORTED");
			} else {
				setServiceExperience("SUPPORTED");
			}
			if (eachSupportedFeature[2] == '0') {
				setUeCommunication("NOT SUPPORTED");
			} else {
				setUeCommunication("SUPPORTED");
			}
			if (eachSupportedFeature[1] == '0') {
				setUeMobility("NOT SUPPORTED");
			} else {
				setUeMobility("SUPPORTED");
			}
			if (eachSupportedFeature[0] == '0') {
				setUserDataCongestion("NOT SUPPORTED");
			} else {
				setUserDataCongestion("SUPPORTED");
			} 
		}
		
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
