package br.com.nailDesigner.auth.api.Dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(
		@NotBlank @Size(min = 3) String username,
		@NotBlank @Email String email,
		@NotBlank @Size(min = 6) String password
		) {}
