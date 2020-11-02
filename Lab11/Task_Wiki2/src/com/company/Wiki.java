

package com.company;
//-----------------------------------com.company.Continue.java-----------------------------------

//        package com.company;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "sroffset",
        "continue"
})
public class Continue {

    @JsonProperty("sroffset")
    private Integer sroffset;
    @JsonProperty("continue")
    private String _continue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sroffset")
    public Integer getSroffset() {
        return sroffset;
    }

    @JsonProperty("sroffset")
    public void setSroffset(Integer sroffset) {
        this.sroffset = sroffset;
    }

    @JsonProperty("continue")
    public String getContinue() {
        return _continue;
    }

    @JsonProperty("continue")
    public void setContinue(String _continue) {
        this._continue = _continue;
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
//-----------------------------------com.company.Example.java-----------------------------------

//        package com.company;

//        import java.util.HashMap;
//        import java.util.Map;
//        import com.fasterxml.jackson.annotation.JsonAnyGetter;
//        import com.fasterxml.jackson.annotation.JsonAnySetter;
//        import com.fasterxml.jackson.annotation.JsonIgnore;
//        import com.fasterxml.jackson.annotation.JsonInclude;
//        import com.fasterxml.jackson.annotation.JsonProperty;
//        import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "batchcomplete",
        "continue",
        "query"
})
public class Example {

    @JsonProperty("batchcomplete")
    private String batchcomplete;
    @JsonProperty("continue")
    private Continue _continue;
    @JsonProperty("query")
    private Query query;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("batchcomplete")
    public String getBatchcomplete() {
        return batchcomplete;
    }

    @JsonProperty("batchcomplete")
    public void setBatchcomplete(String batchcomplete) {
        this.batchcomplete = batchcomplete;
    }

    @JsonProperty("continue")
    public Continue getContinue() {
        return _continue;
    }

    @JsonProperty("continue")
    public void setContinue(Continue _continue) {
        this._continue = _continue;
    }

    @JsonProperty("query")
    public Query getQuery() {
        return query;
    }

    @JsonProperty("query")
    public void setQuery(Query query) {
        this.query = query;
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
//-----------------------------------com.company.Query.java-----------------------------------
//
//        package com.company;
//
//        import java.util.HashMap;
//        import java.util.List;
//        import java.util.Map;
//        import com.fasterxml.jackson.annotation.JsonAnyGetter;
//        import com.fasterxml.jackson.annotation.JsonAnySetter;
//        import com.fasterxml.jackson.annotation.JsonIgnore;
//        import com.fasterxml.jackson.annotation.JsonInclude;
//        import com.fasterxml.jackson.annotation.JsonProperty;
//        import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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
//-----------------------------------com.company.Search.java-----------------------------------
//
//        package com.company;
//
//        import java.util.HashMap;
//        import java.util.Map;
//        import com.fasterxml.jackson.annotation.JsonAnyGetter;
//        import com.fasterxml.jackson.annotation.JsonAnySetter;
//        import com.fasterxml.jackson.annotation.JsonIgnore;
//        import com.fasterxml.jackson.annotation.JsonInclude;
//        import com.fasterxml.jackson.annotation.JsonProperty;
//        import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "snippet",
        "wordcount",
        "size",
        "ns",
        "title",
        "pageid",
        "timestamp"
})
public class Search {

    @JsonProperty("snippet")
    private String snippet;
    @JsonProperty("wordcount")
    private Integer wordcount;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("ns")
    private Integer ns;
    @JsonProperty("title")
    private String title;
    @JsonProperty("pageid")
    private Integer pageid;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("snippet")
    public String getSnippet() {
        return snippet;
    }

    @JsonProperty("snippet")
    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    @JsonProperty("wordcount")
    public Integer getWordcount() {
        return wordcount;
    }

    @JsonProperty("wordcount")
    public void setWordcount(Integer wordcount) {
        this.wordcount = wordcount;
    }

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonProperty("ns")
    public Integer getNs() {
        return ns;
    }

    @JsonProperty("ns")
    public void setNs(Integer ns) {
        this.ns = ns;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("pageid")
    public Integer getPageid() {
        return pageid;
    }

    @JsonProperty("pageid")
    public void setPageid(Integer pageid) {
        this.pageid = pageid;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
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
//-----------------------------------com.company.Searchinfo.java-----------------------------------
//
//        package com.company;
//
//        import java.util.HashMap;
//        import java.util.Map;
//        import com.fasterxml.jackson.annotation.JsonAnyGetter;
//        import com.fasterxml.jackson.annotation.JsonAnySetter;
//        import com.fasterxml.jackson.annotation.JsonIgnore;
//        import com.fasterxml.jackson.annotation.JsonInclude;
//        import com.fasterxml.jackson.annotation.JsonProperty;
//        import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "totalhits"
})
public class Searchinfo {

    @JsonProperty("totalhits")
    private Integer totalhits;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("totalhits")
    public Integer getTotalhits() {
        return totalhits;
    }

    @JsonProperty("totalhits")
    public void setTotalhits(Integer totalhits) {
        this.totalhits = totalhits;
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









//
//public class Wiki<JSON> {
//
//    private String query;
//
//    public String getQuery() {
//        return query;
//    }
//    private int pageid;
//
//    public int getPageId(){
//        return pageid;
//    }
//
//    private String search;
//
//    public String getSearch(){
//        return search;
//    }
//
//    private int number;
//
//    public int getNumber(){
//        return number;
//    }
//
//    private String snippet;
//
//    public String getSnippet() {
//        return snippet;
//    }
//
//    private String title;
//
//    public String getTitle() {
//        return title;
//    }
//
//    private int size;
//    public int getSize(){
//        return size;
//    }
//
//    private int wordcount;
//    public int getWordcount(){
//        return wordcount;
//    }
//
//}
