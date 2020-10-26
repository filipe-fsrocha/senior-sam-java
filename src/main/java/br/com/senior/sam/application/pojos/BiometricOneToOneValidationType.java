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
 * Gets or Sets biometricOneToOneValidationType
 */
@JsonAdapter(BiometricOneToOneValidationType.Adapter.class)
public enum BiometricOneToOneValidationType {
  
  NONE("NONE"),
  
  OPTIONAL("OPTIONAL"),
  
  REQUIRED("REQUIRED");

  private String value;

  BiometricOneToOneValidationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BiometricOneToOneValidationType fromValue(String text) {
    for (BiometricOneToOneValidationType b : BiometricOneToOneValidationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BiometricOneToOneValidationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BiometricOneToOneValidationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BiometricOneToOneValidationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BiometricOneToOneValidationType.fromValue(String.valueOf(value));
    }
  }
}

