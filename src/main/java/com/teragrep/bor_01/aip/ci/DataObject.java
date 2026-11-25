package com.teragrep.bor_01.aip.ci;

import com.teragrep.bor_01.Jsonable;

public interface DataObject extends Jsonable {
    String path();
    String namespace();
    String storageURI(); // not yet in db

}
