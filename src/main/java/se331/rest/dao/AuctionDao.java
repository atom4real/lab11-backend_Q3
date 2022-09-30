package se331.rest.dao;

import org.springframework.data.domain.Page;
import se331.rest.entity.AuctionItem;

public interface AuctionDao {
    Integer getAuctionSize();

    Page<AuctionItem> getAuctions(Integer pageSize,Integer page);

    AuctionItem getAuction(Long id);

    AuctionItem save(AuctionItem auctionItem);

}
