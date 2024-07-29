package com.ms.user.dtos;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailDTO {
   private UUID userId;
    private String emailTo;
    private String subject;
    private String text;
}
