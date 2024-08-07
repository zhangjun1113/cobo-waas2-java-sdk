/*
 * Cobo Wallet as a Service 2.0
 *
 * Contact: support@cobo.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cobo.waas2.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The available actions of key share holder group update. Possible values include: - &#x60;UpgradeToMainGroup&#x60;: This upgrades an active [Signing Group](https://manuals.cobo.com/en/portal/mpc-wallets/ocw/create-key-share-groups) to the [Main Group](https://manuals.cobo.com/en/portal/mpc-wallets/ocw/create-key-share-groups). The original Main Group will be permanently deleted. 
 */
@JsonAdapter(UpdateGroupAction.Adapter.class)
public enum UpdateGroupAction {
  UNKNOWN(null),
  
  UPGRADETOMAINGROUP("UpgradeToMainGroup");

  private String value;

  UpdateGroupAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UpdateGroupAction fromValue(String value) {
    for (UpdateGroupAction b : UpdateGroupAction.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<UpdateGroupAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final UpdateGroupAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UpdateGroupAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return UpdateGroupAction.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    UpdateGroupAction.fromValue(value);
  }
}

