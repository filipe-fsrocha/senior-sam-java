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
import br.com.senior.sam.application.pojos.PersonRole;
import br.com.senior.sam.application.pojos.RoleAccessCreditRangeList;
import br.com.senior.sam.application.pojos.RoleAccessDevice;
import br.com.senior.sam.application.pojos.RoleAccessPhysicalLocation;
import br.com.senior.sam.application.pojos.RoleAuthorizePhysicalLocation;
import br.com.senior.sam.application.pojos.RoleAuthorizeRole;
import br.com.senior.sam.application.pojos.ValidationSetup;
import br.com.senior.sam.application.pojos.WorkSchedule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Role
 */




public class Role {
  @SerializedName("inBetweenWorkdaysToleranceInMinutes")
  private Integer inBetweenWorkdaysToleranceInMinutes = null;

  @SerializedName("personRoles")
  private List<PersonRole> personRoles = null;

  @SerializedName("workSchedule")
  private WorkSchedule workSchedule = null;

  @SerializedName("timeSlotValidation")
  private ValidationSetup timeSlotValidation = null;

  @SerializedName("authorizerRoles")
  private List<RoleAuthorizeRole> authorizerRoles = null;

  @SerializedName("inBetweenWorkdaysTimeInHours")
  private Integer inBetweenWorkdaysTimeInHours = null;

  @SerializedName("integrated")
  private Boolean integrated = null;

  @SerializedName("customValidationUrl")
  private String customValidationUrl = null;

  @SerializedName("inheritSuspensionByImportedRole")
  private Boolean inheritSuspensionByImportedRole = null;

  @SerializedName("roleAuthorizerValidation")
  private ValidationSetup roleAuthorizerValidation = null;

  @SerializedName("receiveVisit")
  private Boolean receiveVisit = null;

  @SerializedName("roleAuthorizePhysicalLocations")
  private List<RoleAuthorizePhysicalLocation> roleAuthorizePhysicalLocations = null;

  @SerializedName("authorizedRoles")
  private List<RoleAuthorizeRole> authorizedRoles = null;

  @SerializedName("roleAccessCreditRangeLists")
  private List<RoleAccessCreditRangeList> roleAccessCreditRangeLists = null;

  @SerializedName("customValidation")
  private ValidationSetup customValidation = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("levelValidation")
  private ValidationSetup levelValidation = null;

  @SerializedName("inBetweenWorkdaysValidation")
  private ValidationSetup inBetweenWorkdaysValidation = null;

  @SerializedName("workScheduleValidation")
  private ValidationSetup workScheduleValidation = null;

  @SerializedName("roleAccessPhysicalLocations")
  private List<RoleAccessPhysicalLocation> roleAccessPhysicalLocations = null;

  @SerializedName("antiPassbackValidation")
  private ValidationSetup antiPassbackValidation = null;

  @SerializedName("roleAccessDevices")
  private List<RoleAccessDevice> roleAccessDevices = null;

  @SerializedName("usedByProvisory")
  private Boolean usedByProvisory = null;

  @SerializedName("creditAccessValidation")
  private ValidationSetup creditAccessValidation = null;

  @SerializedName("physicalLocationAuthorizerValidation")
  private ValidationSetup physicalLocationAuthorizerValidation = null;

  @SerializedName("physicalLocationValidation")
  private ValidationSetup physicalLocationValidation = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("stockingValidation")
  private ValidationSetup stockingValidation = null;

  @SerializedName("parkingSpaceValidation")
  private ValidationSetup parkingSpaceValidation = null;

  public Role inBetweenWorkdaysToleranceInMinutes(Integer inBetweenWorkdaysToleranceInMinutes) {
    this.inBetweenWorkdaysToleranceInMinutes = inBetweenWorkdaysToleranceInMinutes;
    return this;
  }

   /**
   * Tempo em minutos para tolerância da validação de interjornada
   * @return inBetweenWorkdaysToleranceInMinutes
  **/
  @ApiModelProperty(value = "Tempo em minutos para tolerância da validação de interjornada")
  public Integer getInBetweenWorkdaysToleranceInMinutes() {
    return inBetweenWorkdaysToleranceInMinutes;
  }

