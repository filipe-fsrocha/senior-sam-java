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
import br.com.senior.sam.application.pojos.Role;
import java.io.IOException;

/**
 * RoleAccessCreditRangeList
 */




public class RoleAccessCreditRangeList {
  @SerializedName("accessCreditRangeList")
  private AccessCreditRangeList accessCreditRangeList = null;

  @SerializedName("role")
  private Role role = null;

  @SerializedName("id")
  private Integer id = null;

  public RoleAccessCreditRangeList accessCreditRangeList(AccessCreditRangeList accessCreditRangeList) {
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

  public RoleAccessCreditRangeList role(Role role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")
  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public RoleAccessCreditRangeList id(Integer id) {
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
    RoleAccessCreditRangeList roleAccessCreditRangeList = (RoleAccessCreditRangeList) o;
    return Objects.equals(this.accessCreditRangeList, roleAccessCreditRangeList.accessCreditRangeList) &&
        Objects.equals(this.role, roleAccessCreditRangeList.role) &&
        Objects.equals(this.id, roleAccessCreditRangeList.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessCreditRangeList, role, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleAccessCreditRangeList {\n");
    
    sb.append("    accessCreditRangeList: ").append(toIndentedString(accessCreditRangeList)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

