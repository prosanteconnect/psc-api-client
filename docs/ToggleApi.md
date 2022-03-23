# ToggleApi

All URIs are relative to *http://localhost:8080/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**togglePsref**](ToggleApi.md#togglePsref) | **PUT** /v2/toggle | toggle PsRef mapping

<a name="togglePsref"></a>
# **togglePsref**
> String togglePsref(body)

toggle PsRef mapping

Toggle PsRef mapping

### Example
```java
// Import classes:
//import fr.ans.psc.ApiException;
//import fr.ans.psc.api.ToggleApi;


ToggleApi apiInstance = new ToggleApi();
PsRef body = new PsRef(); // PsRef | 
try {
    String result = apiInstance.togglePsref(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToggleApi#togglePsref");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PsRef**](PsRef.md)|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json