  public void setInBetweenWorkdaysToleranceInMinutes(Integer inBetweenWorkdaysToleranceInMinutes) {
    this.inBetweenWorkdaysToleranceInMinutes = inBetweenWorkdaysToleranceInMinutes;
  }

  public Role personRoles(List<PersonRole> personRoles) {
    this.personRoles = personRoles;
    return this;
  }

  public Role addPersonRolesItem(PersonRole personRolesItem) {
    if (this.personRoles == null) {
      this.personRoles = new ArrayList<PersonRole>();
    }
    this.personRoles.add(personRolesItem);
    return this;
  }

   /**
   * Relação Pessoa Papel
   * @return personRoles
  **/
  @ApiModelProperty(value = "Relação Pessoa Papel")
  public List<PersonRole> getPersonRoles() {
    return personRoles;
  }

  public void setPersonRoles(List<PersonRole> personRoles) {
    this.personRoles = personRoles;
  }

  public Role workSchedule(WorkSchedule workSchedule) {
    this.workSchedule = workSchedule;
    return this;
  }

   /**
   * Get workSchedule
   * @return workSchedule
  **/
  @ApiModelProperty(value = "")
  public WorkSchedule getWorkSchedule() {
    return workSchedule;
  }

  public void setWorkSchedule(WorkSchedule workSchedule) {
    this.workSchedule = workSchedule;
  }

  public Role timeSlotValidation(ValidationSetup timeSlotValidation) {
    this.timeSlotValidation = timeSlotValidation;
    return this;
  }

   /**
   * Get timeSlotValidation
   * @return timeSlotValidation
  **/
  @ApiModelProperty(required = true, value = "")
  public ValidationSetup getTimeSlotValidation() {
    return timeSlotValidation;
  }

  public void setTimeSlotValidation(ValidationSetup timeSlotValidation) {
    this.timeSlotValidation = timeSlotValidation;
  }

  public Role authorizerRoles(List<RoleAuthorizeRole> authorizerRoles) {
    this.authorizerRoles = authorizerRoles;
    return this;
  }

  public Role addAuthorizerRolesItem(RoleAuthorizeRole authorizerRolesItem) {
    if (this.authorizerRoles == null) {
      this.authorizerRoles = new ArrayList<RoleAuthorizeRole>();
    }
    this.authorizerRoles.add(authorizerRolesItem);
    return this;
  }

   /**
   * Relação dos Papéis Autorizadores
   * @return authorizerRoles
  **/
  @ApiModelProperty(value = "Relação dos Papéis Autorizadores")
  public List<RoleAuthorizeRole> getAuthorizerRoles() {
    return authorizerRoles;
  }

  public void setAuthorizerRoles(List<RoleAuthorizeRole> authorizerRoles) {
    this.authorizerRoles = authorizerRoles;
  }

  public Role inBetweenWorkdaysTimeInHours(Integer inBetweenWorkdaysTimeInHours) {
    this.inBetweenWorkdaysTimeInHours = inBetweenWorkdaysTimeInHours;
    return this;
  }

   /**
   * Tempo em horas da validação de interjornada
   * @return inBetweenWorkdaysTimeInHours
  **/
  @ApiModelProperty(value = "Tempo em horas da validação de interjornada")
  public Integer getInBetweenWorkdaysTimeInHours() {
    return inBetweenWorkdaysTimeInHours;
  }

  public void setInBetweenWorkdaysTimeInHours(Integer inBetweenWorkdaysTimeInHours) {
    this.inBetweenWorkdaysTimeInHours = inBetweenWorkdaysTimeInHours;
  }

  public Role integrated(Boolean integrated) {
    this.integrated = integrated;
    return this;
  }

   /**
   * Integrado com Ronda Senior
   * @return integrated
  **/
  @ApiModelProperty(required = true, value = "Integrado com Ronda Senior")
  public Boolean isIntegrated() {
    return integrated;
  }

