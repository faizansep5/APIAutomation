package com.api.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.NoArgsConstructor
@lombok.Data
public class AddRequest {
    private String name;
    private DataDTO data;


    @lombok.NoArgsConstructor
    @lombok.Data
    public static class DataDTO {
        @JsonProperty("year")
        private Integer year;
        @JsonProperty("price")
        private Double price;
        @JsonProperty("CPU model")
        private String cpuModel;
        @JsonProperty("Hard disk size")
        private String hardDiskSize;
    }
}
