package se331.rest.service;

import org.springframework.data.domain.Page;
import se331.rest.entity.Bid;

import java.util.List;

public interface BidService {
    List<Bid> getAllBid();

    Page<Bid> getBid(Integer page, Integer pageSize);
}
