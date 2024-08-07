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
import com.cobo.waas2.model.WebhookEvent;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cobo.waas2.JSON;

/**
 * The webhook event log.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class WebhookEventLog {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CREATED_TIMESTAMP = "created_timestamp";
  @SerializedName(SERIALIZED_NAME_CREATED_TIMESTAMP)
  private Long createdTimestamp;

  public static final String SERIALIZED_NAME_REQUEST_HEADERS = "request_headers";
  @SerializedName(SERIALIZED_NAME_REQUEST_HEADERS)
  private Object requestHeaders;

  public static final String SERIALIZED_NAME_REQUEST_BODY = "request_body";
  @SerializedName(SERIALIZED_NAME_REQUEST_BODY)
  private WebhookEvent requestBody;

  public static final String SERIALIZED_NAME_RESPONSE_BODY = "response_body";
  @SerializedName(SERIALIZED_NAME_RESPONSE_BODY)
  private String responseBody;

  public static final String SERIALIZED_NAME_RESPONSE_STATUS_CODE = "response_status_code";
  @SerializedName(SERIALIZED_NAME_RESPONSE_STATUS_CODE)
  private Integer responseStatusCode;

  public static final String SERIALIZED_NAME_RESPONSE_TIME = "response_time";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TIME)
  private Integer responseTime;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failure_reason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private String failureReason;

  public WebhookEventLog() {
  }

  public WebhookEventLog id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The event log ID.
   * @return id
  **/
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public WebhookEventLog createdTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * The time when the log was created, in Unix timestamp format, measured in milliseconds.
   * @return createdTimestamp
  **/
  @javax.annotation.Nonnull
  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  public void setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }


  public WebhookEventLog requestHeaders(Object requestHeaders) {
    this.requestHeaders = requestHeaders;
    return this;
  }

   /**
   * The request headers of the webhook event.
   * @return requestHeaders
  **/
  @javax.annotation.Nonnull
  public Object getRequestHeaders() {
    return requestHeaders;
  }

  public void setRequestHeaders(Object requestHeaders) {
    this.requestHeaders = requestHeaders;
  }


  public WebhookEventLog requestBody(WebhookEvent requestBody) {
    this.requestBody = requestBody;
    return this;
  }

   /**
   * Get requestBody
   * @return requestBody
  **/
  @javax.annotation.Nonnull
  public WebhookEvent getRequestBody() {
    return requestBody;
  }

  public void setRequestBody(WebhookEvent requestBody) {
    this.requestBody = requestBody;
  }


  public WebhookEventLog responseBody(String responseBody) {
    this.responseBody = responseBody;
    return this;
  }

   /**
   * The response body of the webhook event.
   * @return responseBody
  **/
  @javax.annotation.Nullable
  public String getResponseBody() {
    return responseBody;
  }

  public void setResponseBody(String responseBody) {
    this.responseBody = responseBody;
  }


  public WebhookEventLog responseStatusCode(Integer responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
    return this;
  }

   /**
   * The response status code of the webhook event.
   * @return responseStatusCode
  **/
  @javax.annotation.Nullable
  public Integer getResponseStatusCode() {
    return responseStatusCode;
  }

  public void setResponseStatusCode(Integer responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
  }


  public WebhookEventLog responseTime(Integer responseTime) {
    this.responseTime = responseTime;
    return this;
  }

   /**
   * The response time of the webhook event, in milliseconds.
   * @return responseTime
  **/
  @javax.annotation.Nullable
  public Integer getResponseTime() {
    return responseTime;
  }

  public void setResponseTime(Integer responseTime) {
    this.responseTime = responseTime;
  }


  public WebhookEventLog success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Whether the webhook event has been successfully delivered.
   * @return success
  **/
  @javax.annotation.Nonnull
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public WebhookEventLog failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

   /**
   * The reason why the webhook event fails to be delivered.
   * @return failureReason
  **/
  @javax.annotation.Nullable
  public String getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the WebhookEventLog instance itself
   */
  public WebhookEventLog putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEventLog webhookEventLog = (WebhookEventLog) o;
    return Objects.equals(this.id, webhookEventLog.id) &&
        Objects.equals(this.createdTimestamp, webhookEventLog.createdTimestamp) &&
        Objects.equals(this.requestHeaders, webhookEventLog.requestHeaders) &&
        Objects.equals(this.requestBody, webhookEventLog.requestBody) &&
        Objects.equals(this.responseBody, webhookEventLog.responseBody) &&
        Objects.equals(this.responseStatusCode, webhookEventLog.responseStatusCode) &&
        Objects.equals(this.responseTime, webhookEventLog.responseTime) &&
        Objects.equals(this.success, webhookEventLog.success) &&
        Objects.equals(this.failureReason, webhookEventLog.failureReason)&&
        Objects.equals(this.additionalProperties, webhookEventLog.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTimestamp, requestHeaders, requestBody, responseBody, responseStatusCode, responseTime, success, failureReason, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEventLog {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    requestBody: ").append(toIndentedString(requestBody)).append("\n");
    sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
    sb.append("    responseStatusCode: ").append(toIndentedString(responseStatusCode)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("created_timestamp");
    openapiFields.add("request_headers");
    openapiFields.add("request_body");
    openapiFields.add("response_body");
    openapiFields.add("response_status_code");
    openapiFields.add("response_time");
    openapiFields.add("success");
    openapiFields.add("failure_reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("created_timestamp");
    openapiRequiredFields.add("request_headers");
    openapiRequiredFields.add("request_body");
    openapiRequiredFields.add("success");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WebhookEventLog
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebhookEventLog.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookEventLog is not found in the empty JSON string", WebhookEventLog.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookEventLog.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the required field `request_body`
      WebhookEvent.validateJsonElement(jsonObj.get("request_body"));
      if ((jsonObj.get("response_body") != null && !jsonObj.get("response_body").isJsonNull()) && !jsonObj.get("response_body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `response_body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("response_body").toString()));
      }
      if ((jsonObj.get("failure_reason") != null && !jsonObj.get("failure_reason").isJsonNull()) && !jsonObj.get("failure_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failure_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failure_reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookEventLog.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookEventLog' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookEventLog> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookEventLog.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookEventLog>() {
           @Override
           public void write(JsonWriter out, WebhookEventLog value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookEventLog read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             WebhookEventLog instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookEventLog given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookEventLog
  * @throws IOException if the JSON string is invalid with respect to WebhookEventLog
  */
  public static WebhookEventLog fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookEventLog.class);
  }

 /**
  * Convert an instance of WebhookEventLog to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

