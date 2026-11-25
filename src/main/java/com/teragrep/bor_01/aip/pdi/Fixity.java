package com.teragrep.bor_01.aip.pdi;

import com.teragrep.bor_01.Jsonable;

import java.time.Instant;

public interface Fixity extends Jsonable {
    byte[] sha256Hash();
    Instant epochExpires();
}
