package ru.set404.clients.dto;

import lombok.AllArgsConstructor;
import ru.set404.clients.models.Appointment;

import java.util.List;
import java.util.Objects;

@AllArgsConstructor
public class TherapistDTO {
    private String name;
    private String phone;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}