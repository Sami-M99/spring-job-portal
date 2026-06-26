package com.sami.jobportal_demo.contact.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.sami.jobportal_demo.contact.entity.Contact}
 */
public record ContactRequestDto(String email, String message, String name, String subject,
                                String userType) implements Serializable {
}