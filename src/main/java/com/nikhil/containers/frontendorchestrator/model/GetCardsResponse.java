package com.nikhil.containers.frontendorchestrator.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCardsResponse {
    private String status;
    private Integer code;
    private Integer total;
    private List<Card> data;

    public GetCardsResponse() {
    }

    public GetCardsResponse(String status, Integer code, Integer total, List<Card> data) {
        this.status = status;
        this.code = code;
        this.total = total;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Card> getData() {
        return data;
    }

    public void setData(List<Card> data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GetCardsResponse)) return false;
        GetCardsResponse that = (GetCardsResponse) o;
        return Objects.equals(getStatus(), that.getStatus()) &&
                Objects.equals(getCode(), that.getCode()) &&
                Objects.equals(getTotal(), that.getTotal()) &&
                Objects.equals(getData(), that.getData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStatus(), getCode(), getTotal(), getData());
    }

    @Override
    public String toString() {
        return "GetCardsResponse{" +
                "status='" + status + '\'' +
                ", code=" + code +
                ", total=" + total +
                ", data=" + data +
                '}';
    }
}
