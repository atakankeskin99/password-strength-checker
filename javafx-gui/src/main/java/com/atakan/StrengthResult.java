package com.atakan;

import java.util.List;

public record StrengthResult(
        int score,
        String verdict,
        List<String> feedback
) {}
