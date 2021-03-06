
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
 * <p>Original spec-file type: FetchData</p>
 * <pre>
 * Ouput of the fetch_data function
 * data_matrix: a pandas dataframe
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "data_matrix"
})
public class FetchData {

    @JsonProperty("data_matrix")
    private Map<String, String> dataMatrix;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("data_matrix")
    public Map<String, String> getDataMatrix() {
        return dataMatrix;
    }

    @JsonProperty("data_matrix")
    public void setDataMatrix(Map<String, String> dataMatrix) {
        this.dataMatrix = dataMatrix;
    }

    public FetchData withDataMatrix(Map<String, String> dataMatrix) {
        this.dataMatrix = dataMatrix;
        return this;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        return ((((("FetchData"+" [dataMatrix=")+ dataMatrix)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
