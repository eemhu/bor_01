package com.teragrep.bor_01.aip.ci;

import com.teragrep.bor_01.Jsonable;

public interface Representation extends Jsonable {
    String sourceType();
    String objectFormat();
}
