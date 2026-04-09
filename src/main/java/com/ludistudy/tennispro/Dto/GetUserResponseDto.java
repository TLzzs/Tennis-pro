package com.ludistudy.tennispro.Dto;

import java.util.UUID;

public record GetUserResponseDto(UUID id,
                                 String name,
                                 Integer age,
                                 Double utrScore,
                                 Integer experience) {
}