  public void setIntegrated(Boolean integrated) {
    this.integrated = integrated;
  }

  public Role customValidationUrl(String customValidationUrl) {
    this.customValidationUrl = customValidationUrl;
    return this;
  }

   /**
   * Url de Validação Customizada
   * @return customValidationUrl
  **/
  @ApiModelProperty(value = "Url de Validação Customizada")
  public String getCustomValidationUrl() {
    return customValidationUrl;
  }

  public void setCustomValidationUrl(String customValidationUrl) {
    this.customValidationUrl = customValidationUrl;
  }

  public Role inheritSuspensionByImportedRole(Boolean inheritSuspensionByImportedRole) {
    this.inheritSuspensionByImportedRole = inheritSuspensionByImportedRole;
    return this;
  }

   /**
   * Herdar Suspensões de Papéis Importados
   * @return inheritSuspensionByImportedRole
  **/
  @ApiModelProperty(value = "Herdar Suspensões de Papéis Importados")
  public Boolean isInheritSuspensionByImportedRole() {
    return inheritSuspensionByImportedRole;
  }

  public void setInheritSuspensionByImportedRole(Boolean inheritSuspensionByImportedRole) {
    this.inheritSuspensionByImportedRole = inheritSuspensionByImportedRole;
  }

  public Role roleAuthorizerValidation(ValidationSetup roleAuthorizerValidation) {
    this.roleAuthorizerValidation = roleAuthorizerValidation;
    return this;
  }

   /**
   * Get roleAuthorizerValidation
   * @return roleAuthorizerValidation
  **/
  @ApiModelProperty(required = true, value = "")
  public ValidationSetup getRoleAuthorizerValidation() {
    return roleAuthorizerValidation;
  }

  public void setRoleAuthorizerValidation(ValidationSetup roleAuthorizerValidation) {
    this.roleAuthorizerValidation = roleAuthorizerValidation;
  }

  public Role receiveVisit(Boolean receiveVisit) {
    this.receiveVisit = receiveVisit;
    return this;
  }

   /**
   * Papel que Recebe Visita
   * @return receiveVisit
  **/
  @ApiModelProperty(required = true, value = "Papel que Recebe Visita")
  public Boolean isReceiveVisit() {
    return receiveVisit;
  }

  public void setReceiveVisit(Boolean receiveVisit) {
    this.receiveVisit = receiveVisit;
  }

  public Role roleAuthorizePhysicalLocations(List<RoleAuthorizePhysicalLocation> roleAuthorizePhysicalLocations) {
    this.roleAuthorizePhysicalLocations = roleAuthorizePhysicalLocations;
    return this;
  }

  public Role addRoleAuthorizePhysicalLocationsItem(RoleAuthorizePhysicalLocation roleAuthorizePhysicalLocationsItem) {
    if (this.roleAuthorizePhysicalLocations == null) {
      this.roleAuthorizePhysicalLocations = new ArrayList<RoleAuthorizePhysicalLocation>();
    }
    this.roleAuthorizePhysicalLocations.add(roleAuthorizePhysicalLocationsItem);
    return this;
  }

   /**
   * Relação de Papel que Autoriza Local Físico
   * @return roleAuthorizePhysicalLocations
  **/
  @ApiModelProperty(value = "Relação de Papel que Autoriza Local Físico")
  public List<RoleAuthorizePhysicalLocation> getRoleAuthorizePhysicalLocations() {
    return roleAuthorizePhysicalLocations;
  }

  public void setRoleAuthorizePhysicalLocations(List<RoleAuthorizePhysicalLocation> roleAuthorizePhysicalLocations) {
    this.roleAuthorizePhysicalLocations = roleAuthorizePhysicalLocations;
  }

  public Role authorizedRoles(List<RoleAuthorizeRole> authorizedRoles) {
    this.authorizedRoles = authorizedRoles;
    return this;
  }

  public Role addAuthorizedRolesItem(RoleAuthorizeRole authorizedRolesItem) {
    if (this.authorizedRoles == null) {
      this.authorizedRoles = new ArrayList<RoleAuthorizeRole>();
    }
    this.authorizedRoles.add(authorizedRolesItem);
    return this;
  }

