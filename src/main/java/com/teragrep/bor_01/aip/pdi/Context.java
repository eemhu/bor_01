package com.teragrep.bor_01.aip.pdi;

import com.teragrep.bor_01.Jsonable;

public interface Context extends Jsonable {
    String logtag();
    String hostname();
    String organization();
}
