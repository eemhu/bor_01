package com.teragrep.bor_01.aip.ci;

import com.teragrep.bor_01.Jsonable;

public interface Content extends Jsonable {
    Representation representation();
    DataObject dataObject();
}
