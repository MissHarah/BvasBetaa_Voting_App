package africa.semicolon.repositories;


import africa.semicolon.models.Party;

import java.util.List;

public interface PartyRepository {
    Party findById(String id);

    List<Party> findAll();

    Party save(Party party);

    void  deleteById(String id);
}
