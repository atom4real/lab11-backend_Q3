package se331.rest.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.rest.entity.Bid;

import java.util.Optional;

public interface BidDao {
    Page<Bid> getBid(Pageable pageRequest);

    Optional<Bid> findById(Long id);
}
