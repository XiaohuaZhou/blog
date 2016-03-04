package cn.edu.nuaa.burning.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cn.edu.nuaa.burning.model.Test;

/**
 * Created by yuchuan.
 */
@Repository
public interface TestDao extends MongoRepository<Test, String> {
    Test findTestById(String id);
}
