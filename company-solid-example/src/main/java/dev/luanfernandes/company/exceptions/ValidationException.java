package dev.luanfernandes.company.exceptions;

import java.io.Serial;

public class ValidationException extends RuntimeException {

	@Serial
	private static final long serialVersionUID = -6236323860875996055L;

	public ValidationException(String message) {
		super(message);
	}
}
