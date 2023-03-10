package ru.set404.clients.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
public class AppointmentsForSiteDTO {
    @NotNull(message = "Not be empty")
    private Long id;
    @NotEmpty(message = "Not be empty")
    private String title;
    @NotEmpty(message = "Not be empty")
    private String category;
    @NotNull(message = "Not be empty")
    private LocalDateTime start;
    @NotNull(message = "Not be empty")
    private LocalDateTime end;
}
