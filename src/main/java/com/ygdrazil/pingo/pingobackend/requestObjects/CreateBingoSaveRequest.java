package com.ygdrazil.pingo.pingobackend.requestObjects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateBingoSaveRequest {
    private String urlCode;
    private String gridCompletion;
}