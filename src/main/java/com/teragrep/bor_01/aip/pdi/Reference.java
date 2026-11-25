package com.teragrep.bor_01.aip.pdi;

import com.teragrep.bor_01.Jsonable;
import com.teragrep.bor_01.aip.BloomFilter;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public interface Reference extends Jsonable {
    Instant epochHour();
    String configurationItem();
    String sourceSystem();
    List<BloomFilter> bloomFilters();
    UUID id();
}
