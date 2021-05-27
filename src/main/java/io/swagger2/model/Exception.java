package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.ExceptionId;
import io.swagger2.model.ExceptionTrend;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Exception
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class Exception   {
  @JsonProperty("excepId")
  private ExceptionId excepId = null;

  @JsonProperty("excepLevel")
  private Integer excepLevel = null;

  @JsonProperty("excepTrend")
  private ExceptionTrend excepTrend = null;

  public Exception excepId(ExceptionId excepId) {
    this.excepId = excepId;
    return this;
  }

  /**
   * Get excepId
   * @return excepId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public ExceptionId getExcepId() {
    return excepId;
  }

  public void setExcepId(ExceptionId excepId) {
    this.excepId = excepId;
  }

  public Exception excepLevel(Integer excepLevel) {
    this.excepLevel = excepLevel;
    return this;
  }

  /**
   * Get excepLevel
   * @return excepLevel
  **/
  @ApiModelProperty(value = "")
  
    public Integer getExcepLevel() {
    return excepLevel;
  }

  public void setExcepLevel(Integer excepLevel) {
    this.excepLevel = excepLevel;
  }

  public Exception excepTrend(ExceptionTrend excepTrend) {
    this.excepTrend = excepTrend;
    return this;
  }

  /**
   * Get excepTrend
   * @return excepTrend
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ExceptionTrend getExcepTrend() {
    return excepTrend;
  }

  public void setExcepTrend(ExceptionTrend excepTrend) {
    this.excepTrend = excepTrend;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Exception exception = (Exception) o;
    return Objects.equals(this.excepId, exception.excepId) &&
        Objects.equals(this.excepLevel, exception.excepLevel) &&
        Objects.equals(this.excepTrend, exception.excepTrend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excepId, excepLevel, excepTrend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Exception {\n");
    
    sb.append("    excepId: ").append(toIndentedString(excepId)).append("\n");
    sb.append("    excepLevel: ").append(toIndentedString(excepLevel)).append("\n");
    sb.append("    excepTrend: ").append(toIndentedString(excepTrend)).append("\n");
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
