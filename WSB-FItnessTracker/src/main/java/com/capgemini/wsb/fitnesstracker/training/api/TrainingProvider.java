package com.capgemini.wsb.fitnesstracker.training.api;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Interface for managing Training entities.
 */
public interface TrainingProvider {

    /**
     * Finds all trainings associated with a specific user ID.
     *
     * @param userId the ID of the user whose trainings are to be retrieved
     * @return a list of trainings associated with the specified user ID
     */
    List<Training> findTrainingsByUserId(Long userId);

    /**
     * Retrieves all trainings available in the system.
     *
     * @return a list of all trainings
     */
    List<Training> findAllTrainings();

    /**
     * Retrieves all trainings associated with the currently authenticated user.
     *
     * @return a list of trainings associated with the currently authenticated user
     */
    List<Training> findMyTrainings();

    /**
     * Creates a new training in the database.
     *
     * @param training the training to be added
     * @return the created training
     */
    Training createTraining(Training training);

    /**
     * Retrieves a training based on its ID.
     * If the training with the given ID is not found, then {@link Optional#empty()} will be returned.
     *
     * @param trainingId the ID of the training to be searched
     * @return an {@link Optional} containing the located Training, or {@link Optional#empty()} if not found
     */
    Optional<Training> getTraining(Long trainingId);

    /**
     * Updates an existing training with new details.
     *
     * @param trainingId      the ID of the training to be updated
     * @param trainingDetails the new details of the training
     * @return the updated training
     */
    Training updateTraining(Long trainingId, Training trainingDetails);

    /**
     * Deletes a training based on its ID.
     *
     * @param trainingId the ID of the training to be deleted
     */
    void deleteTraining(Long trainingId);

    /**
     * Finds all finished trainings up to a specified finish date.
     *
     * @param finishDate the date by which trainings should have finished
     * @return a list of finished trainings
     */
    List<Training> findAllFinishedTrainings(Date finishDate);
}
