# TransactionsApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelTransactionById**](TransactionsApi.md#cancelTransactionById) | **POST** /transactions/{transaction_id}/cancel | Cancel transaction |
| [**createContractCallTransaction**](TransactionsApi.md#createContractCallTransaction) | **POST** /transactions/contract_call | Call smart contract |
| [**createMessageSignTransaction**](TransactionsApi.md#createMessageSignTransaction) | **POST** /transactions/message_sign | Sign message |
| [**createTransferTransaction**](TransactionsApi.md#createTransferTransaction) | **POST** /transactions/transfer | Transfer token |
| [**dropTransactionById**](TransactionsApi.md#dropTransactionById) | **POST** /transactions/{transaction_id}/drop | Drop transaction |
| [**estimateFee**](TransactionsApi.md#estimateFee) | **POST** /transactions/estimate_fee | Estimate transaction fee |
| [**getTransactionById**](TransactionsApi.md#getTransactionById) | **GET** /transactions/{transaction_id} | Get transaction information |
| [**listTransactions**](TransactionsApi.md#listTransactions) | **GET** /transactions | List all transactions |
| [**resendTransactionById**](TransactionsApi.md#resendTransactionById) | **POST** /transactions/{transaction_id}/resend | Resend transaction |
| [**speedupTransactionById**](TransactionsApi.md#speedupTransactionById) | **POST** /transactions/{transaction_id}/speedup | Speed up transaction |


<a id="cancelTransactionById"></a>
# **cancelTransactionById**
> CreateTransferTransaction201Response cancelTransactionById(transactionId)

Cancel transaction

This operation cancels a specified transaction. A transaction can be cancelled if its status is either of the following: - &#x60;Submitted&#x60; - &#x60;PendingScreening&#x60; - &#x60;PendingAuthorization&#x60; - &#x60;PendingSignature&#x60;   A transaction request for tracking is returned upon successful operation. &lt;Note&gt;This operation only applies to transactions from MPC Wallets.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // for dev environment
    // defaultClient.setEnv(Env.DEV);
    // set custom base url
    // defaultClient.setBasePath("https://api[.xxx].cobo.com/v2");
    defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    TransactionsApi apiInstance = new TransactionsApi();
    UUID transactionId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    try {
      CreateTransferTransaction201Response result = apiInstance.cancelTransactionById(transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#cancelTransactionById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transactionId** | **UUID**| The transaction ID. | |

### Return type

[**CreateTransferTransaction201Response**](CreateTransferTransaction201Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createContractCallTransaction"></a>
# **createContractCallTransaction**
> CreateTransferTransaction201Response createContractCallTransaction(contractCallParams)

Call smart contract

This operation creates a transaction to interact with a smart contract on the blockchain.  You need to provide details such as the source address, destination address, and the calldata. You can specify the fee-related properties to limit the transaction fee. A transaction request for tracking is returned upon successful operation.  &lt;Note&gt;Currently, this operation only applies to blockchains that have a similar architecture to Ethereum.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // for dev environment
    // defaultClient.setEnv(Env.DEV);
    // set custom base url
    // defaultClient.setBasePath("https://api[.xxx].cobo.com/v2");
    defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    TransactionsApi apiInstance = new TransactionsApi();
    ContractCallParams contractCallParams = new ContractCallParams();
    try {
      CreateTransferTransaction201Response result = apiInstance.createContractCallTransaction(contractCallParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#createContractCallTransaction");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractCallParams** | [**ContractCallParams**](ContractCallParams.md)| The request body for making a contract call. | [optional] |

### Return type

[**CreateTransferTransaction201Response**](CreateTransferTransaction201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createMessageSignTransaction"></a>
# **createMessageSignTransaction**
> CreateTransferTransaction201Response createMessageSignTransaction(messageSignParams)

Sign message

This operation creates a transaction to sign the provided message using cryptographic techniques.  In some scenarios, you want to sign a message for identity authentication or transaction approval. You need to provide details such as the source address, destination address, and the message to be signed. A transaction request for tracking is returned upon successful operation.  You can get the signature result by calling [Get transaction information](/v2/api-references/transactions/get-transaction-information).   &lt;Note&gt;Currently, only MPC Wallets support this type of transaction to sign a message.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // for dev environment
    // defaultClient.setEnv(Env.DEV);
    // set custom base url
    // defaultClient.setBasePath("https://api[.xxx].cobo.com/v2");
    defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    TransactionsApi apiInstance = new TransactionsApi();
    MessageSignParams messageSignParams = new MessageSignParams();
    try {
      CreateTransferTransaction201Response result = apiInstance.createMessageSignTransaction(messageSignParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#createMessageSignTransaction");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **messageSignParams** | [**MessageSignParams**](MessageSignParams.md)| The request body to create a message sign transaction | [optional] |

### Return type

[**CreateTransferTransaction201Response**](CreateTransferTransaction201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createTransferTransaction"></a>
# **createTransferTransaction**
> CreateTransferTransaction201Response createTransferTransaction(transferParams)

Transfer token

The operation transfers your assets from a wallet created on Cobo Protal to another address.  You need to specify details such as the sender address and recipient address, token ID, and the amount to transfer. You can specify the fee-related properties to limit the transaction fee. A transaction request for tracking is returned upon successful operation.  &lt;Note&gt;Only MPC Wallets as the transaction source can transfer tokens to multiple addresses by using the &lt;code&gt;utxo_outputs&lt;/code&gt; property.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // for dev environment
    // defaultClient.setEnv(Env.DEV);
    // set custom base url
    // defaultClient.setBasePath("https://api[.xxx].cobo.com/v2");
    defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    TransactionsApi apiInstance = new TransactionsApi();
    TransferParams transferParams = new TransferParams();
    try {
      CreateTransferTransaction201Response result = apiInstance.createTransferTransaction(transferParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#createTransferTransaction");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transferParams** | [**TransferParams**](TransferParams.md)| The request body to create a transfer transaction | [optional] |

### Return type

[**CreateTransferTransaction201Response**](CreateTransferTransaction201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="dropTransactionById"></a>
# **dropTransactionById**
> CreateTransferTransaction201Response dropTransactionById(transactionId, transactionRbf)

Drop transaction

This operation drops a specified transaction.   Dropping a transaction will trigger an Replace-By-Fee (RBF) transaction which is a new version of the original transaction. It has a higher transaction fee to incentivize miners to prioritize its confirmation over the original one. A transaction can be dropped if its status is &#x60;Broadcasting&#x60;.  &lt;ul&gt; &lt;li&gt;For EVM chains, this RBF transaction has a transfer amount of &#x60;0&#x60; and the sending address is the same as the receiving address.&lt;/li&gt; &lt;li&gt;For UTXO chains, this RBF transaction has a transfer amount of &#x60;0&#x60; and the destination address is the same as the change address in the original transaction.&lt;/li&gt; &lt;/ul&gt; A transaction request for tracking is returned upon successful operation. &lt;Note&gt;This operation only applies to transactions from MPC Wallets, excluding transactions in the tokens VET, TRON, TVET, SOL, and TON.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // for dev environment
    // defaultClient.setEnv(Env.DEV);
    // set custom base url
    // defaultClient.setBasePath("https://api[.xxx].cobo.com/v2");
    defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    TransactionsApi apiInstance = new TransactionsApi();
    UUID transactionId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    TransactionRbf transactionRbf = new TransactionRbf();
    try {
      CreateTransferTransaction201Response result = apiInstance.dropTransactionById(transactionId, transactionRbf);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#dropTransactionById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transactionId** | **UUID**| The transaction ID. | |
| **transactionRbf** | [**TransactionRbf**](TransactionRbf.md)| The request body to drop or to speed up transactions | [optional] |

### Return type

[**CreateTransferTransaction201Response**](CreateTransferTransaction201Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="estimateFee"></a>
# **estimateFee**
> EstimatedFee estimateFee(estimateFeeParams)

Estimate transaction fee

This operation estimates the transaction fee rates of a token transfer or a contract call based on three different transaction speeds (slow, recommended, and fast), considering factors such as network congestion and transaction complexity.  You need to specify the transaction information, including the request ID, request type, source address, destination address, and token ID of the transaction fee.  The response can contain different properties based on the transaction fee model used by the chain, including EIP-1559 fee model, legacy fee model, UTXO fee model, and fixed fee model. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // for dev environment
    // defaultClient.setEnv(Env.DEV);
    // set custom base url
    // defaultClient.setBasePath("https://api[.xxx].cobo.com/v2");
    defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    TransactionsApi apiInstance = new TransactionsApi();
    EstimateFeeParams estimateFeeParams = new EstimateFeeParams();
    try {
      EstimatedFee result = apiInstance.estimateFee(estimateFeeParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#estimateFee");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **estimateFeeParams** | [**EstimateFeeParams**](EstimateFeeParams.md)| The request body to estimate the transaction fee of a token transfer or a contract call. | [optional] |

### Return type

[**EstimatedFee**](EstimatedFee.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getTransactionById"></a>
# **getTransactionById**
> TransactionDetail getTransactionById(transactionId)

Get transaction information

This operation retrieves detailed information about a specified transaction, such as the transaction status, source address, destination address, and timestamp. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // for dev environment
    // defaultClient.setEnv(Env.DEV);
    // set custom base url
    // defaultClient.setBasePath("https://api[.xxx].cobo.com/v2");
    defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    TransactionsApi apiInstance = new TransactionsApi();
    UUID transactionId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    try {
      TransactionDetail result = apiInstance.getTransactionById(transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getTransactionById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transactionId** | **UUID**| The transaction ID. | |

### Return type

[**TransactionDetail**](TransactionDetail.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The information about a transaction. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listTransactions"></a>
# **listTransactions**
> ListTransactions200Response listTransactions(requestId, coboIds, transactionIds, transactionHashes, types, statuses, walletIds, chainIds, tokenIds, assetIds, vaultId, projectId, minCreatedTimestamp, maxCreatedTimestamp, limit, before, after)

List all transactions

This operation retrieves all the transactions under your organization.  You can filter the results by request ID, Cobo ID, transaction ID, transaction hash, type, status, and timestamps. You can also paginate and sort your query results. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // for dev environment
    // defaultClient.setEnv(Env.DEV);
    // set custom base url
    // defaultClient.setBasePath("https://api[.xxx].cobo.com/v2");
    defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    TransactionsApi apiInstance = new TransactionsApi();
    String requestId = "web_send_by_user_327_1610444045047";
    String coboIds = "20231213122855000000000000000000,20231213122955000000000000000000";
    UUID transactionIds = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479,557918d2-632a-4fe1-932f-315711f05fe3");
    String transactionHashes = "239861be9a4afe080c359b7fe4a1d035945ec46256b1a0f44d1267c71de8ec28";
    String types = "Deposit,Withdrawal";
    String statuses = "Completed,Failed";
    String walletIds = "f47ac10b-58cc-4372-a567-0e02b2c3d479,1ddca562-8434-41c9-8809-d437bad9c868";
    String chainIds = "BTC,ETH";
    String tokenIds = "ETH_USDT,ETH_USDC";
    String assetIds = "USDT,USDC";
    UUID vaultId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    UUID projectId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    Long minCreatedTimestamp = 1635744000000L;
    Long maxCreatedTimestamp = 1635744000000L;
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListTransactions200Response result = apiInstance.listTransactions(requestId, coboIds, transactionIds, transactionHashes, types, statuses, walletIds, chainIds, tokenIds, assetIds, vaultId, projectId, minCreatedTimestamp, maxCreatedTimestamp, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#listTransactions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestId** | **String**| The request ID that is used to track a transaction request. The request ID is provided by you and must be unique within your organization. | [optional] |
| **coboIds** | **String**| A list of Cobo IDs, separated by comma. A Cobo ID can be used to track a transaction. | [optional] |
| **transactionIds** | **UUID**| A list of transaction IDs, separated by comma. | [optional] |
| **transactionHashes** | **String**| A list of transaction hashes, separated by comma. | [optional] |
| **types** | **String**| A list of transaction types, separated by comma. Possible values include:    - &#x60;Deposit&#x60;: A deposit transaction.   - &#x60;Withdrawal&#x60;: A withdrawal transaction.   - &#x60;ContractCall&#x60;: A transaction that interacts with a smart contract.   - &#x60;MessageSign&#x60;: A transaction that signs a message.    - &#x60;ExternalSafeTx&#x60;: A transaction to a Smart Contract Wallet (Safe{Wallet}) that requires one or multiple signatures to be executed.  | [optional] |
| **statuses** | **String**| A list of transaction statuses, separated by comma. Possible values include:    - &#x60;Submitted&#x60;: The transaction is submitted.   - &#x60;PendingScreening&#x60;: The transaction is pending screening by Risk Control.    - &#x60;PendingAuthorization&#x60;: The transaction is pending approvals.   - &#x60;PendingSignature&#x60;: The transaction is pending signature.    - &#x60;Broadcasting&#x60;: The transaction is being broadcast.   - &#x60;Confirming&#x60;: The transaction is waiting for the required number of confirmations.   - &#x60;Completed&#x60;: The transaction is completed.   - &#x60;Failed&#x60;: The transaction failed.   - &#x60;Rejected&#x60;: The transaction is rejected.   - &#x60;Pending&#x60;: The transaction is pending.  | [optional] |
| **walletIds** | **String**| A list of wallet IDs, separated by comma. | [optional] |
| **chainIds** | **String**| A list of chain IDs, separated by comma. The chain ID is the unique identifier of a blockchain. You can retrieve the IDs of all the chains you can use by calling [List enabled chains](/v2/api-references/wallets/list-enabled-chains). | [optional] |
| **tokenIds** | **String**| A list of token IDs, separated by comma. The token ID is the unique identifier of a token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](/v2/api-references/wallets/list-enabled-tokens). | [optional] |
| **assetIds** | **String**| (This concept applies to Exchange Wallets only) A list of asset IDs, separated by comma. An asset ID is the unique identifier of the asset held within your linked exchange account. | [optional] |
| **vaultId** | **UUID**| (This parameter is applicable to MPC Wallets only) The vault ID, which you can retrieve by calling [List all vaults](/v2/api-references/wallets--mpc-wallets/list-all-vaults). | [optional] |
| **projectId** | **UUID**| The project ID, which you can retrieve by calling [List all projects](/v2/api-references/wallets--mpc-wallets/list-all-projects).  | [optional] |
| **minCreatedTimestamp** | **Long**| The time when the transaction was created, in Unix timestamp format, measured in milliseconds. You can use this parameter to filter transactions created on or after the specified time. | [optional] |
| **maxCreatedTimestamp** | **Long**| The time when the transaction was created, in Unix timestamp format, measured in milliseconds. You can use this parameter to filter transactions created on or before the specified time. | [optional] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| An object ID that serves as a starting point for retrieving data in reverse chronological order. For example, if you specify &#x60;before&#x60; as &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1&#x60;, the request will retrieve a list of data objects that end before the object with the object ID &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1&#x60;. You can set this parameter to the value of &#x60;pagination.before&#x60; in the response of the previous request.  - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur.  - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  - If you set &#x60;before&#x60; to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| An object ID that acts as a starting point for retrieving data in chronological order. For example, if you specify &#x60;after&#x60; as &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;, the request will retrieve a list of data objects that start after the object with the object ID &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;. You can set this parameter to the value of &#x60;pagination.after&#x60; in the response of the previous request.  - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur.  - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

### Return type

[**ListTransactions200Response**](ListTransactions200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The information about the transactions. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="resendTransactionById"></a>
# **resendTransactionById**
> CreateTransferTransaction201Response resendTransactionById(transactionId, transactionResend)

Resend transaction

This operation resends a specified transaction. Resending a transaction initiates a new attempt to process the transaction that failed previously. A transaction can be resent if its status is &#x60;failed&#x60;.  A transaction request for tracking is returned upon successful operation. &lt;Note&gt;This operation only applies to transactions in the SOL token from MPC Wallets.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // for dev environment
    // defaultClient.setEnv(Env.DEV);
    // set custom base url
    // defaultClient.setBasePath("https://api[.xxx].cobo.com/v2");
    defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    TransactionsApi apiInstance = new TransactionsApi();
    UUID transactionId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    TransactionResend transactionResend = new TransactionResend();
    try {
      CreateTransferTransaction201Response result = apiInstance.resendTransactionById(transactionId, transactionResend);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#resendTransactionById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transactionId** | **UUID**| The transaction ID. | |
| **transactionResend** | [**TransactionResend**](TransactionResend.md)| The request body to resend transactions | [optional] |

### Return type

[**CreateTransferTransaction201Response**](CreateTransferTransaction201Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="speedupTransactionById"></a>
# **speedupTransactionById**
> CreateTransferTransaction201Response speedupTransactionById(transactionId, transactionRbf)

Speed up transaction

This operation accelerates a specified transaction.   Speeding up a transaction will trigger an Replace-By-Fee (RBF) transaction which is a new version of the original transaction. It shares the same inputs but has a higher transaction fee to incentivize miners to prioritize its confirmation over the previous one. A transaction can be accelerated if its status is &#x60;Broadcasting&#x60;.  A transaction request for tracking is returned upon successful operation. &lt;Note&gt;This operation only applies to transactions from MPC Wallets, excluding transactions in the tokens VET, TRON, TVET, SOL, and TON.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // for dev environment
    // defaultClient.setEnv(Env.DEV);
    // set custom base url
    // defaultClient.setBasePath("https://api[.xxx].cobo.com/v2");
    defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    TransactionsApi apiInstance = new TransactionsApi();
    UUID transactionId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    TransactionRbf transactionRbf = new TransactionRbf();
    try {
      CreateTransferTransaction201Response result = apiInstance.speedupTransactionById(transactionId, transactionRbf);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#speedupTransactionById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transactionId** | **UUID**| The transaction ID. | |
| **transactionRbf** | [**TransactionRbf**](TransactionRbf.md)| The request body to drop or to speed up transactions | [optional] |

### Return type

[**CreateTransferTransaction201Response**](CreateTransferTransaction201Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

