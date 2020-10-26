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

import org.threeten.bp.LocalDate;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * LocalTimezone
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-19T15:38:01.539Z")



public class LocalTimezone {
  @SerializedName("daylightSavingStartDate")
  private LocalDate daylightSavingStartDate = null;

  @SerializedName("daylightSaving")
  private Boolean daylightSaving = null;

  @SerializedName("timezone")
  private Timezone timezone = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("offsetDaylightSaving")
  private OffsetDaylightSavingType offsetDaylightSaving = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("daylightSavingFinishDate")
  private LocalDate daylightSavingFinishDate = null;

  public LocalTimezone daylightSavingStartDate(LocalDate daylightSavingStartDate) {
    this.daylightSavingStartDate = daylightSavingStartDate;
    return this;
  }

   /**
   * Data início do horário de verão
   * @return daylightSavingStartDate
  **/
  @ApiModelProperty(value = "Data início do horário de verão")
  public LocalDate getDaylightSavingStartDate() {
    return daylightSavingStartDate;
  }

  public void setDaylightSavingStartDate(LocalDate daylightSavingStartDate) {
    this.daylightSavingStartDate = daylightSavingStartDate;
  }

  public LocalTimezone daylightSaving(Boolean daylightSaving) {
    this.daylightSaving = daylightSaving;
    return this;
  }

   /**
   * Horário de verão
   * @return daylightSaving
  **/
  @ApiModelProperty(value = "Horário de verão")
  public Boolean isDaylightSaving() {
    return daylightSaving;
  }

  public void setDaylightSaving(Boolean daylightSaving) {
    this.daylightSaving = daylightSaving;
  }

  public LocalTimezone timezone(Timezone timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(value = "")
  public Timezone getTimezone() {
    return timezone;
  }

  public void setTimezone(Timezone timezone) {
    this.timezone = timezone;
  }

  public LocalTimezone name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome do Local
   * @return name
  **/
  @ApiModelProperty(value = "Nome do Local")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalTimezone offsetDaylightSaving(OffsetDaylightSavingType offsetDaylightSaving) {
    this.offsetDaylightSaving = offsetDaylightSaving;
    return this;
  }

   /**
   * Get offsetDaylightSaving
   * @return offsetDaylightSaving
  **/
  @ApiModelProperty(value = "")
  public OffsetDaylightSavingType getOffsetDaylightSaving() {
    return offsetDaylightSaving;
  }

  public void setOffsetDaylightSaving(OffsetDaylightSavingType offsetDaylightSaving) {
    this.offsetDaylightSaving = offsetDaylightSaving;
  }

  public LocalTimezone id(Integer id) {
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

  public LocalTimezone daylightSavingFinishDate(LocalDate daylightSavingFinishDate) {
    this.daylightSavingFinishDate = daylightSavingFinishDate;
    return this;
  }

   /**
   * Data fim do horário de verão
   * @return daylightSavingFinishDate
  **/
  @ApiModelProperty(value = "Data fim do horário de verão")
  public LocalDate getDaylightSavingFinishDate() {
    return daylightSavingFinishDate;
  }

  public void setDaylightSavingFinishDate(LocalDate daylightSavingFinishDate) {
    this.daylightSavingFinishDate = daylightSavingFinishDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalTimezone localTimezone = (LocalTimezone) o;
    return Objects.equals(this.daylightSavingStartDate, localTimezone.daylightSavingStartDate) &&
        Objects.equals(this.daylightSaving, localTimezone.daylightSaving) &&
        Objects.equals(this.timezone, localTimezone.timezone) &&
        Objects.equals(this.name, localTimezone.name) &&
        Objects.equals(this.offsetDaylightSaving, localTimezone.offsetDaylightSaving) &&
        Objects.equals(this.id, localTimezone.id) &&
        Objects.equals(this.daylightSavingFinishDate, localTimezone.daylightSavingFinishDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daylightSavingStartDate, daylightSaving, timezone, name, offsetDaylightSaving, id, daylightSavingFinishDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalTimezone {\n");
    
    sb.append("    daylightSavingStartDate: ").append(toIndentedString(daylightSavingStartDate)).append("\n");
    sb.append("    daylightSaving: ").append(toIndentedString(daylightSaving)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    offsetDaylightSaving: ").append(toIndentedString(offsetDaylightSaving)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    daylightSavingFinishDate: ").append(toIndentedString(daylightSavingFinishDate)).append("\n");
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
