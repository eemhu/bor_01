package com.teragrep.bor_01.aip;

import com.teragrep.bor_01.Jsonable;

import java.util.regex.Pattern;

public interface BloomFilter extends Jsonable {
    byte[] filterBytes();
    Pattern regexPattern();
    long expectedElements();
    double targetFalsePositiveProbability();
}
