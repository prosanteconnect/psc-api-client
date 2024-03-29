package fr.ans.psc.api;

import fr.ans.psc.ApiClient;

import fr.ans.psc.model.Ps;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-23T09:52:58.504Z[GMT]")@Component("fr.ans.psc.api.PsApi")
public class PsApi {
    private ApiClient apiClient;

    public PsApi() {
        this(new ApiClient());
    }

    @Autowired
    public PsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create new Ps
     * Create a new Ps
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>409</b> - Ps already exists
     * @param body The Ps to be created (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void createNewPs(Ps body) throws RestClientException {
        createNewPsWithHttpInfo(body);
    }

    /**
     * Create new Ps
     * Create a new Ps
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>409</b> - Ps already exists
     * @param body The Ps to be created (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createNewPsWithHttpInfo(Ps body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createNewPs");
        }
        String path = UriComponentsBuilder.fromPath("/v2/ps").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete Ps by id
     * Delete a PS by its id
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>410</b> - Not Found
     * @param psId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deletePsById(String psId) throws RestClientException {
        deletePsByIdWithHttpInfo(psId);
    }

    /**
     * Delete Ps by id
     * Delete a PS by its id
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>410</b> - Not Found
     * @param psId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deletePsByIdWithHttpInfo(String psId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'psId' is set
        if (psId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'psId' when calling deletePsById");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("psId", psId);
        String path = UriComponentsBuilder.fromPath("/v2/ps/{psId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Physical delete of Ps
     * completely delete Ps (not only deactivate it)
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>410</b> - Not Found
     * @param psId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void forceDeletePsById(String psId) throws RestClientException {
        forceDeletePsByIdWithHttpInfo(psId);
    }

    /**
     * Physical delete of Ps
     * completely delete Ps (not only deactivate it)
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>410</b> - Not Found
     * @param psId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> forceDeletePsByIdWithHttpInfo(String psId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'psId' is set
        if (psId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'psId' when calling forceDeletePsById");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("psId", psId);
        String path = UriComponentsBuilder.fromPath("/v2/ps/force/{psId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Ps by id
     * get a Ps by one of its idNationalRef
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>410</b> - Not Found
     * @param psId  (required)
     * @return Ps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Ps getPsById(String psId) throws RestClientException {
        return getPsByIdWithHttpInfo(psId, null).getBody();
    }

    /**
     * Get Ps by id
     * get a Ps by one of its idNationalRef
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>410</b> - Not Found
     * @param psId  (required)
     * @return Ps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Ps getPsById(String psId, String include) throws RestClientException {
        return getPsByIdWithHttpInfo(psId, include).getBody();
    }

    /**
     * Get Ps by id
     * get a Ps by one of its idNationalRef
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>410</b> - Not Found
     * @param psId  (required)
     * @return ResponseEntity&lt;Ps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Ps> getPsByIdWithHttpInfo(String psId, String include) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'psId' is set
        if (psId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'psId' when calling getPsById");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("psId", psId);
        String path = UriComponentsBuilder.fromPath("/v2/ps/{psId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include", include));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);

        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Ps> returnType = new ParameterizedTypeReference<Ps>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Get a list of Ps by page
     * Retrieve the information of all the Ps on the specified page.
     * <p><b>200</b> - Ps page found
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Ps page not Found
     * <p><b>410</b> - Gone
     * @param page  (required)
     * @param size  (optional)
     * @return List&lt;Ps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Ps> getPsByPage(BigDecimal page, BigDecimal size) throws RestClientException {
        return getPsByPageWithHttpInfo(page, size).getBody();
    }

    /**
     * Get a list of Ps by page
     * Retrieve the information of all the Ps on the specified page.
     * <p><b>200</b> - Ps page found
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Ps page not Found
     * <p><b>410</b> - Gone
     * @param page  (required)
     * @param size  (optional)
     * @return ResponseEntity&lt;List&lt;Ps&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Ps>> getPsByPageWithHttpInfo(BigDecimal page, BigDecimal size) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'page' when calling getPsByPage");
        }
        String path = UriComponentsBuilder.fromPath("/v2/ps").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Ps>> returnType = new ParameterizedTypeReference<List<Ps>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Update Ps
     * Update Ps
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>410</b> - Not Found
     * @param body  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updatePs(Ps body) throws RestClientException {
        updatePsWithHttpInfo(body);
    }

    /**
     * Update Ps
     * Update Ps
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>410</b> - Not Found
     * @param body  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updatePsWithHttpInfo(Ps body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updatePs");
        }
        String path = UriComponentsBuilder.fromPath("/v2/ps").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
