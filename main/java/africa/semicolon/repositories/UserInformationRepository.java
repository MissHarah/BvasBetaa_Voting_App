package africa.semicolon.repositories;

import africa.semicolon.models.UserInformation;

import java.util.List;

public interface UserInformationRepository {
    UserInformation findById(String id);

    List<UserInformation> findAll();

    UserInformation save(UserInformation userInformation);

    void  deleteById(String id);
}
