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
import br.com.senior.sam.application.pojos.AccessCreditRange;
import br.com.senior.sam.application.pojos.HolidayList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AccessCreditRangeList
 */




public class AccessCreditRangeList {
  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("holidayList")
  private HolidayList holidayList = null;

  @SerializedName("accessCreditRanges")
  private List<AccessCreditRange> accessCreditRanges = null;

  public AccessCreditRangeList name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome da Lista
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Nome da Lista")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccessCreditRangeList id(Integer id) {
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

  public AccessCreditRangeList holidayList(HolidayList holidayList) {
    this.holidayList = holidayList;
    return this;
  }

   /**
   * Get holidayList
   * @return holidayList
  **/
  @ApiModelProperty(value = "")
  public HolidayList getHolidayList() {
    return holidayList;
  }

  public void setHolidayList(HolidayList holidayList) {
    this.holidayList = holidayList;
  }

  public AccessCreditRangeList accessCreditRanges(List<AccessCreditRange> accessCreditRanges) {
    this.accessCreditRanges = accessCreditRanges;
    return this;
  }

  public AccessCreditRangeList addAccessCreditRangesItem(AccessCreditRange accessCreditRangesItem) {
    if (this.accessCreditRanges == null) {
      this.accessCreditRanges = new ArrayList<AccessCreditRange>();
    }
    this.accessCreditRanges.add(accessCreditRangesItem);
    return this;
  }

   /**
   * Lista de Faixas de Crédito de Acesso
   * @return accessCreditRanges
  **/
  @ApiModelProperty(value = "Lista de Faixas de Crédito de Acesso")
  public List<AccessCreditRange> getAccessCreditRanges() {
    return accessCreditRanges;
  }

  public void setAccessCreditRanges(List<AccessCreditRange> accessCreditRanges) {
    this.accessCreditRanges = accessCreditRanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessCreditRangeList accessCreditRangeList = (AccessCreditRangeList) o;
    return Objects.equals(this.name, accessCreditRangeList.name) &&
        Objects.equals(this.id, accessCreditRangeList.id) &&
        Objects.equals(this.holidayList, accessCreditRangeList.holidayList) &&
        Objects.equals(this.accessCreditRanges, accessCreditRangeList.accessCreditRanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, holidayList, accessCreditRanges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessCreditRangeList {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    holidayList: ").append(toIndentedString(holidayList)).append("\n");
    sb.append("    accessCreditRanges: ").append(toIndentedString(accessCreditRanges)).append("\n");
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

