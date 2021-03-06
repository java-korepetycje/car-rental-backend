
package com.app.car.rental.backend.api.avis.model.reservation.get.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "doors",
    "seats",
    "luggage_capacity"
})
public class Capacity {

    @JsonProperty("doors")
    private String doors;
    @JsonProperty("seats")
    private String seats;
    @JsonProperty("luggage_capacity")
    private LuggageCapacity luggageCapacity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("doors")
    public String getDoors() {
        return doors;
    }

    @JsonProperty("doors")
    public void setDoors(String doors) {
        this.doors = doors;
    }

    @JsonProperty("seats")
    public String getSeats() {
        return seats;
    }

    @JsonProperty("seats")
    public void setSeats(String seats) {
        this.seats = seats;
    }

    @JsonProperty("luggage_capacity")
    public LuggageCapacity getLuggageCapacity() {
        return luggageCapacity;
    }

    @JsonProperty("luggage_capacity")
    public void setLuggageCapacity(LuggageCapacity luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
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
        return new ToStringBuilder(this).append("doors", doors).append("seats", seats).append("luggageCapacity", luggageCapacity).append("additionalProperties", additionalProperties).toString();
    }

}
