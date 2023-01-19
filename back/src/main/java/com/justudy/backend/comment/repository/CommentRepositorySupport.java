package com.justudy.backend.comment.repository;

import com.justudy.backend.comment.domain.CommentEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CommentRepositorySupport {
    List<CommentEntity> readAllComment(long id);

    Integer findByGroup(Long communitySeq);

    void updateChildNumber(Long sequence, Integer childNumber);

    Integer findByChildNumberSum(Integer group);

    Integer findByMaxStep(Integer group);

    void updateOrderPlus(Integer group, int i);
}
