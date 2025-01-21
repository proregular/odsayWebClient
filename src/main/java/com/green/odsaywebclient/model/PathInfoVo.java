package com.green.odsaywebclient.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class PathInfoVo {
    private final int totalTime;
    private final int payment;
    private final double totalDistance;
}
