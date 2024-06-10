package com.capgemini.wsb.fitnesstracker.training.api;

import com.capgemini.wsb.fitnesstracker.training.internal.ActivityType;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface TrainingProvider {
    List<Training> findTrainingsByUserId(Long userId);

    List<Training> findAllTrainings();

    List<Training> findMyTrainings();

    /**
     * Creates a training in DB
     * @param training training to be added
     * @return created training
     */
    Training createTraining(Training training);

    /**
     * Retrieves a training based on their ID.
     * If the user with given ID is not found, then {@link Optional#empty()} will be returned.
     *
     * @param trainingId id of the training to be searched
     * @return An {@link Optional} containing the located Training, or {@link Optional#empty()} if not found
     */
    Optional<Training> getTraining(
            Long trainingId
    );

    Training addTraining(
            Training training
    );
    List<Training> getAllFinishTrainings(
            Date finishData
    );
    List<Training> getAllTrainingTypes(
            ActivityType activity
    );

    Training updateTraining(Long trainingId, Training trainingDetails);

    void deleteTraining(Long trainingId);

    List<Training> findAllFinishedTrainings(Date finishDate);
}