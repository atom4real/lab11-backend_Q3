package se331.rest.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.rest.entity.AuctionItem;

public interface AuctionDao {
    Integer getAuctionSize();

    Page<AuctionItem> getAuctions(Integer pageSize,Integer page);

    AuctionItem getAuction(Long id);

    Page<AuctionItem>getAuction(String name, Pageable page);

    Page<AuctionItem>getAuction(Integer value, Pageable page);

    AuctionItem save(AuctionItem auctionItem);

}
