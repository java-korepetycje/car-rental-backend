
package com.app.car.rental.backend.api.avis.model.rate;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "request_time",
    "success"
})
public class Status {

    @JsonProperty("request_time")
    private String requestTime;
    @JsonProperty("success")
    private List<Success> success = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("request_time")
    public String getRequestTime() {
        return requestTime;
    }

    @JsonProperty("request_time")
    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    @JsonProperty("success")
    public List<Success> getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(List<Success> success) {
        this.success = success;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Status{");
        sb.append("requestTime='").append(requestTime).append('\'');
        sb.append(", success=").append(success);
        sb.append(", additionalProperties=").append(additionalProperties);
        sb.append('}');
        return sb.toString();
    }
}
