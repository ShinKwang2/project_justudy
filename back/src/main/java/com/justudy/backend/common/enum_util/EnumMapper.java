package com.justudy.backend.common.enum_util;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EnumMapper {

    private Map<String, List<EnumValue>> factory = new LinkedHashMap<>();

    private List<EnumValue> toEnumValues(Class<? extends EnumModel> e) {

        return Arrays
                .stream(e.getEnumConstants())
                .map(EnumValue::new)
                .collect(Collectors.toList());
    }

    public void put(String key, Class<? extends EnumModel> e) {
        factory.put(key, toEnumValues(e));
    }

    public Map<String, List<EnumValue>> getAll() {
        return factory;
    }

    public Map<String, List<EnumValue>> get(String keys) {

        return Arrays
                .stream(keys.split(","))
                .collect(Collectors.toMap(Function.identity(), key -> factory.get(key)));
    }
}
