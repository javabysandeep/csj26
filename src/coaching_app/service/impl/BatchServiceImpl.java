package coaching_app.service.impl;

import coaching_app.entities.Batch;
import coaching_app.entities.Student;
import coaching_app.service.BatchService;

import java.util.List;

public class BatchServiceImpl implements BatchService {
    @Override
    public boolean create(Batch batch) {
        return false;
    }

    @Override
    public boolean update(Batch batch) {
        return false;
    }

    @Override
    public Student delete(Integer batchId) {
        return null;
    }

    @Override
    public Student findById(Integer batchId) {
        return null;
    }

    @Override
    public List<Batch> findAll() {
        return null;
    }
}
