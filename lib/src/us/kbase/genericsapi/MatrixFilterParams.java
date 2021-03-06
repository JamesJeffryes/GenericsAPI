
package us.kbase.genericsapi;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: MatrixFilterParams</p>
 * <pre>
 * Input of the filter_matrix function
 * matrix_obj_ref: object reference of a matrix
 * workspace_name: workspace name objects to be saved to
 * feature_ids: string of feature ids that result matrix contains
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "matrix_obj_ref",
    "workspace_name",
    "feature_ids"
})
public class MatrixFilterParams {

    @JsonProperty("matrix_obj_ref")
    private String matrixObjRef;
    @JsonProperty("workspace_name")
    private String workspaceName;
    @JsonProperty("feature_ids")
    private String featureIds;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("matrix_obj_ref")
    public String getMatrixObjRef() {
        return matrixObjRef;
    }

    @JsonProperty("matrix_obj_ref")
    public void setMatrixObjRef(String matrixObjRef) {
        this.matrixObjRef = matrixObjRef;
    }

    public MatrixFilterParams withMatrixObjRef(String matrixObjRef) {
        this.matrixObjRef = matrixObjRef;
        return this;
    }

    @JsonProperty("workspace_name")
    public String getWorkspaceName() {
        return workspaceName;
    }

    @JsonProperty("workspace_name")
    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public MatrixFilterParams withWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    @JsonProperty("feature_ids")
    public String getFeatureIds() {
        return featureIds;
    }

    @JsonProperty("feature_ids")
    public void setFeatureIds(String featureIds) {
        this.featureIds = featureIds;
    }

    public MatrixFilterParams withFeatureIds(String featureIds) {
        this.featureIds = featureIds;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((("MatrixFilterParams"+" [matrixObjRef=")+ matrixObjRef)+", workspaceName=")+ workspaceName)+", featureIds=")+ featureIds)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
