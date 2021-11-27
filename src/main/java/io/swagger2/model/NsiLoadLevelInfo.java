package io.swagger2.model;

import java.io.File;
import java.nio.file.Files;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.Path;
import io.swagger2.api.ReadFileIntoList;
import io.swagger2.model.Snssai;

import org.springframework.util.backoff.BackOffExecution;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the slice instance and the load level information.
 */
@ApiModel(description = "Represents the slice instance and the load level information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class NsiLoadLevelInfo   {
  @JsonProperty("loadLevelInformation")
  private Integer loadLevelInformation = null;

  @JsonProperty("snssai")
  // an valw @   Json Back Reference to trexei alla den mou gyrizei to snssai
  private Snssai snssai = null;
  //private String snssai = null;
  
  @JsonProperty("nsiId")
  private String nsiId = null;

  public NsiLoadLevelInfo loadLevelInformation(Integer loadLevelInformation) {
    this.loadLevelInformation = loadLevelInformation;
    return this;
  }

  /**
   * Get loadLevelInformation
   * @return loadLevelInformation
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getLoadLevelInformation() {
    return loadLevelInformation;
  }

  public void setLoadLevelInformation(Integer loadLevelInformation) {
    this.loadLevelInformation = loadLevelInformation;
  }
  
  /**
   * Get snssai
   * @return snssai
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Snssai getSnssai() {
    //public String getSnssai() {
    return snssai;
  }
  public void setSnssai(Snssai snssai) {
  //public void setSnssai(String snssai) {
    this.snssai = snssai;
  }

  public NsiLoadLevelInfo nsiId(String nsiId) {
    this.nsiId = nsiId;
    return this;
  }
  
  public NsiLoadLevelInfo(Snssai givenSnssai) {

		String file = "/home/gctz/Desktop/data/"+givenSnssai.toString2();
		//String snssaiIn = givenSnssai.toString2();
		Snssai snssaiIn = givenSnssai; 
		this.snssai = snssaiIn;
		File tempFile = new File(file);
		if (tempFile.exists()) {
			List<String> loadLevels = new ReadFileIntoList().readFileInList(file);
			String lastItem = loadLevels.get(loadLevels.size() - 1);
			String[] lastLoad = lastItem.split(" ");
			int newLoadInfo = Integer.parseInt(lastLoad[1].toString());
			this.loadLevelInformation = newLoadInfo;
		}
		else {
			this.loadLevelInformation = 1000;
		}
	}
  
  
  public NsiLoadLevelInfo(Snssai givenSnssai, OffsetDateTime startTs) {

		String file = "/home/gctz/Desktop/data/"+givenSnssai.toString2();
		//String snssaiIn = givenSnssai.toString2();
		Snssai snssaiIn = givenSnssai;
		File tempFile = new File(file);

		if (tempFile.exists()) {
			List<String> loadLevels = new ReadFileIntoList().readFileInList(file);
			ArrayList<OffsetDateTime> times = new ArrayList<OffsetDateTime>();
			ArrayList<Integer> loads = new ArrayList<Integer>();
			int loadLevelSum = 0;
			int counter = 0;
			for (int i = 0; i < loadLevels.size(); i++) {
				OffsetDateTime time = OffsetDateTime.parse(loadLevels.get(i).split(" ")[0],
						DateTimeFormatter.ISO_OFFSET_DATE_TIME);
				Integer load = Integer.parseInt(loadLevels.get(i).split(" ")[1]);
				loads.add(i, load);
				times.add(i, time);
				if (startTs.compareTo(times.get(i)) <= 0) {
					loadLevelSum = loadLevelSum + load;
					counter++;
					//System.out.println("TimeDif="+startTs.compareTo(times.get(i))+" loadLevelSum="+loadLevelSum+" Load="+load+" Counter"+ counter);
				}
			}
			if (counter != 0) {
				this.loadLevelInformation = loadLevelSum / counter;
			}
			this.snssai = snssaiIn;
		}
		else {
			this.snssai = snssaiIn;
			this.loadLevelInformation = 1000;
		}
	}
  
  
  public NsiLoadLevelInfo(Snssai givenSnssai, OffsetDateTime startTs, OffsetDateTime endTs) {

		this.loadLevelInformation = 1000;
		String file = "/home/gctz/Desktop/data/"+givenSnssai.toString2();
		//String snssaiIn = givenSnssai.toString2();
		Snssai snssaiIn = givenSnssai;
		File tempFile = new File(file);

		if (tempFile.exists()) {
			List<String> loadLevels = new ReadFileIntoList().readFileInList(file);
			ArrayList<OffsetDateTime> times = new ArrayList<OffsetDateTime>();
			ArrayList<Integer> loads = new ArrayList<Integer>();
			int loadLevelSum = 0;
			int counter = 0;
			for (int i = 0; i < loadLevels.size(); i++) {
				OffsetDateTime time = OffsetDateTime.parse(loadLevels.get(i).split(" ")[0],
						DateTimeFormatter.ISO_OFFSET_DATE_TIME);
				Integer load = Integer.parseInt(loadLevels.get(i).split(" ")[1]);
				loads.add(i, load);
				times.add(i, time);
				if (startTs.compareTo(times.get(i)) <= 0 && endTs.compareTo(times.get(i)) >= 0) {
					loadLevelSum = loadLevelSum + load;
					counter++;
					//System.out.println("Counter" + counter + "Snssai= "+snssaiIn );
				}
			}
			if (counter != 0) {
				this.loadLevelInformation = loadLevelSum / counter;
			}
			this.snssai = snssaiIn;
		}
		else {
			this.snssai = snssaiIn;
			this.loadLevelInformation = 1000;
		}
	}
  
  
  public NsiLoadLevelInfo(Snssai givenSnssai, String givenNsiId) {

			int loadLevelInfo = 1000;
			String file = "/home/gctz/Desktop/data/"+givenSnssai.toString2();
			//String snssaiIn = givenSnssai.toString2();
			Snssai snssaiIn = givenSnssai;
			File tempFile = new File(file);

			if (tempFile.exists()) {
				List<String> loadLevels = new ReadFileIntoList().readFileInList(file);
				for (int i = 0; i < loadLevels.size(); i++) {
					List<String> nsiLevels = Arrays.asList(loadLevels.get(i).split(" "));
					for (int j = 1; j < nsiLevels.size(); j++) {
						String currentNsi = nsiLevels.get(j).split("-")[0];
						//System.out.println("CurrentNsi= "+currentNsi+ " GivenNsi= "+givenNsiId + "T/F" + currentNsi.equals(givenNsiId));
						if (currentNsi.equals(givenNsiId)) {
							int currentNsiLoadLevel = Integer.parseInt(nsiLevels.get(j).split("-")[1]);
							loadLevelInfo = currentNsiLoadLevel;
							//System.out.println("CurrentNsi= "+currentNsi+ " LoadLevel= "+currentNsiLoadLevel);
						}
					}
				}
				this.snssai = snssaiIn;
				this.loadLevelInformation = loadLevelInfo;
				this.nsiId = givenNsiId;
			}
			else {
				this.snssai = snssaiIn;
				this.loadLevelInformation = 1000;
				this.nsiId = givenNsiId;
			}
		}
	  
  
  public NsiLoadLevelInfo(Snssai givenSnssai, String givenNsiId, OffsetDateTime startTs) {

			int loadLevelInfo = 1000;
			ArrayList <OffsetDateTime> times = new ArrayList<OffsetDateTime>();
			String file = "/home/gctz/Desktop/data/" + givenSnssai.toString2();
			//String snssaiIn = givenSnssai.toString2();
			Snssai snssaiIn = givenSnssai;
			File tempFile = new File(file);
			if (tempFile.exists()) {
				
				List<String> loadLevels = new ReadFileIntoList().readFileInList(file);
				int loadLevelSum = 0;
				int counter = 0;
				for (int i = 0; i < loadLevels.size(); i++) {
					List<String> nsiLevels = Arrays.asList(loadLevels.get(i).split(" "));
					OffsetDateTime time = OffsetDateTime.parse(loadLevels.get(i).split(" ")[0],
							DateTimeFormatter.ISO_OFFSET_DATE_TIME);
					times.add(i, time);
					if (startTs.compareTo(times.get(i)) <= 0) {
						for (int j = 1; j < nsiLevels.size(); j++) {
							String currentNsi = nsiLevels.get(j).split("-")[0];
							//System.out.println("CurrentNsi= "+currentNsi+ " GivenNsi= "+givenNsiId + "T/F" + currentNsi.equals(givenNsiId));
							if (currentNsi.equals(givenNsiId)) {
								int currentNsiLoadLevel = Integer.parseInt(nsiLevels.get(j).split("-")[1]);
								loadLevelSum = loadLevelSum + currentNsiLoadLevel;
								counter++;
								//System.out.println("-------Counter: "+ counter+ "CurrentNsi: " +currentNsi);
								//System.out.println("TimeDif=" + startTs.compareTo(times.get(i)) + " loadLevelSum="
								//		+ loadLevelSum + " Load=" + currentNsiLoadLevel + " Counter" + counter);
							}
						}
					}
				}
				if (counter != 0) {
					loadLevelInfo = loadLevelSum / counter;
				}
				this.snssai = snssaiIn;
				//this.snssai = new Snssai(snssaiIn);
				this.loadLevelInformation = loadLevelInfo;
				setNsiId(givenNsiId);
			}
			else {
				this.snssai = snssaiIn;
				this.loadLevelInformation = 1000;
				setNsiId(givenNsiId);
			}
		
	  }
  public NsiLoadLevelInfo(Snssai givenSnssai, String givenNsiId, OffsetDateTime startTs, OffsetDateTime endTs) {

			int loadLevelInfo = 1000;
			ArrayList <OffsetDateTime> times = new ArrayList<OffsetDateTime>();
			String file = "/home/gctz/Desktop/data/"+givenSnssai.toString2();
		//	String snssaiIn = givenSnssai.toString2();
			Snssai snssaiIn = givenSnssai;
			File tempFile = new File(file);
			if (tempFile.exists()) {
				List<String> loadLevels = new ReadFileIntoList().readFileInList(file);
				int loadLevelSum = 0;
				int counter = 0;
				for (int i = 0; i < loadLevels.size(); i++) {
					List<String> nsiLevels = Arrays.asList(loadLevels.get(i).split(" "));
					OffsetDateTime time = OffsetDateTime.parse(loadLevels.get(i).split(" ")[0],
							DateTimeFormatter.ISO_OFFSET_DATE_TIME);
					times.add(i, time);
					if (startTs.compareTo(times.get(i)) <= 0 && endTs.compareTo(times.get(i)) >= 0) {
						for (int j = 1; j < nsiLevels.size(); j++) {
							String currentNsi = nsiLevels.get(j).split("-")[0];
							//System.out.println("CurrentNsi= "+currentNsi+ " GivenNsi= "+givenNsiId + "T/F" + currentNsi.equals(givenNsiId));
							if (currentNsi.equals(givenNsiId)) {
								int currentNsiLoadLevel = Integer.parseInt(nsiLevels.get(j).split("-")[1]);
								loadLevelSum = loadLevelSum + currentNsiLoadLevel;
								counter++;
								//System.out.println("Counter: "+ counter+ "CurrentNsi: " +currentNsi);
							}
						}
					}
				}
				if (counter != 0) {
					loadLevelInfo = loadLevelSum / counter;
				}
				this.snssai = snssaiIn;
				//this.snssai = new Snssai(snssaiIn);
				this.loadLevelInformation = loadLevelInfo;
				setNsiId(givenNsiId);
			}
			else {
				this.snssai = snssaiIn;
				//this.snssai = new Snssai(snssaiIn);
				this.loadLevelInformation = 1000;
				setNsiId(givenNsiId);
			}
		}
	  
  
  public ArrayList<NsiLoadLevelInfo> snssaisToNsiLoadLevelList(ArrayList<Snssai> givenSnssais){
	  ArrayList<NsiLoadLevelInfo> output = new ArrayList<>();
	  for(int i=0; i<givenSnssais.size(); i++) {
		  NsiLoadLevelInfo s = new NsiLoadLevelInfo(givenSnssais.get(i));
		  output.add(s);
	  }
	  return output;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NsiLoadLevelInfo nsiLoadLevelInfo = (NsiLoadLevelInfo) o;
    return Objects.equals(this.loadLevelInformation, nsiLoadLevelInfo.loadLevelInformation) &&
        Objects.equals(this.snssai, nsiLoadLevelInfo.snssai) &&
        Objects.equals(this.nsiId, nsiLoadLevelInfo.nsiId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadLevelInformation, snssai, nsiId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NsiLoadLevelInfo {\n");
    
    sb.append("    loadLevelInformation: ").append(toIndentedString(loadLevelInformation)).append("\n");
    sb.append("    snssai: ").append(toIndentedString(snssai)).append("\n");
    sb.append("    nsiId: ").append(toIndentedString(nsiId)).append("\n");
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
