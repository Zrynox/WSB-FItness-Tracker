package com.capgemini.wsb.fitnesstracker.user.api;

/**
 * Interface (API) for modifying operations on {@link User} entities through the API.
 * Implementing classes are responsible for executing changes within a database transaction,
 * whether by continuing an existing transaction or creating a new one if required.
 */
public interface UserService {

    /**
     * Creates a new user in the database.
     *
     * @param user the user to be created
     * @return the created user
     */
    User createUser(User user);

    /**
     * Deletes a user from the database based on their ID.
     *
     * @param userId the ID of the user to be deleted
     */
    void deleteUser(Long userId);

}
