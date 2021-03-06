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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets callGenerationType
 */
@JsonAdapter(CallGenerationType.Adapter.class)
public enum CallGenerationType {
  
  DISABLED("DISABLED"),
  
  ALWAYS("ALWAYS"),
  
  ON_ACCESS_ALLOWED("ON_ACCESS_ALLOWED"),
  
  ON_ACCESS_DENIED("ON_ACCESS_DENIED");

  private String value;

  CallGenerationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CallGenerationType fromValue(String text) {
    for (CallGenerationType b : CallGenerationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CallGenerationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CallGenerationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CallGenerationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CallGenerationType.fromValue(String.valueOf(value));
    }
  }
}

