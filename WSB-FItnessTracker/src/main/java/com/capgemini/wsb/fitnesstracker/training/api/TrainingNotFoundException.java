package com.capgemini.wsb.fitnesstracker.training.api;

import com.capgemini.wsb.fitnesstracker.exception.api.NotFoundException;

/**
 * Exception indicating that the {@link Training} was not found.
 */
@SuppressWarnings("squid:S110")
public class TrainingNotFoundException extends NotFoundException {

    /**
     * Constructs a new {@code TrainingNotFoundException} with the specified detail message.
     *
     * @param message the detail message
     */
    private TrainingNotFoundException(String message) {
        super(message);
    }

    /**
     * Constructs a new {@code TrainingNotFoundException} for a training with the specified ID.
     *
     * @param id the ID of the training that was not found
     */
    public TrainingNotFoundException(Long id) {
        this("Training with ID=%s was not found".formatted(id));
    }

}
