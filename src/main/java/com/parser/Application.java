package com.parser;

import java.time.LocalDate;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<LockedInventoryItemDto> lockedInventoryItemDtos = new ArrayList<>();

        LocalDate date = LocalDate.now();
        LockedInventoryItemDto item1 = LockedInventoryItemDto
                .builder().itemCode("pr1").dispatchDate(date).entityCode("DC1").quantity(1).build();
        LockedInventoryItemDto item2 = LockedInventoryItemDto
                .builder().itemCode("pr1").dispatchDate(date.plusDays(1)).entityCode("DC1").quantity(2).build();
        LockedInventoryItemDto item3 = LockedInventoryItemDto
                .builder().itemCode("pr2").dispatchDate(date.plusDays(2)).entityCode("DC1").quantity(2).build();
        LockedInventoryItemDto item4 = LockedInventoryItemDto
                .builder().itemCode("pr1").dispatchDate(date.plusDays(1000)).entityCode("DC1").quantity(3).build();
        LockedInventoryItemDto item5 = LockedInventoryItemDto
                .builder().itemCode("pr2").dispatchDate(date.plusDays(1000)).entityCode("DC1").quantity(4).build();


        Comparator<LockedInventoryItemDto> comparator = Comparator.comparing(LockedInventoryItemDto::getDispatchDate)
                .thenComparing(LockedInventoryItemDto::getItemCode)
                .thenComparing(LockedInventoryItemDto::getEntityCode);

        TreeMap<LockedInventoryItemDto, LockedInventoryItemDto> treeMap = new TreeMap<>(comparator);

        treeMap.put(item1, item1);
        treeMap.put(item2, item2);
        treeMap.put(item3, item3);
        treeMap.put(item4, item4);
        treeMap.put(item5, item5);

        List<LockedInventoryItemDto> listItems = new ArrayList<>();
        listItems.add(item1);
        listItems.add(item2);
        listItems.add(item3);
        listItems.add(item4);
        listItems.add(item5);

        listItems.sort(comparator);

        System.out.println(listItems);
        System.out.println(treeMap);

    }
}
