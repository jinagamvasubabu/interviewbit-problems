package com.parser;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
public class LockedInventoryItemDto {
    private String entityCode;
    private String itemCode;
    private LocalDate dispatchDate;
    private Integer quantity;
}
