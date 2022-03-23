/*
 * psc-api-maj-v2
 * API CRUD for Personnels et Structures de santé
 *
 * OpenAPI spec version: 2.0
 * Contact: superviseurs.psc@esante.gouv.fr
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package fr.ans.psc.api;

import fr.ans.psc.model.Error;
import fr.ans.psc.model.Ps;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PsApi
 */
@Ignore
public class PsApiTest {

    private final PsApi api = new PsApi();

    /**
     * Create new Ps
     *
     * Create a new Ps
     *
     */
    @Test
    public void createNewPsTest() {
        Ps body = null;
        api.createNewPs(body);

        // TODO: test validations
    }
    /**
     * Delete Ps by id
     *
     * Delete a PS by its id
     *
     */
    @Test
    public void deletePsByIdTest() {
        String psId = null;
        api.deletePsById(psId);

        // TODO: test validations
    }
    /**
     * Physical delete of Ps
     *
     * completely delete Ps (not only deactivate it)
     *
     */
    @Test
    public void forceDeletePsByIdTest() {
        String psId = null;
        api.forceDeletePsById(psId);

        // TODO: test validations
    }
    /**
     * Get Ps by id
     *
     * get a Ps by one of its idNationalRef
     *
     */
    @Test
    public void getPsByIdTest() {
        String psId = null;
        Ps response = api.getPsById(psId);

        // TODO: test validations
    }
    /**
     * Update Ps
     *
     * Update Ps
     *
     */
    @Test
    public void updatePsTest() {
        Ps body = null;
        api.updatePs(body);

        // TODO: test validations
    }
}
