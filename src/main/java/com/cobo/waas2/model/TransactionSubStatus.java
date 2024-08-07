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
 * The transaction sub-status. Possible values include:    - &#x60;PendingDoubleCheck&#x60;: The transaction is pending a double check.    - &#x60;RejectedDoubleCheck&#x60;: The transaction is rejected because it failed a double check.   - &#x60;PendingSpenderCheck&#x60;: The transaction is pending a spender check.   - &#x60;RejectedSpenderAuth&#x60;: The transaction is rejected because it is rejected by the spender.   - &#x60;RejectedTravelRule&#x60;: The transaction is rejected because it failed to comply with the Travel Rule.   - &#x60;RejectedKYT&#x60;: The transaction is rejected because it did not pass the Know Your Transaction (KYT) compliance checks.   - &#x60;PendingRiskControlCheck&#x60;: The transaction is pending for a Risk Control check.   - &#x60;RejectedRiskControlCheck&#x60;: The transaction is rejected because it failed the Risk Control check.   - &#x60;PendingApproverCheck&#x60;: The transaction is pending approval from the approver.   - &#x60;RejectedApproverAuth&#x60;: The transaction is rejected by the approver.   - &#x60;RejectedbyMobileCosigner&#x60;: The transaction is rejected by a mobile cosigner.   - &#x60;RejectedCoboCheck&#x60;: The transaction is rejected because it failed the internal check by Cobo.   - &#x60;RejectedWhiteList&#x60;: The transaction is rejected because the sender or receiver is not included in a whitelist.   - &#x60;PendingWaitSigner&#x60;: The transaction is pending signature.   - &#x60;FailedBySigner&#x60;: The transaction failed during the signing process.   - &#x60;FailedBroadcasting&#x60;: The transaction failed to be broadcast to the blockchain network.   - &#x60;CanceledBySpender&#x60;: The transaction is canceled by a Spender.   - &#x60;CanceledByAPI&#x60;: The transaction is canceled by a [Cancel transaction](/v2/api-references/transactions/cancel-transaction) operation.   - &#x60;Queue&#x60;: The transaction is queued to be processed by Cobo Portal.   - &#x60;OnchainRejection&#x60;: The transaction is rejected from being added to the blockchain.   - &#x60;FailedOnChain&#x60;: The transaction failed on the blockchain.   - &#x60;PendingBlockConfirmations&#x60;: The transaction is awaiting the required number of confirmations.   - &#x60;ReplacedByNewTransaction&#x60;: The transaction has been replaced by a new transaction. 
 */
@JsonAdapter(TransactionSubStatus.Adapter.class)
public enum TransactionSubStatus {
  UNKNOWN(null),
  
  REJECTEDKYT("RejectedKYT"),
  
  REJECTEDTRAVELRULE("RejectedTravelRule"),
  
  PENDINGDOUBLECHECK("PendingDoubleCheck"),
  
  PENDINGSPENDERCHECK("PendingSpenderCheck"),
  
  PENDINGRISKCONTROLCHECK("PendingRiskControlCheck"),
  
  PENDINGAPPROVERCHECK("PendingApproverCheck"),
  
  REJECTEDCOBOCHECK("RejectedCoboCheck"),
  
  REJECTEDWHITELIST("RejectedWhiteList"),
  
  REJECTEDDOUBLECHECK("RejectedDoubleCheck"),
  
  REJECTEDSPENDERAUTH("RejectedSpenderAuth"),
  
  REJECTEDRISKCONTROLCHECK("RejectedRiskControlCheck"),
  
  REJECTEDAPPROVERAUTH("RejectedApproverAuth"),
  
  REJECTEDBYMOBILECOSIGNER("RejectedbyMobileCosigner"),
  
  PENDINGWAITSIGNER("PendingWaitSigner"),
  
  FAILEDBYSIGNER("FailedBySigner"),
  
  FAILEDBROADCASTING("FailedBroadcasting"),
  
  FAILEDONCHAIN("FailedOnChain"),
  
  QUEUE("Queue"),
  
  PENDINGBLOCKCONFIRMATIONS("PendingBlockConfirmations"),
  
  REPLACEDBYNEWTRANSACTION("ReplacedByNewTransaction"),
  
  CANCELEDBYSPENDER("CanceledBySpender"),
  
  CANCELEDBYAPI("CanceledByAPI"),
  
  ONCHAINREJECTION("OnchainRejection");

  private String value;

  TransactionSubStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransactionSubStatus fromValue(String value) {
    for (TransactionSubStatus b : TransactionSubStatus.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TransactionSubStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransactionSubStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransactionSubStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransactionSubStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    TransactionSubStatus.fromValue(value);
  }
}

