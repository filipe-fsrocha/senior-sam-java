/*
 * Aplicação
 * Serviço do backend da aplicação do Ronda senior X
 *
 *
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.sam.application.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import br.com.senior.sam.application.pojos.AccessCreditRangeList;
import java.io.IOException;

/**
 * AccessCreditRange
 */




public class AccessCreditRange {
  @SerializedName("endHour")
  private String endHour = null;

  @SerializedName("sunday")
  private Boolean sunday = null;

  @SerializedName("accessCreditRangeList")
  private AccessCreditRangeList accessCreditRangeList = null;

  @SerializedName("saturday")
  private Boolean saturday = null;

  @SerializedName("tuesday")
  private Boolean tuesday = null;

  @SerializedName("startHour")
  private String startHour = null;

  @SerializedName("wednesday")
  private Boolean wednesday = null;

  @SerializedName("thursday")
  private Boolean thursday = null;

  @SerializedName("friday")
  private Boolean friday = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("holiday")
  private Boolean holiday = null;

  @SerializedName("monday")
  private Boolean monday = null;

  public AccessCreditRange endHour(String endHour) {
    this.endHour = endHour;
    return this;
  }

   /**
   * Hora Final
   * @return endHour
  **/
  @ApiModelProperty(required = true, value = "Hora Final")
  public String getEndHour() {
    return endHour;
  }

  public void setEndHour(String endHour) {
    this.endHour = endHour;
  }

  public AccessCreditRange sunday(Boolean sunday) {
    this.sunday = sunday;
    return this;
  }

   /**
   * Domingo
   * @return sunday
  **/
  @ApiModelProperty(required = true, value = "Domingo")
  public Boolean isSunday() {
    return sunday;
  }

  public void setSunday(Boolean sunday) {
    this.sunday = sunday;
  }

  public AccessCreditRange accessCreditRangeList(AccessCreditRangeList accessCreditRangeList) {
    this.accessCreditRangeList = accessCreditRangeList;
    return this;
  }

   /**
   * Get accessCreditRangeList
   * @return accessCreditRangeList
  **/
  @ApiModelProperty(value = "")
  public AccessCreditRangeList getAccessCreditRangeList() {
    return accessCreditRangeList;
  }

  public void setAccessCreditRangeList(AccessCreditRangeList accessCreditRangeList) {
    this.accessCreditRangeList = accessCreditRangeList;
  }

  public AccessCreditRange saturday(Boolean saturday) {
    this.saturday = saturday;
    return this;
  }

   /**
   * Sábado
   * @return saturday
  **/
  @ApiModelProperty(required = true, value = "Sábado")
  public Boolean isSaturday() {
    return saturday;
  }

  public void setSaturday(Boolean saturday) {
    this.saturday = saturday;
  }

  public AccessCreditRange tuesday(Boolean tuesday) {
    this.tuesday = tuesday;
    return this;
  }

   /**
   * Terça
   * @return tuesday
  **/
  @ApiModelProperty(required = true, value = "Terça")
  public Boolean isTuesday() {
    return tuesday;
  }

  public void setTuesday(Boolean tuesday) {
    this.tuesday = tuesday;
  }

  public AccessCreditRange startHour(String startHour) {
    this.startHour = startHour;
    return this;
  }

   /**
   * Hora Inicial
   * @return startHour
  **/
  @ApiModelProperty(required = true, value = "Hora Inicial")
  public String getStartHour() {
    return startHour;
  }

  public void setStartHour(String startHour) {
    this.startHour = startHour;
  }

  public AccessCreditRange wednesday(Boolean wednesday) {
    this.wednesday = wednesday;
    return this;
  }

   /**
   * Quarta
   * @return wednesday
  **/
  @ApiModelProperty(required = true, value = "Quarta")
  public Boolean isWednesday() {
    return wednesday;
  }

  public void setWednesday(Boolean wednesday) {
    this.wednesday = wednesday;
  }

  public AccessCreditRange thursday(Boolean thursday) {
    this.thursday = thursday;
    return this;
  }

   /**
   * Quinta
   * @return thursday
  **/
  @ApiModelProperty(required = true, value = "Quinta")
  public Boolean isThursday() {
    return thursday;
  }

  public void setThursday(Boolean thursday) {
    this.thursday = thursday;
  }

  public AccessCreditRange friday(Boolean friday) {
    this.friday = friday;
    return this;
  }

   /**
   * Sexta
   * @return friday
  **/
  @ApiModelProperty(required = true, value = "Sexta")
  public Boolean isFriday() {
    return friday;
  }

  public void setFriday(Boolean friday) {
    this.friday = friday;
  }

  public AccessCreditRange id(Integer id) {
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

  public AccessCreditRange holiday(Boolean holiday) {
    this.holiday = holiday;
    return this;
  }

   /**
   * Feriado
   * @return holiday
  **/
  @ApiModelProperty(required = true, value = "Feriado")
  public Boolean isHoliday() {
    return holiday;
  }

  public void setHoliday(Boolean holiday) {
    this.holiday = holiday;
  }

  public AccessCreditRange monday(Boolean monday) {
    this.monday = monday;
    return this;
  }

   /**
   * Segunda
   * @return monday
  **/
  @ApiModelProperty(required = true, value = "Segunda")
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
    AccessCreditRange accessCreditRange = (AccessCreditRange) o;
    return Objects.equals(this.endHour, accessCreditRange.endHour) &&
        Objects.equals(this.sunday, accessCreditRange.sunday) &&
        Objects.equals(this.accessCreditRangeList, accessCreditRange.accessCreditRangeList) &&
        Objects.equals(this.saturday, accessCreditRange.saturday) &&
        Objects.equals(this.tuesday, accessCreditRange.tuesday) &&
        Objects.equals(this.startHour, accessCreditRange.startHour) &&
        Objects.equals(this.wednesday, accessCreditRange.wednesday) &&
        Objects.equals(this.thursday, accessCreditRange.thursday) &&
        Objects.equals(this.friday, accessCreditRange.friday) &&
        Objects.equals(this.id, accessCreditRange.id) &&
        Objects.equals(this.holiday, accessCreditRange.holiday) &&
        Objects.equals(this.monday, accessCreditRange.monday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endHour, sunday, accessCreditRangeList, saturday, tuesday, startHour, wednesday, thursday, friday, id, holiday, monday);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessCreditRange {\n");
    
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
    sb.append("    sunday: ").append(toIndentedString(sunday)).append("\n");
    sb.append("    accessCreditRangeList: ").append(toIndentedString(accessCreditRangeList)).append("\n");
    sb.append("    saturday: ").append(toIndentedString(saturday)).append("\n");
    sb.append("    tuesday: ").append(toIndentedString(tuesday)).append("\n");
    sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
    sb.append("    wednesday: ").append(toIndentedString(wednesday)).append("\n");
    sb.append("    thursday: ").append(toIndentedString(thursday)).append("\n");
    sb.append("    friday: ").append(toIndentedString(friday)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    holiday: ").append(toIndentedString(holiday)).append("\n");
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

