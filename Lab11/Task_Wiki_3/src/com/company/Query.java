package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "search",
        "searchinfo"
})
public class Query {

    @JsonProperty("search")
    private List<Search> search = null;
    @JsonProperty("searchinfo")
    private Searchinfo searchinfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("search")
    public List<Search> getSearch() {
        return search;
    }

    @JsonProperty("search")
    public void setSearch(List<Search> search) {
        this.search = search;
    }

    @JsonProperty("searchinfo")
    public Searchinfo getSearchinfo() {
        return searchinfo;
    }

    @JsonProperty("searchinfo")
    public void setSearchinfo(Searchinfo searchinfo) {
        this.searchinfo = searchinfo;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
