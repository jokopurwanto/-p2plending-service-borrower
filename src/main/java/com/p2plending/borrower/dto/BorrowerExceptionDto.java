package com.p2plending.borrower.dto;

import lombok.*;

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
public class BorrowerExceptionDto {
    private final Integer status;
    private final String message;
    private final Throwable throwable;
}
