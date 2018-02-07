package com.groza.repository;

import com.groza.model.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * DemoRepository
 *
 * @author <a href="mailto:gzlin@coremail.cn">More</a>.
 */

public interface DemoRepository extends JpaRepository<DemoEntity, Long> {
}
