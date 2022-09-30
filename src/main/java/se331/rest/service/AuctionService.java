package se331.rest.service;

import org.springframework.data.domain.Page;
import se331.rest.entity.AuctionItem;

public interface AuctionService {
    Integer getAuctionSize();

    Page<AuctionItem> getAuctions(Integer pageSize,Integer page);

    AuctionItem getAuction(Long id);

    AuctionItem save(AuctionItem save);
}
