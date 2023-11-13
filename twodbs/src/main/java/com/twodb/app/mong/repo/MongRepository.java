package com.twodb.app.mong.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twodb.app.mong.Entity.MongEntity;
@Repository
public interface MongRepository extends JpaRepository<MongEntity, Long> {

}
