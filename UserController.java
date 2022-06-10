// {
//   "amount": 9900
// }
// function capture()
// {
//     $accessToken = "YOUR-ACCESS-TOKEN";
//     $merchantNumber = "YOUR-MERCHANT-NUMBER";
//     $secretToken = "YOUR-SECRET-TOKEN";
//     $apiKey = base64_encode($accessToken . "@" . $merchantNumber . ":" . $secretToken);

//     $transactionId = "ID of the transaction to capture.";
//     $endpointUrl = "https://transaction-v1.api-eu.bambora.com/transactions/".
//                     $transactionId."/capture";

//     $request = array();
//     $request["amount"] = "195";
//     $request["currency"] = "DKK";

//     $requestJson = json_encode($request);

//     $contentLength = isset($requestJson) ? strlen($requestJson) : 0;
//     $headers = array(
//         'Content-Type: application/json',
//         'Content-Length: ' . $contentLength,
//         'Accept: application/json',
//         'Authorization: Basic ' . $apiKey
//     );

//     $curl = curl_init();
//     curl_setopt($curl, CURLOPT_CUSTOMREQUEST, "POST");
//     curl_setopt($curl, CURLOPT_POSTFIELDS, $requestJson);
//     curl_setopt($curl, CURLOPT_URL, $endpointUrl);
//     curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
//     curl_setopt($curl, CURLOPT_HTTPHEADER, $headers);
//     curl_setopt($curl, CURLOPT_FAILONERROR, false);
//     curl_setopt($curl, CURLOPT_SSL_VERIFYPEER, false);

//     $rawResponse = curl_exec($curl);

//     $response = json_decode($rawResponse);

//     if($response->meta->result == false) {
//         die($response->meta->message->merchant);
//     }
//     //Capture was a success
// }
// {
//   "amount": 1900
// }
// function credit()
// {
//     $accessToken = "YOUR-ACCESS-TOKEN";
//     $merchantNumber = "YOUR-MERCHANT-NUMBER";
//     $secretToken = "YOUR-SECRET-TOKEN";
//     $apiKey = base64_encode(
//         $accessToken . "@" . $merchantNumber . ":" . $secretToken
//     );

//     $transactionId = "ID of the transaction to credit.";
//     $endpointUrl = "https://transaction-v1.api-eu.bambora.com/transactions/".
//                     $transactionId."/credit";

//     $request = array();
//     $request["amount"] = "195";
//     $request["currency"] = "DKK";

//     $requestJson = json_encode($request);

//     $contentLength = isset($requestJson) ? strlen($requestJson) : 0;
//     $headers = array(
//         'Content-Type: application/json',
//         'Content-Length: ' . $contentLength,
//         'Accept: application/json',
//         'Authorization: Basic ' . $apiKey
//     );

//     $curl = curl_init();
//     curl_setopt($curl, CURLOPT_CUSTOMREQUEST, "POST");
//     curl_setopt($curl, CURLOPT_POSTFIELDS, $requestJson);
//     curl_setopt($curl, CURLOPT_URL, $endpointUrl);
//     curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
//     curl_setopt($curl, CURLOPT_HTTPHEADER, $headers);
//     curl_setopt($curl, CURLOPT_FAILONERROR, false);
//     curl_setopt($curl, CURLOPT_SSL_VERIFYPEER, false);

//     $rawResponse = curl_exec($curl);

//     $response = json_decode($rawResponse);

//     if($response->meta->result == false) {
//         die($response->meta->message->merchant);
//     }
//     //Credit was a success
// }
// function delete()
// {
//     $accessToken = "YOUR-ACCESS-TOKEN";
//     $merchantNumber = "YOUR-MERCHANT-NUMBER";
//     $secretToken = "YOUR-SECRET-TOKEN";
//     $apiKey = base64_encode(
//       $accessToken . "@" . $merchantNumber . ":" . $secretToken
//     );

//     $transactionId = "ID of the transaction to delete.";
//     $endpointUrl = "https://transaction-v1.api-eu.bambora.com/transactions/".
//                     $transactionId."/delete";

//     $headers = array(
//         'Content-Type: application/json',
//         'Content-Length: ' . 0,
//         'Accept: application/json',
//         'Authorization: Basic ' . $apiKey
//     );

