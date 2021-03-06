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
import br.com.senior.sam.application.pojos.Device;
import br.com.senior.sam.application.pojos.DeviceCommunicationStatus;
import br.com.senior.sam.application.pojos.DeviceSituation;
import br.com.senior.sam.application.pojos.DeviceType;
import br.com.senior.sam.application.pojos.ExtensibleConfiguration;
import br.com.senior.sam.application.pojos.OutputState;
import br.com.senior.sam.application.pojos.PhysicalLocation;
import java.io.IOException;

/**
 * OutputDevice
 */




public class OutputDevice {
  @SerializedName("deviceType")
  private DeviceType deviceType = null;

  @SerializedName("parent")
  private Device parent = null;

  @SerializedName("address")
  private Integer address = null;

  @SerializedName("physicalLocation")
  private PhysicalLocation physicalLocation = null;

  @SerializedName("communicationStatus")
  private DeviceCommunicationStatus communicationStatus = null;

  @SerializedName("defaultState")
  private OutputState defaultState = null;

  @SerializedName("extensibleConfiguration")
  private ExtensibleConfiguration extensibleConfiguration = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("situation")
  private DeviceSituation situation = null;

  @SerializedName("integrated")
  private Boolean integrated = null;

  public OutputDevice deviceType(DeviceType deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @ApiModelProperty(required = true, value = "")
  public DeviceType getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(DeviceType deviceType) {
    this.deviceType = deviceType;
  }

  public OutputDevice parent(Device parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @ApiModelProperty(value = "")
  public Device getParent() {
    return parent;
  }

  public void setParent(Device parent) {
    this.parent = parent;
  }

  public OutputDevice address(Integer address) {
    this.address = address;
    return this;
  }

   /**
   * Endereço
   * @return address
  **/
  @ApiModelProperty(required = true, value = "Endereço")
  public Integer getAddress() {
    return address;
  }

  public void setAddress(Integer address) {
    this.address = address;
  }

  public OutputDevice physicalLocation(PhysicalLocation physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }

   /**
   * Get physicalLocation
   * @return physicalLocation
  **/
  @ApiModelProperty(required = true, value = "")
  public PhysicalLocation getPhysicalLocation() {
    return physicalLocation;
  }

  public void setPhysicalLocation(PhysicalLocation physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  public OutputDevice communicationStatus(DeviceCommunicationStatus communicationStatus) {
    this.communicationStatus = communicationStatus;
    return this;
  }

   /**
   * Get communicationStatus
   * @return communicationStatus
  **/
  @ApiModelProperty(required = true, value = "")
  public DeviceCommunicationStatus getCommunicationStatus() {
    return communicationStatus;
  }

  public void setCommunicationStatus(DeviceCommunicationStatus communicationStatus) {
    this.communicationStatus = communicationStatus;
  }

  public OutputDevice defaultState(OutputState defaultState) {
    this.defaultState = defaultState;
    return this;
  }

   /**
   * Get defaultState
   * @return defaultState
  **/
  @ApiModelProperty(required = true, value = "")
  public OutputState getDefaultState() {
    return defaultState;
  }

  public void setDefaultState(OutputState defaultState) {
    this.defaultState = defaultState;
  }

  public OutputDevice extensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
    this.extensibleConfiguration = extensibleConfiguration;
    return this;
  }

   /**
   * Get extensibleConfiguration
   * @return extensibleConfiguration
  **/
  @ApiModelProperty(value = "")
  public ExtensibleConfiguration getExtensibleConfiguration() {
    return extensibleConfiguration;
  }

  public void setExtensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
    this.extensibleConfiguration = extensibleConfiguration;
  }

  public OutputDevice description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Descrição do Dispositivo
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Descrição do Dispositivo")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OutputDevice id(Integer id) {
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

  public OutputDevice situation(DeviceSituation situation) {
    this.situation = situation;
    return this;
  }

   /**
   * Get situation
   * @return situation
  **/
  @ApiModelProperty(required = true, value = "")
  public DeviceSituation getSituation() {
    return situation;
  }

  public void setSituation(DeviceSituation situation) {
    this.situation = situation;
  }

  public OutputDevice integrated(Boolean integrated) {
    this.integrated = integrated;
    return this;
  }

   /**
   * Dispositivo Integrado
   * @return integrated
  **/
  @ApiModelProperty(required = true, value = "Dispositivo Integrado")
  public Boolean isIntegrated() {
    return integrated;
  }

  public void setIntegrated(Boolean integrated) {
    this.integrated = integrated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputDevice outputDevice = (OutputDevice) o;
    return Objects.equals(this.deviceType, outputDevice.deviceType) &&
        Objects.equals(this.parent, outputDevice.parent) &&
        Objects.equals(this.address, outputDevice.address) &&
        Objects.equals(this.physicalLocation, outputDevice.physicalLocation) &&
        Objects.equals(this.communicationStatus, outputDevice.communicationStatus) &&
        Objects.equals(this.defaultState, outputDevice.defaultState) &&
        Objects.equals(this.extensibleConfiguration, outputDevice.extensibleConfiguration) &&
        Objects.equals(this.description, outputDevice.description) &&
        Objects.equals(this.id, outputDevice.id) &&
        Objects.equals(this.situation, outputDevice.situation) &&
        Objects.equals(this.integrated, outputDevice.integrated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceType, parent, address, physicalLocation, communicationStatus, defaultState, extensibleConfiguration, description, id, situation, integrated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputDevice {\n");
    
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    communicationStatus: ").append(toIndentedString(communicationStatus)).append("\n");
    sb.append("    defaultState: ").append(toIndentedString(defaultState)).append("\n");
    sb.append("    extensibleConfiguration: ").append(toIndentedString(extensibleConfiguration)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    situation: ").append(toIndentedString(situation)).append("\n");
    sb.append("    integrated: ").append(toIndentedString(integrated)).append("\n");
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

