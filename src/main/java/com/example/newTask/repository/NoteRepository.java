/*package com.example.newTask.repository;

public class NoteRepository {*/













        package com.example.newTask.repository;
        import com.example.newTask.model.Note;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;
        import org.springframework.stereotype.Service;

        import java.util.List;

@Repository
@Service
public interface NoteRepository extends JpaRepository<Note, Long> {

}
