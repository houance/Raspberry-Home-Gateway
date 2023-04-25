package com.rashome.gateway.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 发送到后端服务器的设备 VO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeviceVO {

    @JsonProperty(value = "health_check_url")
    private String healthCheckUrl;

    // 默认值是 30s
    @JsonProperty(value = "health_check_rate")
    private String healthCheckRate = "30";

    @JsonProperty(value = "device_information")
    private String deviceInformation;

    @JsonProperty(value = "device_uuid")
    private String deviceUuid;

    @JsonProperty(value = "device_tag")
    private String deviceTag;
    
}
