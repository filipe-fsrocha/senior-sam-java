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

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets virtualLobbyActionType
 */
@JsonAdapter(VirtualLobbyActionType.Adapter.class)
public enum VirtualLobbyActionType {
  
  DISABLE_ACTION("DISABLE_ACTION"),
  
  ENABLE_ACTION("ENABLE_ACTION"),
  
  ENABLE_ACTION_WITH_TIMEOUT("ENABLE_ACTION_WITH_TIMEOUT");

  private String value;

  VirtualLobbyActionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VirtualLobbyActionType fromValue(String text) {
    for (VirtualLobbyActionType b : VirtualLobbyActionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<VirtualLobbyActionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final VirtualLobbyActionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VirtualLobbyActionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VirtualLobbyActionType.fromValue(String.valueOf(value));
    }
  }
}