   /**
   * Relação dos Papéis Autorizados
   * @return authorizedRoles
  **/
  @ApiModelProperty(value = "Relação dos Papéis Autorizados")
  public List<RoleAuthorizeRole> getAuthorizedRoles() {
    return authorizedRoles;
  }

  public void setAuthorizedRoles(List<RoleAuthorizeRole> authorizedRoles) {
    this.authorizedRoles = authorizedRoles;
  }

  public Role roleAccessCreditRangeLists(List<RoleAccessCreditRangeList> roleAccessCreditRangeLists) {
    this.roleAccessCreditRangeLists = roleAccessCreditRangeLists;
    return this;
  }

  public Role addRoleAccessCreditRangeListsItem(RoleAccessCreditRangeList roleAccessCreditRangeListsItem) {
    if (this.roleAccessCreditRangeLists == null) {
      this.roleAccessCreditRangeLists = new ArrayList<RoleAccessCreditRangeList>();
    }
    this.roleAccessCreditRangeLists.add(roleAccessCreditRangeListsItem);
    return this;
  }

   /**
   * Relação Papel Lista de Faixas de Crédito de Acesso
   * @return roleAccessCreditRangeLists
  **/
  @ApiModelProperty(value = "Relação Papel Lista de Faixas de Crédito de Acesso")
  public List<RoleAccessCreditRangeList> getRoleAccessCreditRangeLists() {
    return roleAccessCreditRangeLists;
  }

  public void setRoleAccessCreditRangeLists(List<RoleAccessCreditRangeList> roleAccessCreditRangeLists) {
    this.roleAccessCreditRangeLists = roleAccessCreditRangeLists;
  }

  public Role customValidation(ValidationSetup customValidation) {
    this.customValidation = customValidation;
    return this;
  }

   /**
   * Get customValidation
   * @return customValidation
  **/
  @ApiModelProperty(required = true, value = "")
  public ValidationSetup getCustomValidation() {
    return customValidation;
  }

  public void setCustomValidation(ValidationSetup customValidation) {
    this.customValidation = customValidation;
  }