//     $curl = curl_init();
//     curl_setopt($curl, CURLOPT_CUSTOMREQUEST, "POST");
//     curl_setopt($curl, CURLOPT_URL, $endpointUrl);
//     curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
//     curl_setopt($curl, CURLOPT_HTTPHEADER, $headers);
//     curl_setopt($curl, CURLOPT_FAILONERROR, false);
//     curl_setopt($curl, CURLOPT_SSL_VERIFYPEER, false);

//     $rawResponse = curl_exec($curl);

//     $response = json_decode($rawResponse);

//     if($response->meta->result == false) {
//         die($response->meta->message->merchant);
//     }
//     //Delete was a success
// }
// function getTransaction()
// {
//     $accessToken = "YOUR-ACCESS-TOKEN";
//     $merchantNumber = "YOUR-MERCHANT-NUMBER";
//     $secretToken = "YOUR-SECRET-TOKEN";
//     $apiKey = base64_encode(
//         $accessToken . "@" . $merchantNumber . ":" . $secretToken
//     );

//     $transactionId = "ID of the transaction.";
//     $endpointUrl = "https://merchant-v1.api-eu.bambora.com/transactions/".$transactionId;

//     $headers = array(
//         'Content-Type: application/json',
//         'Content-Length: ' . 0,
//         'Accept: application/json',
//         'Authorization: Basic ' . $apiKey
//     );

//     $curl = curl_init();
//     curl_setopt($curl, CURLOPT_CUSTOMREQUEST, "GET");
//     curl_setopt($curl, CURLOPT_URL, $endpointUrl);
//     curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
//     curl_setopt($curl, CURLOPT_HTTPHEADER, $headers);
//     curl_setopt($curl, CURLOPT_FAILONERROR, false);
//     curl_setopt($curl, CURLOPT_SSL_VERIFYPEER, false);

//     $rawResponse = curl_exec($curl);

//     $response = json_decode($rawResponse);

//     if($response->meta->result == false) {
//         die($response->meta->message->merchant);
//     }

//     $transaction = $response->transaction;
//     //$transaction contains all the informations releated to the payment.
// }
// function getTransactionOperations()
// {
//     $accessToken = "YOUR-ACCESS-TOKEN";
//     $merchantNumber = "YOUR-MERCHANT-NUMBER";
//     $secretToken = "YOUR-SECRET-TOKEN";
//     $apiKey = base64_encode(
//         $accessToken . "@" . $merchantNumber . ":" . $secretToken
//     );

//     $transactionId = "ID of the transaction.";
//     $endpointUrl = "https://merchant-v1.api-eu.bambora.com/transactions/".
//                     $transactionId."/transactionoperations";

//     $headers = array(
//         'Content-Type: application/json',
//         'Content-Length: ' . 0,
//         'Accept: application/json',
//         'Authorization: Basic ' . $apiKey
//     );

//     $curl = curl_init();
//     curl_setopt($curl, CURLOPT_CUSTOMREQUEST, "GET");
//     curl_setopt($curl, CURLOPT_URL, $endpointUrl);
//     curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
//     curl_setopt($curl, CURLOPT_HTTPHEADER, $headers);
//     curl_setopt($curl, CURLOPT_FAILONERROR, false);
//     curl_setopt($curl, CURLOPT_SSL_VERIFYPEER, false);

//     $rawResponse = curl_exec($curl);

//     $response = json_decode($rawResponse);

//     if($response->meta->result == false) {
//         die($response->meta->message->merchant);
//     }

//     $transactionoperations = $response->transactionoperations;
//     //$transactionoperations contains all the informations releated to the payment.
// }
// function listPaymentTypes()
// {
//     $accessToken = "YOUR-ACCESS-TOKEN";
//     $merchantNumber = "YOUR-MERCHANT-NUMBER";
//     $secretToken = "YOUR-SECRET-TOKEN";
//     $apiKey = base64_encode(
//         $accessToken . "@" . $merchantNumber . ":" . $secretToken
//     );

//     $currency = "DKK";
//     $amount = "118";
//     $endpointUrl = "https://merchant-v1.api-eu.bambora.com/paymenttypes?currency=". 
//                     $currency. "&amount=" . $amount;

