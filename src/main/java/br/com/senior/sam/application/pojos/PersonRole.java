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
import br.com.senior.sam.application.pojos.Person;
import br.com.senior.sam.application.pojos.PersonRoleSuspension;
import br.com.senior.sam.application.pojos.Role;
import br.com.senior.sam.application.pojos.StatusHistoric;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * PersonRole
 */




public class PersonRole {
  @SerializedName("personRoleSuspensions")
  private List<PersonRoleSuspension> personRoleSuspensions = null;

  @SerializedName("role")
  private Role role = null;

  @SerializedName("endDate")
  private OffsetDateTime endDate = null;

  @SerializedName("person")
  private Person person = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("startDate")
  private OffsetDateTime startDate = null;

  @SerializedName("status")
  private StatusHistoric status = null;

  public PersonRole personRoleSuspensions(List<PersonRoleSuspension> personRoleSuspensions) {
    this.personRoleSuspensions = personRoleSuspensions;
    return this;
  }

  public PersonRole addPersonRoleSuspensionsItem(PersonRoleSuspension personRoleSuspensionsItem) {
    if (this.personRoleSuspensions == null) {
      this.personRoleSuspensions = new ArrayList<PersonRoleSuspension>();
    }
    this.personRoleSuspensions.add(personRoleSuspensionsItem);
    return this;
  }

   /**
   * Suspensões de Papéis
   * @return personRoleSuspensions
  **/
  @ApiModelProperty(value = "Suspensões de Papéis")
  public List<PersonRoleSuspension> getPersonRoleSuspensions() {
    return personRoleSuspensions;
  }

  public void setPersonRoleSuspensions(List<PersonRoleSuspension> personRoleSuspensions) {
    this.personRoleSuspensions = personRoleSuspensions;
  }

  public PersonRole role(Role role) {
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

  public PersonRole endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Data Fim
   * @return endDate
  **/
  @ApiModelProperty(value = "Data Fim")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public PersonRole person(Person person) {
    this.person = person;
    return this;
  }

   /**
   * Get person
   * @return person
  **/
  @ApiModelProperty(value = "")
  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public PersonRole id(Integer id) {
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

  public PersonRole startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Data Início
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "Data Início")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public PersonRole status(StatusHistoric status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusHistoric getStatus() {
    return status;
  }

  public void setStatus(StatusHistoric status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonRole personRole = (PersonRole) o;
    return Objects.equals(this.personRoleSuspensions, personRole.personRoleSuspensions) &&
        Objects.equals(this.role, personRole.role) &&
        Objects.equals(this.endDate, personRole.endDate) &&
        Objects.equals(this.person, personRole.person) &&
        Objects.equals(this.id, personRole.id) &&
        Objects.equals(this.startDate, personRole.startDate) &&
        Objects.equals(this.status, personRole.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personRoleSuspensions, role, endDate, person, id, startDate, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonRole {\n");
    
    sb.append("    personRoleSuspensions: ").append(toIndentedString(personRoleSuspensions)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

