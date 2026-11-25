package com.teragrep.bor_01.aip;

import com.teragrep.bor_01.Jsonable;
import com.teragrep.bor_01.aip.ci.Content;
import com.teragrep.bor_01.aip.pdi.PreservationDescription;

public interface ArchiveInformationPackage extends Jsonable {
    Content content();
    PreservationDescription preservationDescription();
}