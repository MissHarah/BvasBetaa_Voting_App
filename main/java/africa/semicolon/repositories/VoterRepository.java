package africa.semicolon.repositories;



import java.util.List;

public interface VoterRepository {
    VoterRepository findById(String id);

    List<VoterRepository> findAll();

    VoterRepository save(VoterRepository voterRepository);

    void  deleteById(String id);
}
