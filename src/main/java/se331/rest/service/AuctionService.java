package se331.rest.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.rest.entity.AuctionItem;

public interface AuctionService {
    Integer getAuctionSize();

    Page<AuctionItem> getAuctions(Integer pageSize,Integer page);

    AuctionItem getAuction(Long id);

    Page<AuctionItem> getAuctions(String description, Pageable pageable);

    Page<AuctionItem> getAuctions(Integer value, Pageable pageable);

    AuctionItem save(AuctionItem save);
}
