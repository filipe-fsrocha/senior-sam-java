/*
 * Aplicação
 * Serviço do backend da aplicação do Ronda senior X
 *
 * OpenAPI spec version: 4.10.0
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.sam.application.pojos;

import java.util.Objects;

import org.threeten.bp.OffsetDateTime;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * WorkScheduleSlotTime
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-19T15:38:01.539Z")



public class WorkScheduleSlotTime {
  @SerializedName("endHour")
  private String endHour = null;

  @SerializedName("createdDate")
  private OffsetDateTime createdDate = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("lastModifiedDate")
  private OffsetDateTime lastModifiedDate = null;

  @SerializedName("startHour")
  private String startHour = null;

  @SerializedName("workSchedulePeriod")
  private WorkSchedulePeriod workSchedulePeriod = null;

  @SerializedName("lastModifiedBy")
  private String lastModifiedBy = null;

  @SerializedName("id")
  private Integer id = null;

  public WorkScheduleSlotTime endHour(String endHour) {
    this.endHour = endHour;
    return this;
  }

   /**
   * Hora Final
   * @return endHour
  **/
  @ApiModelProperty(value = "Hora Final")
  public String getEndHour() {
    return endHour;
  }

  public void setEndHour(String endHour) {
    this.endHour = endHour;
  }

  public WorkScheduleSlotTime createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * 
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public WorkScheduleSlotTime createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * 
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public WorkScheduleSlotTime lastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * 
   * @return lastModifiedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public WorkScheduleSlotTime startHour(String startHour) {
    this.startHour = startHour;
    return this;
  }

   /**
   * Hora Inicial
   * @return startHour
  **/
  @ApiModelProperty(value = "Hora Inicial")
  public String getStartHour() {
    return startHour;
  }

  public void setStartHour(String startHour) {
    this.startHour = startHour;
  }

  public WorkScheduleSlotTime workSchedulePeriod(WorkSchedulePeriod workSchedulePeriod) {
    this.workSchedulePeriod = workSchedulePeriod;
    return this;
  }

   /**
   * Get workSchedulePeriod
   * @return workSchedulePeriod
  **/
  @ApiModelProperty(value = "")
  public WorkSchedulePeriod getWorkSchedulePeriod() {
    return workSchedulePeriod;
  }

  public void setWorkSchedulePeriod(WorkSchedulePeriod workSchedulePeriod) {
    this.workSchedulePeriod = workSchedulePeriod;
  }

  public WorkScheduleSlotTime lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * 
   * @return lastModifiedBy
  **/
  @ApiModelProperty(value = "")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public WorkScheduleSlotTime id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(value = "ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkScheduleSlotTime workScheduleSlotTime = (WorkScheduleSlotTime) o;
    return Objects.equals(this.endHour, workScheduleSlotTime.endHour) &&
        Objects.equals(this.createdDate, workScheduleSlotTime.createdDate) &&
        Objects.equals(this.createdBy, workScheduleSlotTime.createdBy) &&
        Objects.equals(this.lastModifiedDate, workScheduleSlotTime.lastModifiedDate) &&
        Objects.equals(this.startHour, workScheduleSlotTime.startHour) &&
        Objects.equals(this.workSchedulePeriod, workScheduleSlotTime.workSchedulePeriod) &&
        Objects.equals(this.lastModifiedBy, workScheduleSlotTime.lastModifiedBy) &&
        Objects.equals(this.id, workScheduleSlotTime.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endHour, createdDate, createdBy, lastModifiedDate, startHour, workSchedulePeriod, lastModifiedBy, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkScheduleSlotTime {\n");
    
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
    sb.append("    workSchedulePeriod: ").append(toIndentedString(workSchedulePeriod)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

