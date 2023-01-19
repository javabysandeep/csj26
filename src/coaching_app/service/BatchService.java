package coaching_app.service;

import coaching_app.entities.Batch;
import coaching_app.entities.Student;

import java.util.List;

public interface BatchService {
    boolean create(Batch batch);
    boolean update(Batch batch);
    Student delete(Integer batchId);
    Student findById(Integer batchId);
    List<Batch> findAll();

}