  public Role id(Integer id) {
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

  public Role levelValidation(ValidationSetup levelValidation) {
    this.levelValidation = levelValidation;
    return this;
  }

   /**
   * Get levelValidation
   * @return levelValidation
  **/
  @ApiModelProperty(required = true, value = "")
  public ValidationSetup getLevelValidation() {
    return levelValidation;
  }

  public void setLevelValidation(ValidationSetup levelValidation) {
    this.levelValidation = levelValidation;
  }

  public Role inBetweenWorkdaysValidation(ValidationSetup inBetweenWorkdaysValidation) {
    this.inBetweenWorkdaysValidation = inBetweenWorkdaysValidation;
    return this;
  }

   /**
   * Get inBetweenWorkdaysValidation
   * @return inBetweenWorkdaysValidation
  **/
  @ApiModelProperty(required = true, value = "")
  public ValidationSetup getInBetweenWorkdaysValidation() {
    return inBetweenWorkdaysValidation;
  }

  public void setInBetweenWorkdaysValidation(ValidationSetup inBetweenWorkdaysValidation) {
    this.inBetweenWorkdaysValidation = inBetweenWorkdaysValidation;
  }

  public Role workScheduleValidation(ValidationSetup workScheduleValidation) {
    this.workScheduleValidation = workScheduleValidation;
    return this;
  }

   /**
   * Get workScheduleValidation
   * @return workScheduleValidation
  **/
  @ApiModelProperty(required = true, value = "")
  public ValidationSetup getWorkScheduleValidation() {
    return workScheduleValidation;
  }

  public void setWorkScheduleValidation(ValidationSetup workScheduleValidation) {
    this.workScheduleValidation = workScheduleValidation;
  }

  public Role roleAccessPhysicalLocations(List<RoleAccessPhysicalLocation> roleAccessPhysicalLocations) {
    this.roleAccessPhysicalLocations = roleAccessPhysicalLocations;
    return this;
  }

  public Role addRoleAccessPhysicalLocationsItem(RoleAccessPhysicalLocation roleAccessPhysicalLocationsItem) {
    if (this.roleAccessPhysicalLocations == null) {
      this.roleAccessPhysicalLocations = new ArrayList<RoleAccessPhysicalLocation>();
    }
    this.roleAccessPhysicalLocations.add(roleAccessPhysicalLocationsItem);
    return this;
  }

   /**
   * Relação de Papel que Acessa o Local Físico
   * @return roleAccessPhysicalLocations
  **/
  @ApiModelProperty(value = "Relação de Papel que Acessa o Local Físico")
  public List<RoleAccessPhysicalLocation> getRoleAccessPhysicalLocations() {
    return roleAccessPhysicalLocations;
  }

  public void setRoleAccessPhysicalLocations(List<RoleAccessPhysicalLocation> roleAccessPhysicalLocations) {
    this.roleAccessPhysicalLocations = roleAccessPhysicalLocations;
  }

  public Role antiPassbackValidation(ValidationSetup antiPassbackValidation) {
    this.antiPassbackValidation = antiPassbackValidation;
    return this;
  }

   /**
   * Get antiPassbackValidation
   * @return antiPassbackValidation
  **/
  @ApiModelProperty(required = true, value = "")
  public ValidationSetup getAntiPassbackValidation() {
    return antiPassbackValidation;
  }

  public void setAntiPassbackValidation(ValidationSetup antiPassbackValidation) {
    this.antiPassbackValidation = antiPassbackValidation;
  }

  public Role roleAccessDevices(List<RoleAccessDevice> roleAccessDevices) {
    this.roleAccessDevices = roleAccessDevices;
    return this;
  }

  public Role addRoleAccessDevicesItem(RoleAccessDevice roleAccessDevicesItem) {
    if (this.roleAccessDevices == null) {
      this.roleAccessDevices = new ArrayList<RoleAccessDevice>();
    }
    this.roleAccessDevices.add(roleAccessDevicesItem);
    return this;
  }

   /**
   * Relação de Papel que Acessa o Dispositivo
   * @return roleAccessDevices
  **/
  @ApiModelProperty(value = "Relação de Papel que Acessa o Dispositivo")
  public List<RoleAccessDevice> getRoleAccessDevices() {
    return roleAccessDevices;
  }

  public void setRoleAccessDevices(List<RoleAccessDevice> roleAccessDevices) {
    this.roleAccessDevices = roleAccessDevices;
  }

  public Role usedByProvisory(Boolean usedByProvisory) {
    this.usedByProvisory = usedByProvisory;
    return this;
  }

   /**
   * Papel Utilizado pelo Provisório
   * @return usedByProvisory
  **/
  @ApiModelProperty(required = true, value = "Papel Utilizado pelo Provisório")
  public Boolean isUsedByProvisory() {
    return usedByProvisory;
  }

  public void setUsedByProvisory(Boolean usedByProvisory) {
    this.usedByProvisory = usedByProvisory;
  }

  public Role creditAccessValidation(ValidationSetup creditAccessValidation) {
    this.creditAccessValidation = creditAccessValidation;
    return this;
  }

   /**
   * Get creditAccessValidation
   * @return creditAccessValidation
  **/
  @ApiModelProperty(required = true, value = "")
  public ValidationSetup getCreditAccessValidation() {
    return creditAccessValidation;
  }

  public void setCreditAccessValidation(ValidationSetup creditAccessValidation) {
    this.creditAccessValidation = creditAccessValidation;
  }

  public Role physicalLocationAuthorizerValidation(ValidationSetup physicalLocationAuthorizerValidation) {
    this.physicalLocationAuthorizerValidation = physicalLocationAuthorizerValidation;
    return this;
  }

   /**
   * Get physicalLocationAuthorizerValidation
   * @return physicalLocationAuthorizerValidation
  **/
  @ApiModelProperty(required = true, value = "")
  public ValidationSetup getPhysicalLocationAuthorizerValidation() {
    return physicalLocationAuthorizerValidation;
  }

  public void setPhysicalLocationAuthorizerValidation(ValidationSetup physicalLocationAuthorizerValidation) {
    this.physicalLocationAuthorizerValidation = physicalLocationAuthorizerValidation;
  }

  public Role physicalLocationValidation(ValidationSetup physicalLocationValidation) {
    this.physicalLocationValidation = physicalLocationValidation;
    return this;
  }

   /**
   * Get physicalLocationValidation
   * @return physicalLocationValidation
  **/
  @ApiModelProperty(required = true, value = "")
  public ValidationSetup getPhysicalLocationValidation() {
    return physicalLocationValidation;
  }

  public void setPhysicalLocationValidation(ValidationSetup physicalLocationValidation) {
    this.physicalLocationValidation = physicalLocationValidation;
  }

  public Role name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Nome")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Role stockingValidation(ValidationSetup stockingValidation) {
    this.stockingValidation = stockingValidation;
    return this;
  }

