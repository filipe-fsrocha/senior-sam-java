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
 * TimeSlot
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-19T15:38:01.539Z")



public class TimeSlot {
  @SerializedName("saturday")
  private Boolean saturday = null;

  @SerializedName("lastModifiedDate")
  private OffsetDateTime lastModifiedDate = null;

  @SerializedName("lastModifiedBy")
  private String lastModifiedBy = null;

  @SerializedName("thursday")
  private Boolean thursday = null;

  @SerializedName("holiday")
  private Boolean holiday = null;

  @SerializedName("timeSlotList")
  private TimeSlotList timeSlotList = null;

  @SerializedName("endHour")
  private String endHour = null;

  @SerializedName("sunday")
  private Boolean sunday = null;

  @SerializedName("tuesday")
  private Boolean tuesday = null;

  @SerializedName("createdDate")
  private OffsetDateTime createdDate = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("startHour")
  private String startHour = null;

  @SerializedName("wednesday")
  private Boolean wednesday = null;

  @SerializedName("friday")
  private Boolean friday = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("monday")
  private Boolean monday = null;

  public TimeSlot saturday(Boolean saturday) {
    this.saturday = saturday;
    return this;
  }

   /**
   * Sábado
   * @return saturday
  **/
  @ApiModelProperty(value = "Sábado")
  public Boolean isSaturday() {
    return saturday;
  }

  public void setSaturday(Boolean saturday) {
    this.saturday = saturday;
  }

  public TimeSlot lastModifiedDate(OffsetDateTime lastModifiedDate) {
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

  public TimeSlot lastModifiedBy(String lastModifiedBy) {
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

  public TimeSlot thursday(Boolean thursday) {
    this.thursday = thursday;
    return this;
  }

   /**
   * Quinta
   * @return thursday
  **/
  @ApiModelProperty(value = "Quinta")
  public Boolean isThursday() {
    return thursday;
  }

  public void setThursday(Boolean thursday) {
    this.thursday = thursday;
  }

  public TimeSlot holiday(Boolean holiday) {
    this.holiday = holiday;
    return this;
  }

   /**
   * Feriado
   * @return holiday
  **/
  @ApiModelProperty(value = "Feriado")
  public Boolean isHoliday() {
    return holiday;
  }

  public void setHoliday(Boolean holiday) {
    this.holiday = holiday;
  }

  public TimeSlot timeSlotList(TimeSlotList timeSlotList) {
    this.timeSlotList = timeSlotList;
    return this;
  }

   /**
   * Get timeSlotList
   * @return timeSlotList
  **/
  @ApiModelProperty(value = "")
  public TimeSlotList getTimeSlotList() {
    return timeSlotList;
  }

  public void setTimeSlotList(TimeSlotList timeSlotList) {
    this.timeSlotList = timeSlotList;
  }

  public TimeSlot endHour(String endHour) {
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

  public TimeSlot sunday(Boolean sunday) {
    this.sunday = sunday;
    return this;
  }

   /**
   * Domingo
   * @return sunday
  **/
  @ApiModelProperty(value = "Domingo")
  public Boolean isSunday() {
    return sunday;
  }

  public void setSunday(Boolean sunday) {
    this.sunday = sunday;
  }

  public TimeSlot tuesday(Boolean tuesday) {
    this.tuesday = tuesday;
    return this;
  }

   /**
   * Terça
   * @return tuesday
  **/
  @ApiModelProperty(value = "Terça")
  public Boolean isTuesday() {
    return tuesday;
  }

  public void setTuesday(Boolean tuesday) {
    this.tuesday = tuesday;
  }

  public TimeSlot createdDate(OffsetDateTime createdDate) {
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

  public TimeSlot createdBy(String createdBy) {
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

  public TimeSlot startHour(String startHour) {
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

  public TimeSlot wednesday(Boolean wednesday) {
    this.wednesday = wednesday;
    return this;
  }

   /**
   * Quarta
   * @return wednesday
  **/
  @ApiModelProperty(value = "Quarta")
  public Boolean isWednesday() {
    return wednesday;
  }

  public void setWednesday(Boolean wednesday) {
    this.wednesday = wednesday;
  }

  public TimeSlot friday(Boolean friday) {
    this.friday = friday;
    return this;
  }

   /**
   * Sexta
   * @return friday
  **/
  @ApiModelProperty(value = "Sexta")
  public Boolean isFriday() {
    return friday;
  }

  public void setFriday(Boolean friday) {
    this.friday = friday;
  }

  public TimeSlot id(Integer id) {
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

  public TimeSlot monday(Boolean monday) {
    this.monday = monday;
    return this;
  }

   /**
   * Segunda
   * @return monday
  **/
  @ApiModelProperty(value = "Segunda")
  public Boolean isMonday() {
    return monday;
  }

  public void setMonday(Boolean monday) {
    this.monday = monday;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSlot timeSlot = (TimeSlot) o;
    return Objects.equals(this.saturday, timeSlot.saturday) &&
        Objects.equals(this.lastModifiedDate, timeSlot.lastModifiedDate) &&
        Objects.equals(this.lastModifiedBy, timeSlot.lastModifiedBy) &&
        Objects.equals(this.thursday, timeSlot.thursday) &&
        Objects.equals(this.holiday, timeSlot.holiday) &&
        Objects.equals(this.timeSlotList, timeSlot.timeSlotList) &&
        Objects.equals(this.endHour, timeSlot.endHour) &&
        Objects.equals(this.sunday, timeSlot.sunday) &&
        Objects.equals(this.tuesday, timeSlot.tuesday) &&
        Objects.equals(this.createdDate, timeSlot.createdDate) &&
        Objects.equals(this.createdBy, timeSlot.createdBy) &&
        Objects.equals(this.startHour, timeSlot.startHour) &&
        Objects.equals(this.wednesday, timeSlot.wednesday) &&
        Objects.equals(this.friday, timeSlot.friday) &&
        Objects.equals(this.id, timeSlot.id) &&
        Objects.equals(this.monday, timeSlot.monday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saturday, lastModifiedDate, lastModifiedBy, thursday, holiday, timeSlotList, endHour, sunday, tuesday, createdDate, createdBy, startHour, wednesday, friday, id, monday);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSlot {\n");
    
    sb.append("    saturday: ").append(toIndentedString(saturday)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    thursday: ").append(toIndentedString(thursday)).append("\n");
    sb.append("    holiday: ").append(toIndentedString(holiday)).append("\n");
    sb.append("    timeSlotList: ").append(toIndentedString(timeSlotList)).append("\n");
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
    sb.append("    sunday: ").append(toIndentedString(sunday)).append("\n");
    sb.append("    tuesday: ").append(toIndentedString(tuesday)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
    sb.append("    wednesday: ").append(toIndentedString(wednesday)).append("\n");
    sb.append("    friday: ").append(toIndentedString(friday)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    monday: ").append(toIndentedString(monday)).append("\n");
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

