package com.team5.api2.dto;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class getDirectionsRequest {

    private String locationFrom;

    private String locationTo;

}