   /**
   * Get stockingValidation
   * @return stockingValidation
  **/
  @ApiModelProperty(required = true, value = "")
  public ValidationSetup getStockingValidation() {
    return stockingValidation;
  }

  public void setStockingValidation(ValidationSetup stockingValidation) {
    this.stockingValidation = stockingValidation;
  }

  public Role parkingSpaceValidation(ValidationSetup parkingSpaceValidation) {
    this.parkingSpaceValidation = parkingSpaceValidation;
    return this;
  }

   /**
   * Get parkingSpaceValidation
   * @return parkingSpaceValidation
  **/
  @ApiModelProperty(required = true, value = "")
  public ValidationSetup getParkingSpaceValidation() {
    return parkingSpaceValidation;
  }

  public void setParkingSpaceValidation(ValidationSetup parkingSpaceValidation) {
    this.parkingSpaceValidation = parkingSpaceValidation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.inBetweenWorkdaysToleranceInMinutes, role.inBetweenWorkdaysToleranceInMinutes) &&
        Objects.equals(this.personRoles, role.personRoles) &&
        Objects.equals(this.workSchedule, role.workSchedule) &&
        Objects.equals(this.timeSlotValidation, role.timeSlotValidation) &&
        Objects.equals(this.authorizerRoles, role.authorizerRoles) &&
        Objects.equals(this.inBetweenWorkdaysTimeInHours, role.inBetweenWorkdaysTimeInHours) &&
        Objects.equals(this.integrated, role.integrated) &&
        Objects.equals(this.customValidationUrl, role.customValidationUrl) &&
        Objects.equals(this.inheritSuspensionByImportedRole, role.inheritSuspensionByImportedRole) &&
        Objects.equals(this.roleAuthorizerValidation, role.roleAuthorizerValidation) &&
        Objects.equals(this.receiveVisit, role.receiveVisit) &&
        Objects.equals(this.roleAuthorizePhysicalLocations, role.roleAuthorizePhysicalLocations) &&
        Objects.equals(this.authorizedRoles, role.authorizedRoles) &&
        Objects.equals(this.roleAccessCreditRangeLists, role.roleAccessCreditRangeLists) &&
        Objects.equals(this.customValidation, role.customValidation) &&
        Objects.equals(this.id, role.id) &&
        Objects.equals(this.levelValidation, role.levelValidation) &&
        Objects.equals(this.inBetweenWorkdaysValidation, role.inBetweenWorkdaysValidation) &&
        Objects.equals(this.workScheduleValidation, role.workScheduleValidation) &&
        Objects.equals(this.roleAccessPhysicalLocations, role.roleAccessPhysicalLocations) &&
        Objects.equals(this.antiPassbackValidation, role.antiPassbackValidation) &&
        Objects.equals(this.roleAccessDevices, role.roleAccessDevices) &&
        Objects.equals(this.usedByProvisory, role.usedByProvisory) &&
        Objects.equals(this.creditAccessValidation, role.creditAccessValidation) &&
        Objects.equals(this.physicalLocationAuthorizerValidation, role.physicalLocationAuthorizerValidation) &&
        Objects.equals(this.physicalLocationValidation, role.physicalLocationValidation) &&
        Objects.equals(this.name, role.name) &&
        Objects.equals(this.stockingValidation, role.stockingValidation) &&
        Objects.equals(this.parkingSpaceValidation, role.parkingSpaceValidation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inBetweenWorkdaysToleranceInMinutes, personRoles, workSchedule, timeSlotValidation, authorizerRoles, inBetweenWorkdaysTimeInHours, integrated, customValidationUrl, inheritSuspensionByImportedRole, roleAuthorizerValidation, receiveVisit, roleAuthorizePhysicalLocations, authorizedRoles, roleAccessCreditRangeLists, customValidation, id, levelValidation, inBetweenWorkdaysValidation, workScheduleValidation, roleAccessPhysicalLocations, antiPassbackValidation, roleAccessDevices, usedByProvisory, creditAccessValidation, physicalLocationAuthorizerValidation, physicalLocationValidation, name, stockingValidation, parkingSpaceValidation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    inBetweenWorkdaysToleranceInMinutes: ").append(toIndentedString(inBetweenWorkdaysToleranceInMinutes)).append("\n");
    sb.append("    personRoles: ").append(toIndentedString(personRoles)).append("\n");
    sb.append("    workSchedule: ").append(toIndentedString(workSchedule)).append("\n");
    sb.append("    timeSlotValidation: ").append(toIndentedString(timeSlotValidation)).append("\n");
    sb.append("    authorizerRoles: ").append(toIndentedString(authorizerRoles)).append("\n");
    sb.append("    inBetweenWorkdaysTimeInHours: ").append(toIndentedString(inBetweenWorkdaysTimeInHours)).append("\n");
    sb.append("    integrated: ").append(toIndentedString(integrated)).append("\n");
    sb.append("    customValidationUrl: ").append(toIndentedString(customValidationUrl)).append("\n");
    sb.append("    inheritSuspensionByImportedRole: ").append(toIndentedString(inheritSuspensionByImportedRole)).append("\n");
    sb.append("    roleAuthorizerValidation: ").append(toIndentedString(roleAuthorizerValidation)).append("\n");
    sb.append("    receiveVisit: ").append(toIndentedString(receiveVisit)).append("\n");
    sb.append("    roleAuthorizePhysicalLocations: ").append(toIndentedString(roleAuthorizePhysicalLocations)).append("\n");
    sb.append("    authorizedRoles: ").append(toIndentedString(authorizedRoles)).append("\n");
    sb.append("    roleAccessCreditRangeLists: ").append(toIndentedString(roleAccessCreditRangeLists)).append("\n");
    sb.append("    customValidation: ").append(toIndentedString(customValidation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    levelValidation: ").append(toIndentedString(levelValidation)).append("\n");
    sb.append("    inBetweenWorkdaysValidation: ").append(toIndentedString(inBetweenWorkdaysValidation)).append("\n");
    sb.append("    workScheduleValidation: ").append(toIndentedString(workScheduleValidation)).append("\n");
    sb.append("    roleAccessPhysicalLocations: ").append(toIndentedString(roleAccessPhysicalLocations)).append("\n");
    sb.append("    antiPassbackValidation: ").append(toIndentedString(antiPassbackValidation)).append("\n");
    sb.append("    roleAccessDevices: ").append(toIndentedString(roleAccessDevices)).append("\n");
    sb.append("    usedByProvisory: ").append(toIndentedString(usedByProvisory)).append("\n");
    sb.append("    creditAccessValidation: ").append(toIndentedString(creditAccessValidation)).append("\n");
    sb.append("    physicalLocationAuthorizerValidation: ").append(toIndentedString(physicalLocationAuthorizerValidation)).append("\n");
    sb.append("    physicalLocationValidation: ").append(toIndentedString(physicalLocationValidation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stockingValidation: ").append(toIndentedString(stockingValidation)).append("\n");
    sb.append("    parkingSpaceValidation: ").append(toIndentedString(parkingSpaceValidation)).append("\n");
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

