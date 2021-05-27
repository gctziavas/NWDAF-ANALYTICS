package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasTimeOfDay;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;


/**
 * ScheduledCommunicationTime2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class ScheduledCommunicationTime2   {
  @JsonProperty("daysOfWeek")
  @Valid
  private List<Integer> daysOfWeek = null;

  @JsonProperty("timeOfDayStart")
  private TS29571CommonDataYamlcomponentsschemasTimeOfDay timeOfDayStart = null;

  @JsonProperty("timeOfDayEnd")
  private TS29571CommonDataYamlcomponentsschemasTimeOfDay timeOfDayEnd = null;

  public ScheduledCommunicationTime2 daysOfWeek(List<Integer> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  public ScheduledCommunicationTime2 addDaysOfWeekItem(Integer daysOfWeekItem) {
    if (this.daysOfWeek == null) {
      this.daysOfWeek = new ArrayList<>();
    }
    this.daysOfWeek.add(daysOfWeekItem);
    return this;
  }

  /**
   * Identifies the day(s) of the week. If absent, it indicates every day of the week.
   * @return daysOfWeek
  **/
  @ApiModelProperty(value = "Identifies the day(s) of the week. If absent, it indicates every day of the week.")
  
  @Size(min=1,max=6)   public List<Integer> getDaysOfWeek() {
    return daysOfWeek;
  }

  public void setDaysOfWeek(List<Integer> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }

  public ScheduledCommunicationTime2 timeOfDayStart(TS29571CommonDataYamlcomponentsschemasTimeOfDay timeOfDayStart) {
    this.timeOfDayStart = timeOfDayStart;
    return this;
  }

  /**
   * Get timeOfDayStart
   * @return timeOfDayStart
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TS29571CommonDataYamlcomponentsschemasTimeOfDay getTimeOfDayStart() {
    return timeOfDayStart;
  }

  public void setTimeOfDayStart(TS29571CommonDataYamlcomponentsschemasTimeOfDay timeOfDayStart) {
    this.timeOfDayStart = timeOfDayStart;
  }

  public ScheduledCommunicationTime2 timeOfDayEnd(TS29571CommonDataYamlcomponentsschemasTimeOfDay timeOfDayEnd) {
    this.timeOfDayEnd = timeOfDayEnd;
    return this;
  }

  /**
   * Get timeOfDayEnd
   * @return timeOfDayEnd
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TS29571CommonDataYamlcomponentsschemasTimeOfDay getTimeOfDayEnd() {
    return timeOfDayEnd;
  }

  public void setTimeOfDayEnd(TS29571CommonDataYamlcomponentsschemasTimeOfDay timeOfDayEnd) {
    this.timeOfDayEnd = timeOfDayEnd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduledCommunicationTime2 scheduledCommunicationTime2 = (ScheduledCommunicationTime2) o;
    return Objects.equals(this.daysOfWeek, scheduledCommunicationTime2.daysOfWeek) &&
        Objects.equals(this.timeOfDayStart, scheduledCommunicationTime2.timeOfDayStart) &&
        Objects.equals(this.timeOfDayEnd, scheduledCommunicationTime2.timeOfDayEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysOfWeek, timeOfDayStart, timeOfDayEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledCommunicationTime2 {\n");
    
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
    sb.append("    timeOfDayStart: ").append(toIndentedString(timeOfDayStart)).append("\n");
    sb.append("    timeOfDayEnd: ").append(toIndentedString(timeOfDayEnd)).append("\n");
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
