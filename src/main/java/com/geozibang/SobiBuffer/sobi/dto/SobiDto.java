package com.geozibang.SobiBuffer.sobi.dto;

import com.geozibang.SobiBuffer.date.entity.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SobiDto {
    private Long id;
    private Long ranking;
    private String category;
    private String sobiname;
    private Long money;
    private Long checking;
    private Date date;
}
