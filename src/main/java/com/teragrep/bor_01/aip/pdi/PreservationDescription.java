package com.teragrep.bor_01.aip.pdi;

import com.teragrep.bor_01.Jsonable;

public interface PreservationDescription extends Jsonable {
    Reference reference();
    Provenance provenance();
    Context context();
    Fixity fixity();
    AccessRights accessRights();
}
