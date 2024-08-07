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
 * The type of the signature format. Possible values include: - &#x60;EVM_EIP_191&#x60;: [EIP-191: Signed Data Standard](https://eips.ethereum.org/EIPS/eip-191). - &#x60;EVM_EIP_712&#x60;: [EIP-712: Typed structured data hashing and signing](https://eips.ethereum.org/EIPS/eip-712). 
 */
@JsonAdapter(MessageSignDestinationType.Adapter.class)
public enum MessageSignDestinationType {
  UNKNOWN(null),
  
  _191_SIGNATURE("EVM_EIP_191_Signature"),
  
  _712_SIGNATURE("EVM_EIP_712_Signature");

  private String value;

  MessageSignDestinationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MessageSignDestinationType fromValue(String value) {
    for (MessageSignDestinationType b : MessageSignDestinationType.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MessageSignDestinationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final MessageSignDestinationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MessageSignDestinationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MessageSignDestinationType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    MessageSignDestinationType.fromValue(value);
  }
}

