package com.iamneo.security.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder 
@NoArgsConstructor
@AllArgsConstructor
public class LeaveRequest {
    private String leave_from_date;
    private String leave_to_date;
    private String reason;
}