//     $headers = array(
//         'Content-Type: application/json',
//         'Content-Length: ' . 0,
//         'Accept: application/json',
//         'Authorization: Basic ' . $apiKey
//     );

//     $curl = curl_init();
//     curl_setopt($curl, CURLOPT_CUSTOMREQUEST, "GET");
//     curl_setopt($curl, CURLOPT_URL, $endpointUrl);
//     curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
//     curl_setopt($curl, CURLOPT_HTTPHEADER, $headers);
//     curl_setopt($curl, CURLOPT_FAILONERROR, false);
//     curl_setopt($curl, CURLOPT_SSL_VERIFYPEER, false);

//     $rawResponse = curl_exec($curl);

//     $response = json_decode($rawResponse);

//     if($response->meta->result == false) {
//         die($response->meta->message->merchant);
//     }

//     $paymentCollections = $response->paymentcollections;
//     //$paymentCollections contains all the supported payment types.
// }
// function authorizeSubscription()
// {
//     $accessToken = "YOUR-ACCESS-TOKEN";
//     $merchantNumber = "YOUR-MERCHANT-NUMBER";
//     $secretToken = "YOUR-SECRET-TOKEN";
//     $apiKey = base64_encode(
//         $accessToken . "@" . $merchantNumber . ":" . $secretToken
//     );

//     $subscriptionId = "ID of the subscription to authorize.";;
//     $endpointUrl = "https://subscription-v1.api-eu.bambora.com/subscriptions/".
//                     $subscriptionId."/authorize";

//     $request = array();
//     $request["authorize"] = array();
//     $request["authorize"]["amount"] = 195;
//     $request["authorize"]["currency"] = "DKK";
//     $request["authorize"]["orderid"] = "order1234";

//     $requestJson = json_encode($request);

//     $contentLength = isset($requestJson) ? strlen($requestJson) : 0;
//     $headers = array(
//         'Content-Type: application/json',
//         'Content-Length: ' . $contentLength,
//         'Accept: application/json',
//         'Authorization: Basic ' . $apiKey
//     );

//     $curl = curl_init();
//     curl_setopt($curl, CURLOPT_CUSTOMREQUEST, "POST");
//     curl_setopt($curl, CURLOPT_POSTFIELDS, $requestJson);
//     curl_setopt($curl, CURLOPT_URL, $endpointUrl);
//     curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
//     curl_setopt($curl, CURLOPT_HTTPHEADER, $headers);
//     curl_setopt($curl, CURLOPT_FAILONERROR, false);
//     curl_setopt($curl, CURLOPT_SSL_VERIFYPEER, false);

//     $rawResponse = curl_exec($curl);

//     $response = json_decode($rawResponse);

//     if($response->meta->result == false) {
//         die($response->meta->message->merchant);
//     }
//     //Authorize subscription was a success
// }
// function deleteSubscription()
// {
//     $accessToken = "YOUR-ACCESS-TOKEN";
//     $merchantNumber = "YOUR-MERCHANT-NUMBER";
//     $secretToken = "YOUR-SECRET-TOKEN";
//     $apiKey = base64_encode(
//         $accessToken . "@" . $merchantNumber . ":" . $secretToken
//     );

//     $subscriptionId = "ID of the subscription to delete.";
//     $endpointUrl = "https://subscription-v1.api-eu.bambora.com/subscriptions/".$subscriptionId;

//     $headers = array(
//         'Content-Type: application/json',
//         'Content-Length: ' . 0,
//         'Accept: application/json',
//         'Authorization: Basic ' . $apiKey
//     );

//     $curl = curl_init();
//     curl_setopt($curl, CURLOPT_CUSTOMREQUEST, "DELETE");
//     curl_setopt($curl, CURLOPT_URL, $endpointUrl);
//     curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
//     curl_setopt($curl, CURLOPT_HTTPHEADER, $headers);
//     curl_setopt($curl, CURLOPT_FAILONERROR, false);
//     curl_setopt($curl, CURLOPT_SSL_VERIFYPEER, false);

//     $rawResponse = curl_exec($curl);

//     $response = json_decode($rawResponse);

//     if($response->meta->result == false) {
//         die($response->meta->message->merchant);
//     }
//     //Delete subscription was a success
// }